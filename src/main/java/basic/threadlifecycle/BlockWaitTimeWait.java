package basic.threadlifecycle;
/*
*  先执行的线程获得synchronized修饰的monitor锁，另一个线程进入BLOCKED状态
*  先执行的线程执行sleep进入WAIT状态
* */
public class BlockWaitTimeWait implements Runnable{

    public static void main(String[] args) {
        BlockWaitTimeWait runnable = new BlockWaitTimeWait();
        Thread thread1 = new Thread(runnable);
        thread1.start();
        Thread thread2 = new Thread(runnable);
        thread2.start();
        System.out.println(thread1.getState());
        System.out.println(thread2.getState());
    }

    public void run() {
        syn();
    }

    public synchronized void syn() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
