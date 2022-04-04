import java.applet.*;
import java.awt.*;

public class DrawString extends Applet
{
 String demoMessage;
 public void init()
 {
 demoMessage=getParameter("arg");
 demoMessage="Hello "+demoMessage;
 }
 public void paint(Graphics g)
 {
 g.drawString(demoMessage, 50, 25);
 }
} 
/*
<APPLET code="DrawString" width="300"
height="50">
 <PARAM name="arg" value="KB!">
 </APPLET>


*/
