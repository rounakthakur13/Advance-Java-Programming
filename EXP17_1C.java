import java.net.*;
import java.io.*;
import java.util.*;

public class EXP17_1C {
    public static void main(String[] args) {
        try{
            DatagramSocket ds = new DatagramSocket();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the file name from which you what to copy the content:");
            String f1 =sc.next();
            InetAddress ip = InetAddress.getByName("localhost");
            DatagramPacket dp = new DatagramPacket(f1.getBytes(), f1.length(),ip,5544);
            ds.send(dp);
            System.out.println("Enter the file where you whant to paste the content:");
            String f2 = sc.next();
            DatagramPacket dp2 = new DatagramPacket(f2.getBytes(), f2.length(),ip,5544);
            ds.send(dp2);
            byte[] b = new byte[1024];
            DatagramPacket dp3 = new DatagramPacket(b, 1024);
            ds.receive(dp3);
            String msg = new String(dp3.getData(),0,dp3.getLength());
            System.out.println(msg);
            ds.close();
            sc.close();

        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}