import java.util.*;
class switchcase
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner (System.in);
        int ch;
        System.out.println("Enter choice");
        ch=in.nextInt();
        switch(ch)
        {
            case 1:int x;
            double y=5.5;
            double z;
            System.out.println("Enter value of x");
            x=in.nextInt();
            if(x>=-10 && x<=10)
            {
                x=x+2;
                z=(Math.pow(x,3)+0.5*x)/5.5;
                System.out.println("Value of Z is :"+z);



            }
            else
            System.out.println("Invalid input");
            break;
            case 2:int n,i,j,a=1;
            System.out.println("Enter the value of N");
            n=in.nextInt();
            for(i=0;i<n;i++)
            {
                for (j=0;j<=i;j++)
                {
                    System.out.print(a+"\t");
                    a=a+1;

                }
                System.out.println();

            }
            break;
            default:System.out.println("Invalid Input");

        }
    }

}