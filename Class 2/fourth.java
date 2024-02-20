import java.net.URL;
import java.net.URLConnection;

public class fourth {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://uacs.edu.mk/home/home/");

            System.out.println("Authority: " + url.getAuthority());
            System.out.println("Default Port: " + url.getDefaultPort());
            System.out.println("File: " + url.getFile());
            System.out.println("Host: " + url.getHost());
            System.out.println("Path: " + url.getPath());
            System.out.println("Port: " + url.getPort());
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Query: " + url.getQuery());
            System.out.println("URL: " + url.toString());

            URLConnection connection = url.openConnection();
            Object content = connection.getContent();
            System.out.println("Content: " + content.toString());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
