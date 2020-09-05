package ClientServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;

public class Client {
    
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;
    
    public static void main(String[] args) {
        var client = new Client();
        client.start("127.0.0.1", 10);
        System.out.println(client.sendQuery("q;lucas;2;Hello World"));
        var clientCloser = new Client();
        clientCloser.start("127.0.0.1", 10);
        clientCloser.closeServer();
        
    }
    
    private void closeServer() {
        System.out.println("Closing server...");
        out.println("s;lucas;2;Stop");
        String response = null;
        do {
            try { response = in.readLine(); }
            catch (IOException iE) { iE.printStackTrace(); }
        } while (response == null);
        System.out.println(response);
        if (response.equals("OK")) close();
        
    }
    
    public void start(String ip, int port) {
        try {
            clientSocket = new Socket(ip, port);
            clientSocket.setSoTimeout(200000);
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        }
        catch (IOException iE) { iE.printStackTrace(); }
        
    }
    
    public String sendQuery(String msg) {
        out.println(msg);
        String resp;
        try {
            resp = in.readLine();
        }
        catch (IOException iE) {
            return "error";
        }
        out.flush();
        return resp;
        
    }
    
    public void close() {
        try {
            in.close();
            out.close();
            clientSocket.close();
        }
        catch (IOException iE) { iE.printStackTrace(); }
        
    }
    
}

