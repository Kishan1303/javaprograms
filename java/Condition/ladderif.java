// programs to ladder if 

import java.util.*;
class ladderif{
	public static void main(String args[]){
		Scanner marks = new Scanner(System.in);
		System.out.println("Enter marks for java");
		int a = marks.nextInt();
		
		System.out.println("Enter marks for c#");
		int b = marks.nextInt();
		
		System.out.println("Enter marks for N/W");
		int c = marks.nextInt();
		
		System.out.println("Enter marks for OS");
		int d = marks.nextInt();
		
		int total = a + b + c + d;
		
		int avg = total/4;
		System.out.println("your total marks is " +total);
	System.out.println( "your avarage marks is " +avg );
		
		
		if(avg>=70)
		{
			System.out.println("first grade");
		}
		else if(avg >=60)
		{
			System.out.println("Second grade");
		}
		else if(avg >=50)
		{
			System.out.println("Thired grade");
		}
		else if(avg >=40)
		{
			System.out.println("Pass");
		}
		else 
		{
			System.out.println("try again !!");
		}
	}
	
}
