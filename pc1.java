import java.util.Scanner;
public class pc1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total num :");;
        int n = sc.nextInt();
        System.out.println("Enter a number :");
        int []a=new int[n];
		int te=0,to=0;
        for(int i=0; i<a.length; i++)
        {
          a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
          if(a[i]%2==0)
		  {
			  System.out.println("Even"+a[i]);
			  te+=a[i];
		  }			  
		  else
		  
			  System.out.println("Odd"+a[i]);
			  to+=a[i];
		}
			 
		  if(te>50)
		  {
			  int res = te/a.length;
				System.out.println("Ans is >50 than "+res);
		  }
		  else 
		  {
			  int res3 = te/3;
			  System.out.println("Ans /3 division "+res3);
		  }
		   if(to>50)
		  {
			  int res = to/a.length;
				System.out.println("Ans is >50 "+res);
		  }
		  else 
		  {
			  int res2 = to/3;
			  
			  System.out.println("Ans division /3 "+res2);
		  }
        }

    }
    

