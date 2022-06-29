package codegym.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchTest {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        try {
            reader = new FileReader("test.txt");
            reader.read();
            reader.read();
            reader.read();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
