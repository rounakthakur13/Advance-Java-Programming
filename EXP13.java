import java.awt.event.*;
import javax.swing.*;

public class EXP13 extends WindowAdapter 
{
    JFrame f = new JFrame();
    EXP13() 
	{
        f.setSize(400,400);
        f.setVisible(true);
        f.addWindowListener(this);
    }
    public void windowClosing(WindowEvent e) 
	{
        System.out.println("Window is Closing");
    }
    
    public void windowIconified(WindowEvent e) 
	{
        System.out.println("Window is Iconified");
    }
    public void windowDeiconified(WindowEvent e) 
	{
        System.out.println("Window id Deiconified");
    }

    public static void main(String[] args) 
	{
        new EXP13();
    }
}