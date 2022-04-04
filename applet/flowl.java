import java.awt.*;
import javax.swing.*;
public class flowl
{
	JFrame f;
	public flowl()
	{
		f=new JFrame();
		JLabel l1 = new JLabel("Enter Name:");
		JTextField tf1 = new JTextField(10);
		JButton b1 = new JButton("Submit");
		f.add(l1);
		f.add(tf1);
		f.add(b1);
		f.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		f.setSize(300,300);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new flowl();
	}
}
/*
<applet code = "flowl.class" width="300" height="100">
</applet>
*/