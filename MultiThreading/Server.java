
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.function.Consumer;

public class Server {

    public Consumer<Socket> getConsumer() {

        // return new Consumer<Socket>() {
        //     @Override
        //     public void accept(Socket clienSocket) {
        //         try {
        //             PrintWriter toClient = new PrintWriter(clienSocket.getOutputStream());
        //             toClient.println("Hello from server");
        //             toClient.close();
        //             clienSocket.close();
        //         } catch (IOException e) {
        //             e.printStackTrace();
        //         }
        //     }
        // };
        return (clienSocket) -> {
            try {
                PrintWriter toClient = new PrintWriter(clienSocket.getOutputStream());
                toClient.println("Hello from server");
                toClient.close();
                clienSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        };
    }

    public static void main(String[] args) {
        Server server = new Server();
        int port = 8080;
        try {
            ServerSocket socket = new ServerSocket(port);
            // socket.setSoTimeout(10000);
            System.out.println("Server is listing on port :" + port);
            while (true) {
                // Socket acceptedConnection = socket.accept();
                Socket acceptedSocket = socket.accept();
                System.out.println("Connection Accpeted from the client :" + acceptedSocket.getRemoteSocketAddress());
                Thread thread = new Thread(() -> server.getConsumer().accept(acceptedSocket));
                thread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
