class newthread extends Thread {
    Thread t1;
    Thread t2;

    newthread() {
        // super("New Thread");
        t1 = new Thread(this, "Thread_1");
        t2 = new Thread(this, "Thread_2");
        t1.start();
        t2.start();
    }

    public void run() {
        if (Thread.currentThread().getName().equals("Thread_2")) {
            t2.setPriority(Thread.MAX_PRIORITY);
        }
        // System.out.println("Thread " + Thread.currentThread().getName() + " is running.");
        System.out.println("Thread 1 equals Thread 2: " + t1.equals(t2));
    }
}

class multithreaded_programing {
    public static void main(String args[]) {
        new newthread();
    }
}
