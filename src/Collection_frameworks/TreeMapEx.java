package Collection_frameworks;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<String, String>();

        map.put("id", "121");
        map.put("name", "siddhant");
        map.put("age", "23");
        //map.put(null, "abc");
        //map.put(null, "qwerty");
        map.put("address", null);
        map.put("phone", null);
        map.put("11","abc");


        map.entrySet().stream().forEach(System.out::println);
    }
}
