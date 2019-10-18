import java.net.*;
import java.io.*;
import java.util.*;
 
public class EXP17_1S {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket(5544);
            byte[] b1 = new byte[1024];
            DatagramPacket dp1 = new DatagramPacket(b1, 1024);
            ds.receive(dp1);
            String file1 = new String(dp1.getData(),0,dp1.getLength());
            FileReader fr = new FileReader(file1);
            byte[] b2 = new byte[1024];
            DatagramPacket dp2 = new DatagramPacket(b2,1024); 
            ds.receive(dp2);
            String file2 = new String(dp2.getData(),0,dp2.getLength());
            FileWriter fw = new FileWriter(file2);
            int ch;
            while((ch=fr.read())!=-1) {
                fw.write(ch);
            }
            String msg = "Files copyed Successfully";
            InetAddress ip = InetAddress.getByName("localhost");
            DatagramPacket dp3 = new DatagramPacket(msg.getBytes(), msg.length(),ip,dp1.getPort());
            ds.send(dp3);
            ds.close();
            fr.close();
            fw.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}