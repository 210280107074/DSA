import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.149.211", 1234);
        System.out.println("Connected to server on port 1234");

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        // Send a message to the server
        out.println("Dhruvil");

        // Read the response from the server
        String response = in.readLine();
        System.out.println("Received response from server: " + response);

        // Close the streams and socket
        in.close();
        out.close();
        socket.close();
    }
}