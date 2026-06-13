package Collection_frameworks;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("id", null);
        map.put("name", "siddhant");
        map.put("age", "23");
        map.put(null, "abc");
        map.put(null, "qwerty");

        for (Map.Entry<String, String> m : map.entrySet()) {
            System.out.println(m.getKey() + " : " + m.getValue());
        }
        System.out.println();

        map.entrySet().stream().forEach(System.out::println);
    }
}
