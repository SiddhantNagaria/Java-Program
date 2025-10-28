package Multi_Threading.Producer_Consumer_Problem;

import java.util.LinkedList;

class SharedBuffer {
    private final LinkedList<Integer> list = new LinkedList<>();
    private final int CAPACITY = 3;

    // Producer adds item
    public synchronized void produce(int value) throws InterruptedException {
        // if buffer full, wait
        while (list.size() == CAPACITY) {
            System.out.println("Buffer full. Producer waiting...");
            wait();
        }

        list.add(value);
        System.out.println("Produced: " + value);

        // notify consumer that item is available
        notify();
    }

    // Consumer removes item
    public synchronized void consume() throws InterruptedException {
        // if buffer empty, wait
        while (list.isEmpty()) {
            System.out.println("Buffer empty. Consumer waiting...");
            wait();
        }

        int value = list.removeFirst();
        System.out.println("Consumed: " + value);

        // notify producer that space is available
        notify();
    }
}
