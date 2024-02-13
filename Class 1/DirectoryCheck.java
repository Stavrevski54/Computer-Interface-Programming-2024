import java.io.File;

public class DirectoryCheck {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\Student\\IdeaProjects\\JavaExample\\src");

        if(dir.exists() && dir.isDirectory()) {
            if(dir.list().length > 0) {
                System.out.println("The directory " + dir + " is not empty.");
            } else {
                System.out.println("The directory " + dir + " is empty.");
            }
        } else {
            System.out.println(dir + " is not a directory");
        }
    }
}
