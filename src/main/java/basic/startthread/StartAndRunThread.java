package basic.startthread;

public class StartAndRunThread {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        runnable.run();
        new Thread(runnable).start();
    }
}
