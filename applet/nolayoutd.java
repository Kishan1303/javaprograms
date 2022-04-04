import javax.swing.*;
import javax.swing.JTextField;

public class nolayoutd extends JFrame{
public static void main(String[]args)
{
	JFrame.setDefaultLookAndFeelDecorated(true);
	JFrame f = new JFrame("NoLayout Text");
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setLayout(null);
	JLabel l= new JLabel ("First Name");
	l.setBounds(20,20,100,20);
	JTextField tf = new JTextField();
	tf.setBounds(124,25,100,20);
	f.add(l);
	f.add(tf);
	f.setSize(300,100);
	f.setVisible(true);
}
}