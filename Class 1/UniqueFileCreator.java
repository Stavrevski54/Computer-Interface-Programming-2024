import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;

public class UniqueFileCreator {
    public static void main(String[] args) {
        String fileName = "uniqueFile_" + Instant.now().getEpochSecond() + ".txt";
        File file = new File(fileName);

        if (file.exists()) {
            System.out.println("File already exists.");
        } else {
            try {
                if (file.createNewFile()) {
                    System.out.println("File created: " + file.getName());
                    System.out.println("Absolute path: " + file.getAbsolutePath());
                    Path pathAbsolute = Paths.get(file.getAbsolutePath());
                    Path pathBase = Paths.get(file.getAbsolutePath()).getParent();
                    Path pathRelative = pathBase.relativize(pathAbsolute);
                    System.out.println("Relative path: " + pathRelative);
                    System.out.println("Can read: " + file.canRead());
                    System.out.println("Can write: " + file.canWrite());
                    System.out.println("Parent folder: " + file.getParent());
                } else {
                    System.out.println("File creation failed.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }
}
