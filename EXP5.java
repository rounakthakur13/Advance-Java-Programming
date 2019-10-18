import java.awt.*;
public class EXP5 extends Frame 
{
    private static final long serialVersionUID = 2256106133268721868L;

    EXP5() 
	{
        setSize(300,300);
        setVisible(true);
        setLayout(null);
      //  setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
        MenuBar mb = new MenuBar();
        Menu m1 = new Menu("File");
        Menu m2 = new Menu("Edit");
        Menu m3 = new Menu("View");
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        MenuItem mi1 = new MenuItem("New");
        MenuItem mi2 = new MenuItem("Open");
        MenuItem mi3 = new MenuItem("Save");
        MenuItem mi4 = new MenuItem("Save As");
        MenuItem mi5 = new MenuItem("Exit");
        m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);
        m1.add(mi4);
        m1.add(mi5);
        setMenuBar(mb);
    }
    public static void main(String[] args) 
	{
        new EXP5();
    }    
}