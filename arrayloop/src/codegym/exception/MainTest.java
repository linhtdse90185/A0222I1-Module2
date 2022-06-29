package codegym.exception;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so a:");;
        int a = scanner.nextInt();
        System.out.println("Nhap vao so b:");
        int b = scanner.nextInt();

        try {
            divide(a, b);
        } catch (DivideByZeroException e) {
            System.out.println(e.getMessage());;
        }
    }

    public static float divide(int a, int b) throws DivideByZeroException {
        if (b == 0) {
            throw new DivideByZeroException("Khong the chia cho 0");
        }

        return a/b*1.0f;
    }
}
