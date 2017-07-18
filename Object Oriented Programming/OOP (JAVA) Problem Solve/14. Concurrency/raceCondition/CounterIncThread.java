class CounterIncThread implements Runnable {
    public void run() {
        SynchronizedCounter counter = new SynchronizedCounter();
        counter.increment();
        /*try {
            //Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        String threadName =
                Thread.currentThread().getName();
        System.out.println(threadName+ ": "+counter.value());
    }
}

