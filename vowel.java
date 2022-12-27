import java.util.*;
class vowel
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String s1;
        int len,i,c=0;
        char ch,ch1;
        System.out.println("Enter a string");
        s1=in.nextLine();
        s1=s1.toUpperCase();
        len=s1.length();
        System.out.println("Pair of vowels");
        for(i=0;i<len-1;i++)
        {
            ch=s1.charAt(i);
            ch1=s1.charAt(i+1);
            if((ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')&&(ch1=='A'||ch1=='E'||ch1=='I'||ch1=='O'||ch1=='U'))
            {
                System.out.println(ch+","+ch1);
            
            c++;
            }
        }
            System.out.println("number of pair of vowels "+c);
        


        }

    }
