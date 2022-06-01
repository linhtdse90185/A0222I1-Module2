package codegym.abstract_interface;

public class Bird extends Animal implements Flyable {
    @Override
    public void eat() {
        System.out.println("Bird eat");
    }

    @Override
    public void fly() {
        System.out.println("Bird can fly");
    }
}
