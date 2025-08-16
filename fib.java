public class fib {
    public static int print(int n) {
        if (n == 0) {
            return 1; 
        }
       
        int f2 = n * print(n-1);       
        return f2;             
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(print(n));
    }
}
