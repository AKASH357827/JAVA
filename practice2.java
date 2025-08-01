

public class practice2{
    public static int   arr(int  a[][],int key){
      int count=0;
        for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
            if(key==a[i][j])
            {
                count++;
            }
        }
      }
      System.out.println( key+" is present "+count+ " times ");
      return count;
    }
    public static void main(String[] args) {
        int a[][]={{4,7,8},{8,8,7}};
        int key=7;
        arr(a,key);
    }
}