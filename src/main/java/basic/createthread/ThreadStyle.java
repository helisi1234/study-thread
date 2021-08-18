package basic.createthread;

public class ThreadStyle extends Thread{
    @Override
    public void run() {
        System.out.println("使用thread方式创建子线程");
    }
}
