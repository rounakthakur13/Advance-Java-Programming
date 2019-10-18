import java.sql.*;
public class EXP18 {
    public static void main(String[] args) {
        try {
        String url = "jdbc:ucanaccess://C:\\Program Files\\Java\\jdk1.8.0_221\\bin\\AccessDB.accdb"; 
        Connection cn = DriverManager.getConnection(url);
        Statement st = cn.createStatement();
        String sql = "CREATE table employee1 (emp_id int,emp_name Varchar(25))";
        st.execute(sql);
        System.out.println("Query Executed & Table Created ");
        }
        catch(Exception e) {
            System.out.println(e);
        }    
    }
}