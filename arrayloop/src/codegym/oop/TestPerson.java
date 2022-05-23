package codegym.oop;

public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Duyet");
        p1.setAge(8);

        Person p2 = new Person("Anh", 18);
        Person p3 = new Person("Thao", 18, false);

        System.out.println("Name: " + p3.getName());
        System.out.println("Age: " + p3.getAge());
        System.out.println("Sex: " + (p3.isSex() ?"Male": "Female"));

        Student st1 = Student.getStudent("Duyet", 8);
        System.out.println("Name: " + st1.getName());
        System.out.println("Age: " + st1.getAge());
    }
}
