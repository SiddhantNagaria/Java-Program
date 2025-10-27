//3. Block (Critical Section) Synchronization
//Concept:
//  Instead of synchronizing the whole method,
//  you can synchronize only a small part (critical section) of code where shared data is accessed.
//  This improves performance by allowing non-critical parts to run in parallel.

package Multi_Threading.Thread_Synchronization.Types;

class Display {
    void wish(String name) {

        // Non-critical code (not synchronized)
        System.out.println("Preparing to greet...");

        // Critical Section
        synchronized (this) {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Good Morning: " + name);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        // Non-critical code (not synchronized)
        System.out.println("Greeting finished for " + name);
    }
}

class MyThread extends Thread {
    Display d;
    String name;

    MyThread(Display d, String name) {
        this.d = d;
        this.name = name;
    }

    public void run() {
        d.wish(name);
    }
}

public class CriticalSection_Synchronization {
    public static void main(String[] args) {
        Display obj = new Display();
        MyThread t1 = new MyThread(obj, "Siddhant");
        MyThread t2 = new MyThread(obj, "Rohit");

        t1.start();
        t2.start();
    }
}
