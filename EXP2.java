import java.awt.*;

public class EXP2 extends Frame
{
    private static final long serialVersionUID = 670919813975920990L;
    Choice c1 = new Choice();
    List l1 = new List();
    EXP2() 
	{
        l1.setBounds(40, 100, 100, 90);
        l1.add("Intel i9");
        l1.add("Intel i7");
        l1.add("Intel i5");
        l1.add("Intel i3");
        l1.add("Ryzen 9 3900x");
        l1.add("Ryzen 7 3800x");
        l1.add("Ryzen 5 3600x");
        c1.setBounds(40, 200, 75, 75);
        c1.add("India");
        c1.add("Austrelia");
        c1.add("England");
        c1.add("NewZeland");
        c1.add("Sri Lanka");
        add(c1);
        add(l1);
        setSize(400,500);
        setVisible(true);
        setLayout(null);
    }
    public static void main(String[] args)
	{
         new EXP2();
    }
}