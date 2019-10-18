import java.net.*;
import java.io.*;
import java.util.*;

public class EXP16_2C {
    public static void main(String[] args) {
        try{
            Socket s = new Socket("localhost",7777);
            Scanner sc =  new Scanner(System.in);
            DataOutputStream dut = new DataOutputStream(s.getOutputStream());
            System.out.println("Enter Any Number:");
            int n = sc.nextInt();
            String st =String.valueOf(n);
            dut.writeUTF(st);
           
            DataInputStream din = new DataInputStream(s.getInputStream());
            String msg =(String)din.readUTF();
            System.out.println(msg);
            s.close();
            dut.close();
            sc.close();
            din.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}