public class fibonnaci{
    public static int  f(int n){
        if(n==0||n==1){
            return n;
        }
        int f1=f(n-1);
        int f2=f(n-2);
        int fn=f1+f2;
        return fn;
        
    }
    public static void main(String[]args){
        int n=25;
        f(n);
        System.out.println(f(n));
    }
}