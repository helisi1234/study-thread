package basic.threadcommnd;

public class ThreadCommnd {
    public static void main(String[] args) {
        Thread thread = new Thread();
        System.out.println("=====main=====");
        System.out.println("线程名:" + Thread.currentThread().getName());
        System.out.println("线程ID:" + Thread.currentThread().getId());
        System.out.println("优先级:" + Thread.currentThread().getPriority());
        System.out.println("====thread====");
        System.out.println("线程名:" + thread.getName());
        System.out.println("线程ID:" + thread.getId());
        System.out.println("优先级:" + thread.getPriority());
    }
}
