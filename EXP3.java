import java.awt.*;
public class EXP3 extends Frame 
{
    private static final long serialVersionUID = -7866864371941814832L;
    GridLayout gl = new GridLayout(4, 5);
    EXP3() 
	{
        setSize(500,400);
        setVisible(true);
        setLayout(gl);
        add (new TextField());
        add(new Button("1"));
        add(new Button("2"));
        add(new Button("3"));
        add(new Button("+"));
        add(new Button("4"));
        add(new Button("5"));
        add(new Button("6"));
        add(new Button("-"));
        add(new Button("7"));
        add(new Button("8"));
        add(new Button("9"));
        add(new Button("*"));
        add(new Button("0"));
        add(new Button("/"));
        add(new Button("="));
       
    }
    public static void main(String[] args) 
	{
        new EXP3();
    }
}