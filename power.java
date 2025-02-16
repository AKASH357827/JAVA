public class power{
    public static int  pow(int x,int n) {
      if(n==0){
        return 1;
      }
        int xn=x*pow(x, n-1);
        return xn;
    }
    public static void main(String[]args)
    {
    System.err.println(pow(2,8));
    }
}