import java.awt.*;
import javax.swing.*;
public class GridBagLayoutDemo extends JFrame
{
 public static void main (String[]args)
 { 
	JFrame f1 = new JFrame ();
	f1.setSize (250, 250);
	GridBagLayout gb = new GridBagLayout ();
	f1.setLayout (gb);
	GridBagConstraints gc = new GridBagConstraints ();
	Button b1 = new Button ("Button1");
	Button b2 = new Button ("Button2");
	Button b3 = new Button ("Button3");
	gc.fill = GridBagConstraints.HORIZONTAL;
	gc.weightx = 0.5;
	gc.weighty = 0.5;
	gc.gridx = 0;
	gc.gridy = 0;
	f1.add (b1, gc);
	gc.gridx = 1;
	gc.gridy = 0;
	f1.add (b2, gc);
	gc.gridx = 2;
	gc.gridy = 0;
	f1.add (b3, gc);
	Button b4 = new Button ("Button4");
	gc.gridx = 0;
	gc.gridy = 1;
	gc.gridwidth = 3;
	gc.ipady = 40;
	f1.add(b4,gc);
	Button b5 = new Button ("Button5");
	gc.gridx = 2;
	gc.gridy = 3;
	gc.insets = new Insets (10, 0, 10, 0);
	f1.add (b5, gc);
	f1.pack ();
	f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f1.setVisible (true);
	}
}
/*
<applet code ="GridBagLayoutDemo.class" width="300" height="300">
<applet>
*/