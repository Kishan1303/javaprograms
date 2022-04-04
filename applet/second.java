import java.applet.Applet;
import java.awt.Graphics;
import java.awt.*;
import java.util.Date;
 
// HelloWorld class extends Applet
public class second extends Applet
{

    public void paint(Graphics g)
   {
	     g.drawString("Hello World", 50, 50);
	Date dt = new Date();
	super.showStatus("Today is" + dt);
	//in this line, super keyword is
	// avoidable too.
	}
  
}
 /*<applet code="second" width=200 height=60>
</applet>  
*/
