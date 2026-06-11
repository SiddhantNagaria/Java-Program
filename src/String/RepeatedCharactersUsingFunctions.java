package String;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedCharactersUsingFunctions {
    public static void main(String[] args) {
        String name = "Naman";

        // Convert to lowercase -> convert to IntStream -> convert to Character Stream
        // Group same characters together and count their occurrences
        Map<Character, Long> counterMap = name.toLowerCase().chars().mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(counterMap);

        counterMap.forEach((k, v) -> {
            if (v > 1) {
                System.out.println(k + " " + v);
            }
        });

        // Another approach using Stream API:
        // Convert map entries into stream
        // Filter entries having count > 1
        // Print repeated characters with their frequency
        counterMap.entrySet().stream().filter(v -> v.getValue() > 1)
                .forEach(System.out::println);
    }
}
