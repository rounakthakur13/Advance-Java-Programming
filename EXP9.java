import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class EXP9 extends JFrame 
{
	private static final long serialVersionUID = 1L;
    int i=0;
    JProgressBar pb = new JProgressBar(0,2000);
    EXP9() 
	{
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setVisible(true);
        setLayout(null);
        pb.setStringPainted(true);
        pb.setBounds(40, 40, 250, 30);
        pb.setValue(0);  
        add(pb);
    }
    public void progress() 
	{
        while (i<=2000) 
		{
            pb.setValue(i);
            i=i+50;
            try 
			{
                Thread.sleep(200);
            }
            catch(Exception e) 
			{
				
			}
        }
    }

    public static void main(String[] args) 
	{
       EXP9 obj = new EXP9();
       //obj.setVisible(true);
       obj.progress();
    }
}