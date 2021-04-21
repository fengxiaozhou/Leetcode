package JUC;

import com.sun.corba.se.impl.orbutil.concurrent.Sync;
import com.sun.source.tree.SynchronizedTree;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class MyThread extends Thread implements Runnable {

    private static final Object lock = new Object();

    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread() + "_" + i);
                if (i == 5) {
                    System.out.println("5的时候已经让出时间片了");
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread());
        MyThread myThread = new MyThread();
        myThread.start();
        Thread.sleep(10000L);
        synchronized (lock) {
            for (int i = 0; i < 10; i++) {
                System.out.println("主线程" + "_" + i);
                if(i==5){
                    myThread.join();
                }
            }
        }
    }
}


