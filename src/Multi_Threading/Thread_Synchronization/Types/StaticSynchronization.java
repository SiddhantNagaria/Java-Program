//2. Static Synchronization

//Concept:
//  When you synchronize a static method, the lock is on the class, not on a specific object.
//  Only one thread can access any synchronized static method of that class at a time.
//  This is useful when multiple threads access shared class-level data.

package Multi_Threading.Thread_Synchronization.Types;

class Bank {
    synchronized static void transaction(String customer) {
        for (int i = 1; i <= 3; i++) {
            System.out.println(customer + " is making transaction " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class CustomerThread extends Thread {
    public void run() {
        Bank.transaction(Thread.currentThread().getName());
    }
}

public class StaticSynchronization {
    public static void main(String[] args) {
        CustomerThread t1 = new CustomerThread();
        CustomerThread t2 = new CustomerThread();
        CustomerThread t3 = new CustomerThread();

        t1.setName("Alice");
        t2.setName("Bob");
        t3.setName("Charlie");

        t1.start();
        t2.start();
        t3.start();
    }
}
