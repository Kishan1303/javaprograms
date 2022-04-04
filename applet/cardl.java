import java.awt.*;
import javax.swing.*;
import javax.swing.JButton;
import java.awt.event.*;
import java.util.*;

public class cardl extends JFrame implements ActionListener
{
	JButton b1,b2,b3,b4,b5;
	CardLayout cl;
	Container c;
	public cardl()
	{
		b1=new JButton("b1");
		b2=new JButton("b2");
		b3=new JButton("b3");
		b4=new JButton("b4");
		b5=new JButton("b5");
		c=this.getContentPane();
		cl = new CardLayout(10,20);
		c.setLayout(cl);
		c.add("card1",b1);
		c.add("card2",b2);
		c.add("card3",b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		setVisible(true);
		setSize(400,400);
		setTitle("Card Layout");
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		public void actionPerformed(ActionEvent ae)
		{
			cl.next(c);
		}
		public static void main(String[] args)
		{
			new cardl();
		}
		
}


/*
<applet code ="cardl" width="300" height="200">
</applet>
*/