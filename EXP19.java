import java.sql.*;
import java.util.Scanner;

public class EXP19 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String url = "jdbc:ucanaccess://C:\\Program Files\\Java\\jdk1.8.0_221\\bin\\AccessDB.accdb"; 
            Connection cn = DriverManager.getConnection(url);
            Statement st = cn.createStatement();
            System.out.println("Enter the table name:");
            String tb = sc.nextLine();
            String query = "select * from "+tb;
            ResultSet rs = st.executeQuery(query);

            

            while(rs.next()) {
                System.out.print(rs.getString(1)+" ");
                System.out.print(rs.getString(2)+" ");
                System.out.print(rs.getString(3)+"\n");
            } 

        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}