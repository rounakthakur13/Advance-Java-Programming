import javax.swing.*;
import java.awt.*;

public class EXP6 extends JFrame 
{
 	private static final long serialVersionUID = 4043642161084657903L;

  // BorderLayout bl = new BorderLayout();
	EXP6() 
	{
     
		setSize(400,400);
		setVisible(true);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Object str[] = {"Hindi","Sannskrit","English","Marathi","JAVA","C","Ruby","C++","JavaScript","Swift","NodeJS","ReactJS","Python","PHP","C#",};
  	
		JComboBox cb = new JComboBox<>(str);
		JScrollPane sp = new JScrollPane(cb);
		cb.setBounds(75,75,100,30);
		 
		add(sp ,BorderLayout.NORTH);
		add(cb);
    }
    public static void main(String[] args) 
	{
    	new EXP6();
    }
}
