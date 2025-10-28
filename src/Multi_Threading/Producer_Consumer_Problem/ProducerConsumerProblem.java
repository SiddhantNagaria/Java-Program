//Producer-Consumer Problem  ->
//thread synchronization, inter-thread communication (wait, notify),
// and shared resource management.

//1. Problem Statement
//Two types of threads share a common resource (like a queue or buffer):
//  Producer -> produces data items and puts them into the buffer
//  Consumer -> takes data items out of the buffer and uses them
// But:
//If the buffer is full, producer must wait
//If the buffer is empty, consumer must wait
//So, both must coordinate to avoid:
//Overfilling the buffer
//Reading from an empty buffer
//Data inconsistency (race conditions)


package Multi_Threading.Producer_Consumer_Problem;

public class ProducerConsumerProblem {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();

        Producer p = new Producer(buffer);
        Consumer c = new Consumer(buffer);

        p.start();
        c.start();
    }
}
