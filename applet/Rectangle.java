import java.awt.*;
import java.applet.*;

public class Rectangle extends Applet
{
	public void paint(Graphics g)
	{
		g.drawRect(10,10,60,50);
		g.setColor(Color.red);
		g.fillRect(100,100,100,50);
		g.setColor(Color.blue);
		g.drawRoundRect(190,10,60,50,15,15);
		g.fillRoundRect(70,90,140,100,30,40);
	}
}
/*
<applet code ="Rectangle.class" width="300" height="200">
</applet>
*/