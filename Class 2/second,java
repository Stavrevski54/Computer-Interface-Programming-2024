import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class second {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the host address:");
            String host = reader.readLine();

            InetAddress inetAddress = InetAddress.getByName(host);
            String hostAddress = inetAddress.getHostAddress();
            String canonicalHostName = inetAddress.getCanonicalHostName();
            boolean isReachable = inetAddress.isReachable(5000);

            System.out.println("Host Address: " + hostAddress);
            System.out.println("Canonical Host Name: " + canonicalHostName);
            System.out.println("Is Reachable in 5 seconds: " + isReachable);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
