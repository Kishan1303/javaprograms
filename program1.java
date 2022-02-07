/*WAP TO GET 3 NUMBER FROM THE USER PERFORM FOLLWING ACTION ON THEM 
 - PELINDROM
 - FIBONACEY SERIES 
 - SUM OF NUM 1 AND NUM 2  STORE IT INTO ANOTHER VAR ALSO DO SUM OF NUMBER 2 AND NUM 3 AND ALSO DO THE SUM OF NUM  1 AND NUM 3
  NOW CHECK WHICH ANS IS LARGE AND PRINT
  - FIND THE SQURE ROOT OF ALL THE NUMBERS AND DO SUM OF THEM NOW CHECK WHICH NUM 3 NUM IS LARGEST ALL SMALLEST 
 - DO ALL THE NUMBERS OF SUM AND FIND THE SQURE ROOT AFTER CHECK NUMER IS AEMSTRONG OR NOT IF NUM IS
ARMSTRONG THEN FIND POWER OF THAT NUM OTHER WISE PRINT SQUNCE OF THAN NUM UNTILL 20*/

import java.util.Scanner;
class action
{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number :");
		int a=scan.nextInt();
		int temp =0;
		int sum =0;
		int r;
		temp =a;
		while(a>0)
		{
			 r=a%10;   
			sum=(sum*10)+r;    
			a=a/10; 
		}
		if(temp == sum )
		{
			System.out.println("Palindrome ");
		}
		else
		{
			System.out.println("note Palindrome");
		}
	}
}
