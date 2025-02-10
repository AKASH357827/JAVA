public class print{
    public static void printdec(int i){
        int n=10;
        if(i==n){
            System.out.println(""+n);
        return;
       }
       System.out.println(""+i);
       printdec(i+1);
    }
    public static void main(String[]args){
        int i=1;
        printdec(i);
    }
}