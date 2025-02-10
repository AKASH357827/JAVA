public  class sum{
    public static int sums(int n) {
      
      if(n==0){
        return 0;
      }
    n=n+sums(n-1);
    return n;
    }
    public static void main(String[] args) {
        int n=15;
        sums(n);
        System.out.println(sums(n));
    }
}