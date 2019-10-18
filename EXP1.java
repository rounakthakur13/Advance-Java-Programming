import java.awt.*;
public class EXP1 extends Frame 
{
	private static final long serialVersionUID = 6065511524151185151L;
	Label l1 = new Label("New Lebel");
	TextField tf1 = new TextField();
	Button b1 = new Button("Button");
	Checkbox cb1 = new Checkbox("Check Box");
	CheckboxGroup cbg = new CheckboxGroup();
	Checkbox rb1 = new Checkbox("Radio Button", cbg, false);
	EXP1() 
	{
		setLayout(null);
		l1.setBounds(40, 70, 70, 20);
		add(l1);
		tf1.setBounds(40, 100, 100, 30);
		add(tf1);
		
		b1.setBounds(40, 150, 60, 30);
		add(b1);
		cb1.setBounds(40, 200, 100, 30);
		
		add(cb1);
		
		rb1.setBounds(40, 250, 100, 30);
		add(rb1);
		setSize(500,500);	
		
	}
	public static void main(String args[])
	{
		EXP1 f = new EXP1();
		f.setVisible(true);		
	}	
}