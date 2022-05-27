package codegym.inheritance;

public class MathUtils {
    public int plus(int a, int b) {
        return a + b;
    }

    public float plus(float a, float b) {
        return a + b;
    }

    public int plus(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        MathUtils utils = new MathUtils();
        utils.plus(2,3);
        utils.plus(1,2,4);
        utils.plus(1f, 2f);
    }
}
