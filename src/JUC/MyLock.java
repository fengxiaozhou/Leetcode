package JUC;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyLock {

    public static void main(String []args){
        Resource resource = new Resource();
        ProduceThread produceThread = new ProduceThread(resource);
        ConsumeThread consumeThread = new ConsumeThread(resource);
        //四个生产者
        new Thread(produceThread).start();
        //四个消费者
        new Thread(consumeThread).start();
        new Thread(consumeThread).start();
        new Thread(consumeThread).start();
        new Thread(consumeThread).start();
    }
}
class Resource{
    private final int MAX_SIZE = 10;
    private LinkedList<Object> list = new LinkedList<Object>();
    private Lock lock = new ReentrantLock();
    private Condition fullCondition = lock.newCondition();   //变满
    private Condition emptyCondition = lock.newCondition();  //变空

    /**
     * 生产物品
     */
    public void produce(){
        //如果生产满了，则就唤醒消费者
        lock.lock();
        while(list.size() == MAX_SIZE){
            System.out.println("生产满了，暂时无法生产：" + list.size());
            emptyCondition.signalAll();
            try {
                fullCondition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        list.add(new Object());
        System.out.println(Thread.currentThread().getName() + "生产新产品，共有：" + list.size());
        lock.unlock();
    }

    /**
     * 消费者
     */
    public void consume(){
        lock.lock();
        while(list.size() == 0){
            System.out.println("没有物品了，需要通知生产了");
            fullCondition.signalAll();
            try {
                emptyCondition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + "消费产品，共有：" + list.size());
        list.remove();
        lock.unlock();
    }
}

class ProduceThread implements Runnable{
    private Resource resource;

    public ProduceThread(Resource resource){
        this.resource = resource;
    }

    public void run() {
        for(;;)
            resource.produce();
    }
}

class ConsumeThread implements Runnable{
    private Resource resource;

    public ConsumeThread(Resource resource){
        this.resource = resource;
    }

    public void run() {
        for(;;)
            resource.consume();
    }
}
