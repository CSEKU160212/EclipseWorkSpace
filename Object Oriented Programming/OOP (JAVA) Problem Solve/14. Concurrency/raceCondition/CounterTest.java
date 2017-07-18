public class CounterTest {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new CounterIncThread());
        thread1.setName("add thread");
        thread1.start();

        Thread thread2 = new Thread(new CounterDecThread());
        thread2.setName("sub thread");
        thread2.start();

        Thread thread3 = new Thread(new CounterIncThread());
        thread3.setName("add thread2");
        thread3.start();
    }

}

