
import java.util.Scanner;

public class bitmanupulation{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int bit=1;
        if((a & bit)==1 ){
            System.out.println("odd");
        }
        else{
            System.out.println("even");
        }

    }
}