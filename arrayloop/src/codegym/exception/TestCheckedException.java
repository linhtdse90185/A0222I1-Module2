package codegym.exception;

import java.io.*;

public class TestCheckedException {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("test.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Done");

        try {
            exampleThrownEx3();
            exampleThrownEx4();
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static void exampleThrownEx1() {
        try {
            FileReader reader = new FileReader("test.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void exampleThrownEx2() {
        try {
            FileReader reader = new FileReader("test.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void exampleThrownEx3() throws FileNotFoundException {
        FileReader reader = new FileReader("test.txt");
    }

    public static void exampleThrownEx4() throws FileNotFoundException {
        FileReader reader = new FileReader("test.txt");
    }
}
