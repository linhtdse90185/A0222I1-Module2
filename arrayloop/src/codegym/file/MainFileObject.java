package codegym.file;

import java.util.ArrayList;
import java.util.List;

public class MainFileObject {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Long", 18, "A0222I1", true));
        students.add(new Student("Tu", 19, "A0222I1", true));
        students.add(new Student("Duyet", 21, "A0222I2", true));
        students.add(new Student("Thanh", 20, "A0222I2", false));

//        FileUtils.writeObjectFile(students, "student.dat");

        List<Student> result = FileUtils.readObjectFile("student.dat");
        result.stream().forEach(System.out::println);
    }
}
