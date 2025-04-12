package functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student{name='" + name + "'}";
    }
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Wajahat", "Ali", "Zohab");

      List<Student> student=  names.stream().map(Student::new).collect(Collectors.toList());
      student.forEach(System.out::println);
    }
}
