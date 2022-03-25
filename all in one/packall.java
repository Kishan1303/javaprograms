package human1;
import java.util.Scanner;
 
// thread
class threads extends Thread 
{
	public void run()
	{
		System.out.println("Your are student  ^-^");
		
	}
} 
// abstract 
abstract class prints
{
	abstract void disps();
}
// class of const
class hobbies extends prints
{
	public String h1 , h2 ;
	hobbies()
	{
		Scanner scan = new Scanner(System.in);
		h1 =scan.nextLine();
		h2 =scan.nextLine();
	}
	public void disps()
	{
		System.out.println("Your hobbies is :"+h1);
		System.out.println("Your hobbies is :"+h2);
	}
	
}
// interface 
interface allfun
{
	public void studfun();
}
//class of protected function 
class student implements allfun
{
	public void studfun()
	{
		System.out.println("Enter hobbies for student:" );
		hobbies h = new hobbies();
		h.disps();
		threads t = new threads();
		t.start();
	}
}
class devloper extends student
{
	public void deve()
	{
		System.out.println("Hobbieys for devloper:");
		hobbies  h  = new hobbies();
		h.disps();
	}
	protected void disp()
	{
		deve();
	}
}
public class packall 
{
	public void packageuse()
	{
		devloper d = new devloper();
		d.disp();
		d.studfun();
	}
	
}