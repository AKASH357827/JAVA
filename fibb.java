public class fibb {
    public static int print(int n) {
      if(n==0||n==1){
        return n;
      }
      int f1=print(n-1);
      int f2=print(n-2);
      int m=f1+f2;
      return m;
    
    
    
    }

    public static void main(String[] args) {
        int n =2;
        System.out.println(print(n));
    }
}
