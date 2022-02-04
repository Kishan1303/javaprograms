import java.util.*;

class eo2
{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
	int e=0,o=0,n=0;
	
		System.out.println("Enter value");
			int a = scan.nextInt();
			//if(a!=0)
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
				System.out.println("even num is " + e);
					System.out.println("odd num is " + o);
	}
}