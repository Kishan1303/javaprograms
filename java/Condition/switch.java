import java.util.*;

 class switch1 
{   
 public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a  :"); 
    int a = scan.nextInt();

    System.out.println("Enter b :"); 
    int b = scan.nextInt();
	 System.out.println("--- chose what u perform---"); 
	 System.out.println(" press 1 for Addition  ");
	 System.out.println(" press 2 for Subtraction  ");
	 System.out.println(" press 3 for Multipication  ");
	 System.out.println(" press 4 for Division  ");	  
	 System.out.println(" chose and press enter :  ");
    int c=scan.nextInt();
	
    switch (c) {
        case 1:
            c=a+b;
            System.out.println(c);
            break;
         case 2:
				c=a-b;
                System.out.println(c);
                break;
        case 3:
             c=a*b;
             System.out.println(c);
              break;
          case 4:
              c=a/b;
              System.out.println(c);
              break;
        default:
            System.out.println("Plz chose any one ");
            break;
	}

 }
}