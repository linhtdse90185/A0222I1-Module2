package codegym.oop;

public class Student {
    private String name;
    private int age;

    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Student getStudent(String name, int age) {
        return new Student(name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
