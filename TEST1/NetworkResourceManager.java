import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class NetworkResourceManager {
    public static void main(String[] args) {
        String url = "https://uacs.edu.mk/home/";
        String urlTwo = "http://google.com";
        String urlThree = "http:time.mk";
        String fileName = "downloaded_content.txt";
        String reportFileName = "summary_report.txt";

        try {
            InetAddress address = InetAddress.getByName(urlThree);
            System.out.println("IP Address: " + address.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("Could not find IP address for: " + urlThree);
        }

        try {
            downloadContent(url, fileName);
            System.out.println("Completed successfully");
        } catch (IOException e) {
            System.out.println("An error occurred");
        }
    }

    private static void downloadContent(String url, String fileName) throws IOException {
        URL urlObject = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) urlObject.openConnection();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } finally {
            connection.disconnect();
        }
    }

    // I don't know about the summary_report.txt and don't know why it only catches the statement for downloading
}
