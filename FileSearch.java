import java.io.File;
import java.io.FilenameFilter;

public class FileSearch {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\Student\\IdeaProjects\\JavaExample\\src");
        String extension = ".txt";

        if(dir.exists() && dir.isDirectory()) {
            FilenameFilter fileNameFilter = (dir1, name) -> name.endsWith(extension);

            File[] files = dir.listFiles(fileNameFilter);

            assert files != null;
            for(File file : files) {
                System.out.println(file.getPath());
            }
        } else {
            System.out.println(dir + " is not a directory");
        }
    }
}
