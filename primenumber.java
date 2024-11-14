
import java.util.*;

public class  primenumber{
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        int n=sc.nextInt();
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0){
            System.out.println("it is not a prime number");
            System.exit(0);
        }}

        System.out.println("it is a prime number");
    }
}