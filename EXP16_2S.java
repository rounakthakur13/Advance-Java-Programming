import java.net.*;
import java.io.*;

public class EXP16_2S {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(7777);
            Socket s = ss.accept();
            DataInputStream din = new DataInputStream(s.getInputStream());
            String st = (String)din.readUTF();
            int num = Integer.parseInt(st);
            DataOutputStream dut = new DataOutputStream(s.getOutputStream());
            int m,flag;
            m=num/2;
            flag = 0;
            if(num==0||num==1){
                dut.writeUTF(num+" is Not Prime");
            }
            else {
                for(int i=2;i<=m;i++){
                    if(num%i==0) {
                        dut.writeUTF(num+" is Not Prime");
                        flag =1;
                        break;
                    }
                }
                if(flag==0){
                    dut.writeUTF(num+" is Prime Number");
                }
            }
            ss.close();
            din.close();
            dut.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}