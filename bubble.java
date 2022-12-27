import java.util.*;
class bubble
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int i,j,temp;
        int a[]=new int[10];
        System.out.println("enter values in the array");
        for(i=0;i<10;i++)
        {
            a[i]=in.nextInt();
        }
        for(i=0;i<10;i++)
        {
            for(j=0;j<9-i;j++)
            { if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("SORTED ARRAY");
        for(i=0;i<10;i++)
        {
            System.out.println(a[i]);
        }
    }
}
    
    