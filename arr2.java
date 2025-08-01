public class arr2{
    public static void main(String[] args) {
        int a[][]={{4,7,8},{8,8,7}};
        int c=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length ; j++) {
                if(a[i][j]==7){
                    System.out.println(c);
                    c++;
                    
                }
            }
        }
    }
}