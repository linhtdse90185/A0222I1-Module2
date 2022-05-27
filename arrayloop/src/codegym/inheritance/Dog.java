package codegym.inheritance;

public class Dog extends Animal{
    public String name;
    public String voice;

    public Dog() {
    }

    public Dog(String voice) {
        this.voice = voice;
    }

    public Dog(String name, boolean sex, float height, float weight, String voice) {
        super(name, sex, height, weight);
        this.voice = voice;
    }

    @Override
    public void eat() {
        System.out.println("Dog eat ...");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "voice='" + voice + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
