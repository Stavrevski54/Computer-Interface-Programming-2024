import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineCounter {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\Student\\IdeaProjects\\JavaExample\\src\\content.txt";
        int lineCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (reader.readLine() != null) {
                lineCount++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("The file " + fileName + " has " + lineCount + " lines.");
    }
}
