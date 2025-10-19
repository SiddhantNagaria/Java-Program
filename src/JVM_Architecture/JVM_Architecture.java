package JVM_Architecture;

public class JVM_Architecture {
    public static void main(String[] args) {
        // JVM
        // JVM Language CLasses -> CLass Loader
        // Class Loader -> JVM Memory ->
        // 1. Method Area
        // 2. Heap
        // 3. JVM Language Stacks
        // 4. PC Register
        // 5. Native Method stacks

        // JVM MEmory ->
        // Execution Engine
        // Native methods interface
        // Native Method Libraries

        // Method area ->
        // stores class-level metadata such as-
        // 1. Class structure (fields, methods, and constructors)
        // 2. Static variables
        // 3. Constant pool - String literals and constants
        // 4. Method ByteCode
        // This area is shared across all threads and is part of the Heap

        // Heap MEmory -
        // The heap is used for dynamic memory allocation and stores :
        //  1. Objects and their instance variables
        //  2. JIT-optimized code

        // The garbage collector manages memory cleanup in the heap.

        // Stack Memory -
        // Each thread has its own JVM Stack, which stores :
        // 1. Method call frames (for every method call// )
        // 2. Local variables and method parameters
        // 3. Partial results amd return addresses

        // Program Counter (PC) Register -
        // The PC Register holds the address of the current instruction being executed in a thread.
        // Each thread has its own PC Register (since JVM Is a multi-threaded).

        // Native method stack
        // This stack is used for native (non-Java) methods, written in languages like C or C++.
        //It stores -
        // Native method calls
        // Native libraries and their execution details

    }
    }
