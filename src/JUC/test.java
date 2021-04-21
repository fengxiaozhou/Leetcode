package JUC;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class test {

    public static void main(String[] args) {
        thing thing = new thing();
        proThread produceThread = new proThread(thing);
        couThread consumeThread = new couThread(thing);
        new Thread(produceThread).start();
        new Thread(consumeThread).start();
    }
}

class thing{
    private final static int MAX_NUM = 10 ;
    private static LinkedList<Object> things = new LinkedList<>();
    ReentrantLock lock  = new ReentrantLock();
    private Condition emptyCondition = lock.newCondition();
    private Condition fullCondition = lock.newCondition();

    public void pro()  {
        lock.lock();
        while(things.size()==1){
            System.out.println("生产满了，暂时无法生产");
            emptyCondition.signalAll();
            try {
                fullCondition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        things.add(new Object());
        System.out.println(Thread.currentThread().getName() + "生产产品，共有：" + things.size());
        lock.lock();
    }


    public void con(){
        lock.lock();
        while(things.size()==0){
            System.out.println("空了需要生产：");
            fullCondition.signalAll();
            try {
                emptyCondition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        things.remove();
        System.out.println(Thread.currentThread().getName() + "消费产品，共有：" + things.size());
        lock.lock();
    }
}

class proThread implements Runnable{
    private thing resource;

    public proThread(thing resource){
        this.resource = resource;
    }

    public void run() {
        for(;;)
            resource.pro();
    }
}


class couThread implements Runnable{
    private thing resource;

    public couThread(thing resource){
        this.resource = resource;
    }

    public void run() {
        for(;;)
            resource.con();
    }
}