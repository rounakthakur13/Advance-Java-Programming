import java.awt.*;
import java.applet.*;
public class Calculator extends Frame{
Calculator(){
	GridLayout gi = new GridLayout(5,4);
	setLayout(gi);
	TextField tf = new TextField();
	tf.setVisible(true);
	
	add(tf);
	add(new Button("1"));
	add(new Button("2"));
	add(new Button("3"));
	add(new Button("4"));
	add(new Button("5"));
	add(new Button("6"));
	add(new Button("7"));
	add(new Button("8"));
	add(new Button("9"));
	add(new Button("0"));
	add(new Button("+"));
	add(new Button("-"));
	add(new Button("*"));
	add(new Button("/"));
}
public static void main(String args[]){
	Calculator c1 = new Calculator();
	c1.setSize(500,500);
	c1.setVisible(true);
}
}