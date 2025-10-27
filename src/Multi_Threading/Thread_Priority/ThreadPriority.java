//Thread Priorities -
//  - Every thread in Java has a priority number (1–10) that tells the JVM scheduler how important that thread is.
//  - But priority is just a request, not a guarantee!


package Multi_Threading.Thread_Priority;

class Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 1 : i = " + i);
        }
        System.out.println("Thread 1 is in terminated state");
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("Thread 2 : i = " + j);
        }
        System.out.println("Thread 2 is in terminated state");
    }
}

class Thread3 extends Thread {
    @Override
    public void run() {
        for (int k = 1; k <= 5; k++) {
            System.out.println("Thread 3 : i = " + k);
        }
        System.out.println("Thread 3 is in terminated state");
    }
}


public class ThreadPriority {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();
        t1.setPriority(Thread.MIN_PRIORITY);   // 1
        t2.setPriority(Thread.NORM_PRIORITY);  // 5
        t3.setPriority(Thread.MAX_PRIORITY);   // 10
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());
        t1.start();
        t2.start();
        t3.start();
    }
}
