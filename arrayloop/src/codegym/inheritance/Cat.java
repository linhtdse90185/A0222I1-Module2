package codegym.inheritance;

public class Cat extends Animal {
    public String name;
    public float highJump;

    @Override
    public void eat() {
        System.out.println("Cat eat ...");
    }
}
