public class number{
    public static int num(int n){
        
    if(n==0){
        return 0;
    }
    int  n1=n+num(n-1);
    return n1;

    }
    public static void main(String[] args) {
        int n=5;
       System.out.println( num(n));
    }
}