package String;

public class Strings {
    /*


    1. String

    • Collection (sequence) of characters.
    • Immutable (cannot be modified after creation).
    • Stored in String Pool (when created using literals).
    • Every modification creates a new object.
    • Best for constant/read-only text.
    • Slower for frequent modifications.

    Example:
        String s = "Hello";
        s = s + " World";   // New object created

    -------------------------
    Important String Methods
    -------------------------

    length()              -> Returns length
    charAt(index)         -> Character at given index
    substring(start)
    substring(start,end)
    equals()
    equalsIgnoreCase()
    compareTo()
    compareToIgnoreCase()
    contains()
    startsWith()
    endsWith()
    indexOf()
    lastIndexOf()
    replace()
    replaceAll()
    toUpperCase()
    toLowerCase()
    trim()
    split()
    concat()
    isEmpty()
    valueOf()
    toCharArray()


    ============================================================
    2. StringBuffer
    ============================================================

    • Mutable.
    • Thread Safe.
    • Synchronized.
    • Suitable for Multi-threaded applications.
    • Slower than StringBuilder.

    Example:
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");

    -------------------------------
    Important StringBuffer Methods
    -------------------------------

    append()
    insert()
    delete()
    deleteCharAt()
    replace()
    reverse()
    capacity()
    ensureCapacity()
    charAt()
    setCharAt()
    length()
    setLength()
    substring()
    indexOf()
    lastIndexOf()
    toString()


    ============================================================
    3. StringBuilder
    ============================================================

    • Mutable.
    • Not Thread Safe.
    • Not Synchronized.
    • Faster than StringBuffer.
    • Best for Single-threaded applications.
    • Preferred for frequent string manipulation.

    Example:
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");

    --------------------------------
    Important StringBuilder Methods
    --------------------------------

    append()
    insert()
    delete()
    deleteCharAt()
    replace()
    reverse()
    capacity()
    ensureCapacity()
    charAt()
    setCharAt()
    length()
    setLength()
    substring()
    indexOf()
    lastIndexOf()
    toString()


    ============================================================
                    QUICK INTERVIEW COMPARISON
    ============================================================

    Feature            String      StringBuffer     StringBuilder
    ----------------------------------------------------------------
    Mutable            No          Yes              Yes
    Immutable          Yes         No               No
    Thread Safe        No          Yes              No
    Synchronized       No          Yes              No
    Performance        Slow        Moderate         Fastest
    Memory             New object  Same object      Same object
                       on change   modified         modified
    Best Use           Constant    Multi-threaded   Single-threaded
                       text        applications     applications


    ============================================================
                    EASY TRICK TO REMEMBER
    ============================================================

    String
        -> Immutable

    StringBuffer
        -> Mutable + Thread Safe + Synchronized

    StringBuilder
        -> Mutable + Fast + Not Thread Safe


    ============================================================
                    IMPORTANT INTERVIEW QUESTIONS
    ============================================================

    Q1. Which is fastest?
        StringBuilder

    Q2. Which is thread-safe?
        StringBuffer

    Q3. Which is immutable?
        String

    Q4. Which creates a new object on modification?
        String

    Q5. Which should be used for frequent concatenation?
        StringBuilder

    Q6. Which should be used in multi-threaded programs?
        StringBuffer
    */

}
