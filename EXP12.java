import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EXP12 extends JFrame 
{
	EXP12() 
	{
		setTitle("Prog33");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		panel.setLayout(null);
	JLabel lbl1 = new JLabel("First Number");
		lbl1.setBounds(30,20,80,30);
	JLabel lbl2 = new JLabel("Second Number");
		lbl2.setBounds(30,55,110,30);
		JLabel lbl3 = new JLabel("Sum");
		lbl3.setBounds(30,90,80,30);
	final JTextField txt1 = new JTextField(5);
		txt1.setBounds(145,20,50,30);
	final JTextField txt2 = new JTextField(5);
		txt2.setBounds(145,55,50,30);
	final JTextField txt3 = new JTextField(5);
		txt3.setBounds(145,90,50,30);

	 JButton comp = new JButton("Calculate");
		 comp.setBounds(30, 125, 110, 30);
		 comp.addActionListener(new ActionListener() 
		 {
			public void actionPerformed(ActionEvent event) 
			{
	 int a1 = Integer.parseInt(txt1.getText());
	int a2 = Integer.parseInt(txt2.getText());
	 int a3 = a1 + a2;
				 txt3.setText(String.valueOf(a3));  
			}
		});

		panel.add(lbl1);
		panel.add(lbl2);
		panel.add(lbl3);
		panel.add(txt1);
		panel.add(txt2);
		panel.add(txt3);
		panel.add(comp);
	}

	public static void main(String[] args) 
	{
		EXP12 x = new EXP12();
		x.setVisible(true);
	}
}
