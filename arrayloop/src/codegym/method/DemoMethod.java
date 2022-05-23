package codegym.method;

import java.util.Scanner;

public class DemoMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = inputArray(scanner);
        int barr[] = inputArray(scanner);
        int [] c = new int[10];
        DemoMethod demoMethod = new DemoMethod();
        demoMethod.inputArray2(c, scanner);
        inputArray(scanner);
    }

    public static int[] inputArray(Scanner scanner) {
        int length = scanner.nextInt();
        int [] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public void inputArray2(int [] a, Scanner scanner) {
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
    }
}
