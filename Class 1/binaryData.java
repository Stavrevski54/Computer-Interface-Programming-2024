import java.io.*;
import java.util.Arrays;

public class binaryData {
    public static void main(String[] args) {
        byte[] dataToWrite = {1, 2, 3, 4, 5};
        String fileName = "binaryData.bin";

        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            fos.write(dataToWrite);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        try (FileInputStream fis = new FileInputStream(fileName)) {
            byte[] dataRead = fis.readAllBytes();
            System.out.println("Data read from file: " + Arrays.toString(dataRead));
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
