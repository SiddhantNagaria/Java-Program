package Multi_Threading;


//YOu implement the Runnable interface (which has only one method : run()).
//then you pass an object of your class to a Thread object.
class ImplThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("FUll stack");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Thread_Impl_Runnable {
    public static void main(String[] args) {
        ImplThread implThread = new ImplThread();
        Thread t1 = new Thread(implThread); //pass runnable to thread

        //start method invokes the run method
        t1.start();

        //implThread.run();
    }
}
