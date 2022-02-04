import java.util.*;
class ifelse2{
	public static void main(String args[]){
		System.out.println("Enter a :");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		if(a>=18)
		{
			System.out.println("you are eligible for voting");
		}
		else
		{
			System.out.println("you are  not eligible for voting");
		}
	}
}