import java.util.*;
class overload
{
    int Sum(int a,int b)
    {
        int x=Math.min(a,b);
        int y=Math.max(a,b);
        int s=0;
        for(int i=x;i<=y;i++)
        {
            if(i%2==0)

            s=s+i;
        }
        return s;
    }
    double Sum(double N)
    {
        double a=1.0;
        double s=0.0;
        for( double i=a;i<=N;i=i+0.2)
        {
            s=s+i;

        }
        return s;
    }
    int Sum(int N)
    {
        int d,s=0,x;
        x=N;
        while(x!=0)
        {
            d=x%10;
            if(d%2!=0)
            s=s+d;
            x=x/10;
        }
        return s;
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        overload obj=new overload();
        int a,b,n;
        double n1;
        System.out.println("Enter value of A and B");
        a=in.nextInt();
        b=in.nextInt();
        int s1=obj.Sum(a,b);
        System.out.println(s1);
        System.out.println("Enter value of N");
        n1=in.nextDouble();
        double s2=obj.Sum(n1);
        System.out.println(s2);
        System.out.println("Enter value of n");
        n=in.nextInt();
        int s3=obj.Sum(n);
        System.out.println(s3);


    }

}