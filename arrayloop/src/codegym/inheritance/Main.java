package codegym.inheritance;

public class Main {
    public static void main(String[] args) {
//        Dog dog = new Dog("Tom", false, 0.5f, 3.5f, "bark");
//        System.out.println(dog);
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
//        animal1.eat();
//        animal2.eat();
        Animal[] animals = {animal1, animal2};
        for (Animal a : animals) {
            a.eat();
            if (a instanceof Dog) {
                System.out.println(((Dog) a).voice);
            }
        }
    }
}
