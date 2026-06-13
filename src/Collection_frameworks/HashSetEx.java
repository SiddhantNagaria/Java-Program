package Collection_frameworks;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String>set = new HashSet<>();
        set.add("Siddhant");
        set.add("Rahul");
        set.add("Ajay");
        set.add(null);
        set.add("Deepak");
        set.add("Rohit");
        set.add("Sahil");
        set.add(null);

        set.forEach(System.out::println);

    }
}
