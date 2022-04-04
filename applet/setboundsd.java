import javax.swing.*;
import java.awt.*;

public class setboundsd
{
	public static void main(String args[])
	{
			JFrame f = new JFrame("setBounds method test");
			f.setSize(375,250);
			f.setLayout(null);
			JButton b = new JButton("HEllo KB");
			b.setBounds(80,30,120,40);
			f.add(b);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setLocationRelativeTo(null);
			f.setVisible(true);
			
	}
}
