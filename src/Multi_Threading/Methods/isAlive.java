package Multi_Threading.Methods;

class MyThreads extends Thread {
    @Override
    public void run() {
        System.out.println("r1");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class isAlive {
    public static void main(String[] args) {
        MyThreads t1 = new MyThreads();
        MyThreads t2 = new MyThreads();
        t1.start();
        t2.start();
        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());
    }
}
