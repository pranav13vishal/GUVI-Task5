package Task5.Program3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SpecialGiftStudents {
    public static void main(String[] args) {

        // Create a list of student names
        List<String> students = new ArrayList<>();
        students.add("Alice");
        students.add("Bob");
        students.add("Annie");
        students.add("John");
        students.add("Andrew");
        students.add("Michael");
        students.add("Ava");
        students.add("Sophia");
        students.add("Alex");
        students.add("Charlie");

        // Filter students whose names start with "A" using Stream API and lambda expression
        List<String> specialGiftStudents = students.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        // Output the students who will receive special gifts
        System.out.println("Students who will receive special gifts: " + specialGiftStudents);
    }
}
