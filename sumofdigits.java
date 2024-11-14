
import java.util.*;

public class sumofdigits{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int last=0;
        while(n>0)
        {
            last=n%10;
            sum=sum+last; 
            n=n/10;
        }
        System.out.println(sum);
    }
}