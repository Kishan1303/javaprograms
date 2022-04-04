import java.awt.*;
import java.applet.*;
/*
<applet code = "passpera" width="400" height="200">
<param name= "Name" value="Kishan">
<param name="Age" value="20" >
</applet>
*/
public class passpera extends Applet
{
	String nm ;
	String age;
	public void init()
	{
		nm = getParameter("Name");
		age = getParameter("Age");
	}
	public void paint(Graphics g)
	{
		g.drawString("Name :"+ nm,20,20);
		g.drawString("Age :"+ age,20,40);
	}
}