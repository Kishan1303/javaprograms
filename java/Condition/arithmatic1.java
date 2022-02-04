
import java.util.Scanner;
public class arithmatic1 {
int a,b,c;
    public void arithmatic(int x ,int y,int z){
        a=x;
        b=y;
      c=z;
        switch(z)
        {
            case 1:
			z=x+y;
            System.out.println("Addition is :"+z);
            break;

            case 2:
			z=x-y;
            System.out.println("Sub is "+z);
            break;

            case 3:
			z=x*z;
            System.out.println("Mul is "+z);
            break;

            case 4:
			z=x/y;
            System.out.println("Div is "+z);
            break;

            default :
            System.out.println("Unvalid ");
        }
    }
    
public static void main(String args[]){
//arithmatic1 ab =new arithmatic1();
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter first number:");

    int a=nextInt();
    System.out.println("enter secound number");
    int b=nextInt();
    System.out.println("enter 1 for addition");
    System.out.println("enter 2 for sub");
    System.out.println("enter 3 for mul");
    System.out.println("enter 4 for div");
int c =nextInt();   
}    

}
