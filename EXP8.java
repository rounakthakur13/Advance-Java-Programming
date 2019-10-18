import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class EXP8 extends JFrame 
{

    private static final long serialVersionUID = 1L;
    String[] col = {"ID", "NAME", "SALARY"};
    String[][] data = { {"101", "isha", "15000"}, {"102","Jivan","20000"}, {"102","uzma","25000"},{"102","maaz","3000"}}; 
    EXP8()
	{
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);
        JTable jt = new JTable(data,col);
        JScrollPane sp = new JScrollPane(jt);
        add(sp, BorderLayout.CENTER);

    }
    public static void main(String[] args) 
	{
        new EXP8();
    }
}