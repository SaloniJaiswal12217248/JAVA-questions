import java.util.*;
class selection
{
    public static void main(String[] args)
    {
    Scanner in=new Scanner(System.in);
    String name[]=new String[10];
    int a[]=new int[10];
    int i,max=0,j,temp;
    String n="";
    System.out.println("Enter name and marks of 10 students");
    for(i=0;i<10;i++)
    {
        name[i]=in.next();
        a[i]=in.nextInt();

    }
    for(i=0;i<10;i++)
    {
        max=i;
        for(j=i+1;j<10;j++)
        {
            if(a[max]<a[j])
            max=j;
        }
        temp=a[max];
        a[max]=a[i];
        a[i]=temp;

        n=name[max];
        name[max]=name[i];
        name[i]=n;


    }
    System.out.println("Name and marks of top 5 students");
    System.out.println("Name\tMarks");
    for(i=0;i<5;i++)
    {
        
        System.out.println(name[i]+"\t"+a[i]);
    }

}
}