public class bitwise{
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        a = a ^ b;  
        b = a ^ b;  
        a = a ^ b;  
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
