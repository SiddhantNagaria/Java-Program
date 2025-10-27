//Multi-Processing ->  (process based multiTasking) -
//  - executing multiple task simultaneously, where each task is  a separate independent process or program
//  - each process has its own memory space (JVM Instance).

//Multi-Threading -> (Thread based multi Tasking) -
//  - executing multiple task simultaneously, where each task is separate independent part of the same process or program.
//  - running multiple threads within same process (same JVM) - all threads share the same memory.

//Thread ->
//  A smaller unit inside a process or a lightweight sub process.
//  All threads of the same process share the same memory and resources.
//  Threads are independent, if an exception occurs in one thread, it doesn't affect other thread.
//  Ex -> In chrome , in one process -> one thread handle UI, other load a web page, other play a video.

//Process ->
//  it is an independent program in execution.
//  Every process has its own memory space (RAM), own variables , files and resources.
//  Process don't share memory  directly with each other.
//  ex -> Chrome browser running - 1 process & VS Code running - another process.

//Thread Life Cycle ->
//  New - Runnable - Running - waiting/ sleeping - terminated.

//2 ways to create a thread-
//  A - extends Thread class
//  B - implements Runnable Interface


//Thread Synchronization ->
//  Synchronization - is a process that allow only one thread to access shared resource at a time,
//      if multiple threads trying to access shared resources.
//  "Synchronized" is a access modifier applicable only for methods and blocks but not for classes and variables.
//  If a method declared as synchronized then at a time,  only one thread is allowed to execute that method on a given object
//      so that data inconsistency is resolved.
//It prevents deadlock.


//Types of synchronization -
//1. Full method synchronized
//2. Static Synchronization
//3.  Critical Section Synchronization
// this block synchronization

//InterThreaded Communication ->
//  A mechanism by which one thread communicate with another thread by using
//      notify(), wait(), notifyAll()

//Producer Consumer Problem in MultiThreading


//Thread Priorities -
//  - Every thread in Java has a priority number (1–10) that tells the JVM scheduler how important that thread is.
//  - But priority is just a request, not a guarantee!

// 3 priorities
//  1. min -1
//  2. normal - 5
//  3. max - 10

//Thread methods-
//start(), run(), wait(), notify(), notifyAll(), yield(), join(), stop()
// sleep() v/s wait()


package Multi_Threading;

//You create a subclass of Thread and override its run() method.
//Then you start it using .start() method

class MyThread extends Thread {

    @Override
    //it is called by start method
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("Full stack");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class MultiThreading {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();

        //Starts the thread - It invokes the run method on this thread object.
        thread1.start();

        //normal run method
//        thread1.run();
    }
}
