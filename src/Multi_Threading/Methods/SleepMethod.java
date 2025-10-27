package Multi_Threading.Methods;

class Sleep extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}

public class SleepMethod {
    public static void main(String[] args) {
        Sleep t1 = new Sleep();
        Sleep t2 = new Sleep();
        t1.start();
        t2.start();
    }
}
