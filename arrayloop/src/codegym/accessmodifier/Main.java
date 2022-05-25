package codegym.accessmodifier;

public class Main {
    public static void main(String[] args) {
        System.out.println(DemoStatic.c);
        DemoStatic demo1 = new DemoStatic();
        demo1.a = 2;
        demo1.b = 3;
//        demo1.c = 4;

        DemoStatic demo2 = new DemoStatic();
        demo2.a = 5;
        demo2.b = 6;
//        demo2.c = 7;

//        DemoStatic.c = 10;
        System.out.println("Demo 1: " + demo1.a + " " + demo1.b + " " + demo1.c);
        System.out.println("Demo 2: " + demo2.a + " " + demo2.b + " " + demo2.c);
        System.out.println("Demo: " + DemoStatic.c);
    }
}
