


 import java.util.*;
 class res {
	 
	public static void main(String args[])
	{
 		Scanner scan = new Scanner(System.in);
		System.out.println("Enter  Java marks  :");
		int m1 = scan.nextInt();
		System.out.println();

		System.out.println("Enter  OS marks :");
		int m2 = scan.nextInt();
		System.out.println();

		System.out.println("Enter  c# marks :");
		int m3 = scan.nextInt();
		System.out.println();

		System.out.println("Enter  N/W marks :");
		int m4 = scan.nextInt();
		System.out.println();

		int total = m1 + m2  + m3 + m4;
	    System.out.println("total marks =" +  total);
		System.out.println();

		int avg = total/4;
		System.out.println("Avg marks =" + avg);
		System.out.println();

		if(avg>=70)
		{
			System.out.println("Grad A");
		}
		else if (avg>=60)
			{
			System.out.println("Grad B");
		}
		else if (avg>=50)
			{
			System.out.println("Grad c");
		}
		else if (avg>=40)
			{
			System.out.println("Grad D");
			
		}
		else 
			System.out.println("Fail!!!");
	}	
}
