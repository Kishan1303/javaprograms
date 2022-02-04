import java.util.*;
class odd{
    public static void main(String []args)
     {
     Scanner scan = new Scanner(System.in);
            System.out.println("Enter total num :");
            int tn = scan.nextInt();
            int te=0,to=0;
            System.out.print("Enter Number");
            int []a = new  int[tn];
            for(int i=0;i<a.length;i++)
            {
                a[i] = scan.nextInt();

            }
            for(int i=0;i<a.length;i++)
            {
                if(a[i]%2==0)
                {
                    System.out.println("Even :" + a[i] );
                    te+=a[i];
                }
                else 
                {
                    System.out.println("Odd :" + a[i]);
                    to+=a[i];   
                }
            }
            System.out.println("total num of even num :" + te);
            System.out.println("total num of odd num :" + to);
            if(te>50)
            {
                int ans = te/a.length;
                System.out.println("sum of e num is >50 so division is : " + ans);
            }
            else
            {
                int ans = te*3;
                System.out.println("multiplication of sum of e num  by 3 is : " + ans);
            }

            if(to>50)
            {
                int ans2 = to/a.length;
                System.out.println("sum of o num is >50 so divisin is : " + ans2);
            }
            else
            {
                int ans2 = to*3;
                System.out.println("multiplication of sum of e num  by 3 is : " + ans2);
            }
        }
        // close scan;

    }

