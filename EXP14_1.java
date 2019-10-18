import java.io.*;
import java.net.*;
import java.util.*;

public class EXP14_1 
{
    public static void main(String[] args) 
	{
        try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Host Name:");
			String name = sc.next();
			InetAddress[] ia = InetAddress.getAllByName(name);
			// System.out.println("Ip Address:"+ia.getHostAddress());
			for(int i=0;i<ia.length;i++) 
			{
				System.out.println("Ip Addresses:"+ia[i]);
			}
			sc.close();
		}
		catch(Exception e) 	
		{
			System.out.println(e);
		}
    }
}