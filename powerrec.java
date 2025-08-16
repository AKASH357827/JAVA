public class powerrec{
    public static int p(int x,int n){
        if(n==0){
            return 1;
        }
        int f=x*p(x,n-1);
        return f;
        }
    public static void main(String[]args){
     int x=2;
     int n=5;
    System.out.println(p(x,n));
    }
}