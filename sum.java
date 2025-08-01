
public class sum {

    public static void main(String[] args) {
        int sum = 0;
        int f = 0;
        for (int i = 0; i <= 3; i++) {
            if(i==1) {
                f = 0;
            }
             else if(i==0) {
               f=0;
            }
            else{
                f = i - 1;
            }
            sum = sum + i;
            System.out.println("First value " + f + " Second value " + sum);
        }
    }
}
