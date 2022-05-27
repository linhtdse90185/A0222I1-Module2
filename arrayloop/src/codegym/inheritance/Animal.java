package codegym.inheritance;

public class Animal {
    public String name;
    public boolean sex;
    public float height;
    public float weight;

    public Animal() {
    }

    public Animal(String name, boolean sex, float height, float weight) {
        this.name = name;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
    }

    public void eat() {
        System.out.println("Eat");
    }

}
