import java.awt.*;
public class borderl
{
	public static void main(String args[])

	{
		Frame f1 = new Frame();
		f1.setSize(250,250);
		Button b1 = new Button("btn1");
		Button b2 = new Button("btn2");
		Button b3 = new Button("btn3");
		Button b4 = new Button("btn4");
		Button b5 = new Button("btn5");
		f1.add(b1,BorderLayout.NORTH);
		f1.add(b2,BorderLayout.EAST);
		f1.add(b3,BorderLayout.WEST);
		f1.add(b4,BorderLayout.SOUTH);
		f1.add(b5);
		f1.setVisible(true);
	}
}
/*
	<applet code = "borderl.class" width ="300" height="300">
	</applet>
*/