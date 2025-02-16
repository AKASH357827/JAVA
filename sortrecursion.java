public class sortrecursion{
    public static void   mai(int n) {
        if(n==0){
            System.out.println(n);
            return; 
        }
        
        mai(n-1);
        System.out.println(n+"");
        
    }
    public static void main(String[]args){
        int n=10;
        mai(n);
    }
}