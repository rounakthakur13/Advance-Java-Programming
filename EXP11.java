import java.awt.*;
import java.awt.event.*;

class EXP11 extends Frame implements MouseListener
{
	Label l;
	
	EXP11()
	{
		l= new Label();
		setSize(500,500);
		setLayout(new BorderLayout());
		setVisible(true);
		addMouseListener(this);
	}
	public void mousePressed(MouseEvent e)
	{
		setBackground(Color.BLUE);
		l.setText("Blue");
	}
	public void mouseReleased(MouseEvent e)
	{
		setBackground(Color.RED);
		l.setText("Red");
	}
	public void mouseEntered(MouseEvent e)
	{
		setBackground(Color.GREEN);
		l.setText("Green");
	}
	public void mouseExited(MouseEvent e)
	{
		setBackground(Color.YELLOW);
		l.setText("Yellow");
	}
	public void mouseClicked(MouseEvent e)
	{
		setBackground(Color.PINK);
		l.setText("Pink");
	}
	public static void main(String args[])
	{
		EXP11 p = new EXP11();
	}
}
