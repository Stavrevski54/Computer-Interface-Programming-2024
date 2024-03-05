import java.io.*;
import java.net.*;

public class Client_2 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8080);
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            out.println(inputLine);

            if (inputLine.equals(".")) {
                break;
            }
        }

        out.close();
        in.close();
        socket.close();
    }
}
