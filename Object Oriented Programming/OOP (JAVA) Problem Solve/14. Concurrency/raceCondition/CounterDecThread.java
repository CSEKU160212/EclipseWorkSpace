class CounterDecThread implements Runnable {
    public void run() {
        SynchronizedCounter counter = new SynchronizedCounter();
        counter.decrement();
        String threadName =
                Thread.currentThread().getName();
        System.out.println(threadName+ ": "+counter.value());
    }
}

