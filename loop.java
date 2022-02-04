

import java.util.*;

class loop {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value :");
	int a = scan.nextInt();
	
	
	//  For Lopp Ex
		for(int i=1;i<=a;i++)
		{
			//for(int k=1;k<="";k++)
			for(int j=1;j<=i;j++)
			{
			System.out.print(j);
			}
			System.out.println();
		}
	
	
	// While loop Ex
	int i=1;
	while(i<=a)
	{
		System.out.println(i);
		i++;
	}
	
	// Do While Loop Ex
	int i=0;
	do
	{
		System.out.println(i);
		i++;
	}
	while(i<=a);
	
	
	}
	
	
}