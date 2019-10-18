import java.sql.*;
public class EXP20 {
    public static void main(String[] args) {
        try {
            String url = "jdbc:ucanaccess://C:\\Users\\itsde\\Desktop\\AccessDB.accdb";
            Connection cn = DriverManager.getConnection(url);
            Statement st = cn.createStatement();
            System.out.println("Connection Established");
            Thread.sleep(2000);
            String sql = "update Student set name='Jhon' where name='Jack'";
            st.executeUpdate(sql);
            System.out.println("one row updated");
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}