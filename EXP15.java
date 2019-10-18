import java.net.*;
import java.io.*;

public class EXP15 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.msbte.org.in:99/Circular");
            System.out.println("Protocol: "+url.getProtocol());
            System.out.println("Host: "+url.getHost());
            System.out.println("Port: "+url.getPort());
            System.out.println("File: "+url.getFile());
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}