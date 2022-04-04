import java.awt.*;
import java.applet.*;
import java.util.*;
import java.text.*;  
/*
<applet code="Applet8" width="600"
height="300">
<param name="Name" value="Kishan">
<param name="Age" value="20">
<param name="Sport" value="PUBG">
<param name="Food" value="Pasta">
<param name="Fruit" value="Apple">
<param name="Destination" value="India">
</applet>
*/
public class Applet8 extends Applet implements Runnable
{
String name;
String age;
String sport;
String food;
String fruit;
String destination;

  Thread t = null;  
   int hours=0, minutes=0, seconds=0;  
   String timeString = "";  
public void init()
{
name = getParameter("Name");
age = getParameter("Age");
food = getParameter("Food");
fruit = getParameter("Fruit");
destination = getParameter("Destination");
sport = getParameter("Sport");}


public void paint(Graphics g)
{
	Date dt = new Date();
	super.showStatus("Today is" + dt);	
g.drawString("Reading parameters passed to this applet -", 20, 20);
g.drawString("Name -" + name, 20, 40);
g.drawString("Age -" + age, 20, 60);
g.drawString("Favorite fruit -" + fruit, 20, 80);
g.drawString("Favorite food -" + food, 20, 100);
g.drawString("Favorite destination -" + name, 20, 120);
g.drawString("Favorite sport -" + sport, 20, 140);

	
	
	g.setColor( Color.blue );  
      g.drawString( timeString, 50, 50 ); 
}
public void run() {  
      try {  
         while (true) {  
 
            Calendar cal = Calendar.getInstance();  
            hours = cal.get( Calendar.HOUR_OF_DAY );  
            if ( hours > 12 ) hours -= 12;  
            minutes = cal.get( Calendar.MINUTE );  
            seconds = cal.get( Calendar.SECOND );  
 
            SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");  
            Date date = cal.getTime();  
            timeString = formatter.format( date );  
 
            repaint();  
            t.sleep( 1000 );  // interval given in milliseconds  
         }  
      }  
      catch (Exception e) { }  
   }  
     
      

}