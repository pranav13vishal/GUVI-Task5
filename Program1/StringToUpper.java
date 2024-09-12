package Task5.Program1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToUpper {

    public static void main(String[] args) {
        // List of strings
        List<String> names = Arrays.asList("aBc", "d", "ef");

        // Convert each string to uppercase using map() and collect the result as a list
        List<String> upperCaseName = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(names);
        // Printing the converted list
        System.out.println(upperCaseName);

    }
}


