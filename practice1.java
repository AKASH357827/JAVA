import java.util.*;
public class  practice1{
    public static boolean  isprime(int n){
    
    for(int i=2;i<=n/2;i++)
    {
        if(n%i==0){
        return  false;
    }
    }
    return true;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        if(isprime(i))
        System.out.println(i+" ");   
    }
}