
import java.util.*;

public class palindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=0;
        int m=n;
        while(n>0){
        int last=n%10;
        temp=temp*10+last;
        n=n/10;
        }
        if(temp==m)
        {
            System.out.println("its a palindrome");
        }
        else{
            System.out.println("its not a palindrome");
        }
    }
}





