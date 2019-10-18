import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class EXP10 extends Applet implements KeyListener
{
	String msg=" ";
	public void init()
	{
		addKeyListener(this);
	}
	public void keyPressed(KeyEvent k)
	{
		showStatus("Key Pressed");
	}
	public void keyReleased(KeyEvent k)
	{
		showStatus("Key Released");
	}
	public void keyTyped(KeyEvent k)
	{
		msg=msg+k.getKeyChar();
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,20,40);
	}
}

/* <applet code="EXP10.class" height=500 width=500> </applet> */
