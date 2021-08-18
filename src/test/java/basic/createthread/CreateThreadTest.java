package basic.createthread;

import org.junit.Test;

public class CreateThreadTest {

    @Test
    public void test() {
        new ThreadStyle().start();
        new Thread(new RunnableStyle()).start();
    }
}
