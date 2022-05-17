package codegym;

import java.util.Scanner;

public class DemoArrayLoop {
    public static void main(String[] args) {
//        int array[];
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap vao so luong cua mang");
//        int n = scanner.nextInt();
//        array = new int[n];
//
////        for (int i = 0; i < array.length; i++) {
////            System.out.println("a[" + i + "] = ");
////            array[i] = scanner.nextInt();
////        }
//        array = new int[]{5, 2, 8, 9, 10};
//
//        System.out.println("Du lieu da nhap vao mang");
//        int i = 0;
//        while (i < array.length) {
//            System.out.printf("%5d", array[i++]);
//        }
//        System.out.println(array);


        // Break with label
        int i = 0;
        stop:
        while (true) {
            System.out.println("i = " +  i);
            int j = i;
            while (true) {
                System.out.println("j = " + j);
                if (j - i >= 1) {
                    break stop;
                }
                j++;
            }
//            if (i == 3) {
//                break;
//            }
//            i++;
        }
    }
}
