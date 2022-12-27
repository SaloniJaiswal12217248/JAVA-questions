import java.util.*;
class perfect
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=in.nextInt();
        int s=0,i;
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            s=s+i;
        }
        if (s==n)
        System.out.println("It is a perfect number");
        else
        System.out.println("it is not a perfect number");
    }
}