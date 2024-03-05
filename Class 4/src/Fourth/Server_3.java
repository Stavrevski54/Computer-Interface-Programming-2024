import java.io.*;
import java.net.*;

public class Server_3 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(5000);
        System.out.println("Server is running...");

        while (true) {
            Socket socket = serverSocket.accept();
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            int n = dis.readInt();
            int min = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                int num = dis.readInt();
                min = Math.min(min, num);
            }

            dos.writeInt(min);
            socket.close();
        }
    }
}
