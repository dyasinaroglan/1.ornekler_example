package Classes.Exception.TryCatch;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowExample1 {

    public void readTextFile() throws FileNotFoundException {
        FileReader file = new FileReader("File1.txt");
    }

    public void readFile() throws FileNotFoundException {
        readTextFile();
    }

    public static void main(String[] args) {
        ThrowExample1 throwsExample = new ThrowExample1();
        try {
            throwsExample.readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found");
        }
    }
}
