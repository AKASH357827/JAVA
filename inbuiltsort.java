import java.util.Arrays;

public class inbuiltsort{
    public static void main(String[]args){
      int a[]={8,2,5,4,9,11,56};
      Arrays.sort(a);
      for (int i = 0; i < a.length; i++) {
        System.out.print(a[i] + " ");
    }
    System.out.println();
    }
}