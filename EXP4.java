import java.awt.*;
import java.awt.event.*;

public class EXP4 extends Frame implements ActionListener 
{
    private static final long serialVersionUID = -5539902585596529414L;
    CardLayout cd = new CardLayout();
    EXP4() 
	{
        setLayout(cd);
        setSize(300,200);
        setVisible(true);
        Button b1 = new Button("Windows");
        Button b2 = new Button("Phionex");
        Button b3 = new Button("Linux");
        Button b4 = new Button("Mac OS");
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }
	public void actionPerformed(ActionEvent e) 
	{
		cd.next(this);
	}
    public static void main(String[] args) 
	{
        new EXP4();
    }   
} 