package Collection_frameworks;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("Siddhant");
        set.add("Rahul");
        set.add("Ajay");
        //set.add(null);
        set.add("111");
        set.add("11");
        set.add("Deepak");
        set.add("Rohit");
        set.add("Sahil");

        set.forEach(System.out::println);
    }
}
