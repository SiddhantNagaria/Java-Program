//  "Synchronized" is a access modifier applicable only for methods and blocks but not for classes and variables.
//  If a method declared as synchronized then at a time,  only one thread is allowed to execute that method on a given object
//      so that data inconsistency is resolved.
// Thread synchronization does not offer that threads will execute in order.

package Multi_Threading.Thread_Synchronization;

class Table {
    //synchronized method -> one thread executes at a time -> no deadlock
    //  -> no one
    public synchronized void printTable(int n) {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(i * n);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread1 extends Thread {
    Table table;

    public MyThread1(Table table) {
        this.table = table;
    }

    @Override
    public void run() {
        table.printTable(5);
    }
}

class MyThread2 extends Thread {
    Table table;

    public MyThread2(Table table) {
        this.table = table;
    }

    @Override
    public void run() {
        table.printTable(100);
    }
}


class MyThread3 extends Thread {
    Table table;

    public MyThread3(Table table) {
        this.table = table;
    }

    @Override
    public void run() {
        table.printTable(10000);
    }
}


public class ThreadSynchronization {
    public static void main(String[] args) {
        Table table = new Table();
        MyThread1 mt1 = new MyThread1(table);
        MyThread2 mt2 = new MyThread2(table);
        MyThread3 mt3 = new MyThread3(table);

        mt1.start();
        mt2.start();
        mt3.start();
    }
}
