import java.awt.*;
import java.applet.*;

public class FrameTest extends Frame{
FrameTest(){
Button b = new Button("click me");
b.setBounds(30,100,80,30);
add(b);
TextField tf = new TextField();
tf.setBounds(30,400,80,30);
add(tf);
Label l1 = new Label("Label 1");
l1.setBounds(30,150,80,30);
add(l1);
List ls1 = new List();
ls1.setBounds(30,200,80,30);
ls1.add("Test1");
ls1.add("Test2");
ls1.add("Test3");
add(ls1);
Checkbox ch1 = new Checkbox();
ch1.setBounds(30,300,80,30);
add(ch1);
CheckboxGroup cbg = new CheckboxGroup();
Checkbox rb1 = new Checkbox("Radio button",cbg,true);
add(rb1);

}
public static void main(String args[]){
FrameTest f = new FrameTest();
f.setSize(500,500);
f.setVisible(true);
}
}


// Comments
// setSize(300,300);
// setLayout(null);
// setVisible(true);
// f.setSize(100,150);
// f.setVisible(true);