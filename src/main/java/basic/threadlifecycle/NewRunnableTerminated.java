package basic.threadlifecycle;

public class NewRunnableTerminated implements Runnable{
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new NewRunnableTerminated());
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        Thread.sleep(10);
        System.out.println(thread.getState());
        thread.join();
        System.out.println(thread.getState());
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}
