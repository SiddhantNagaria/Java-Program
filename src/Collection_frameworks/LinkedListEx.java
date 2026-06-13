package Collection_frameworks;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("d");
        System.out.println(list);

        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String str = (String) it.next();
            System.out.println(str);
        }
        System.out.println();

        list.forEach(name-> System.out.println(name));
        System.out.println();

        list.forEach(System.out::println);
    }
}
