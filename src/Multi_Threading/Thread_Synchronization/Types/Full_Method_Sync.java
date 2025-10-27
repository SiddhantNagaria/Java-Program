//1. Full Method Synchronization
//  Concept:
//  When you declare a method as synchronized,only one thread can execute
//      that entire method on the same object at a time.
//  If one thread is inside the synchronized method, other threads trying to access it are blocked
//  until it finishes.

package Multi_Threading.Thread_Synchronization.Types;

class Table {
    synchronized void printTable(int n) {
        for (int i = 0; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread1 extends Thread {
    Table t;

    MyThread1(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

class MyThread2 extends Thread {
    Table t;

    MyThread2(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
    }
}

public class Full_Method_Sync {
    public static void main(String[] args) {
        Table obj = new Table();
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();

    }
}
