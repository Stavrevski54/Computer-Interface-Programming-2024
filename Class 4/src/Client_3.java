import java.io.*;
import java.net.*;

public class Client_3 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 5000);
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        DataInputStream dis = new DataInputStream(socket.getInputStream());

        int[] numbers = {10, 20, 30, 40, 50};
        dos.writeInt(numbers.length);

        for (int num : numbers) {
            dos.writeInt(num);
        }

        int min = dis.readInt();
        System.out.println("The smallest number is: " + min);

        socket.close();
    }
}