// number even or odd 
import java.util.*;
class evenodd2 {
  public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("enter number");
	int a = scan.nextInt();
	
	int n=0;
	
	int e=0;
	int o=0;
	while(n<=a)
	{
		if(n%2==0)
		{
			e++;
		}
		else
		{
			o++;
		}
		n++;
	}
	System.out.println("count of even number is " + e);
	System.out.println("count of odd number is " + o);
	
}
}