package Task5.Program2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmptyList {
    public static void main(String[] args) {
        // List of strings with some empty strings as input
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        // Filter non-empty strings using filter() method
        List<String> nonEmpty = strings.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());

        // Print the input list
        System.out.println(strings);
        // Print the non-empty strings
        System.out.println(nonEmpty);
    }
}
