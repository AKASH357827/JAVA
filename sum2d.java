public class sum2d{
    public static void sum1(int a[][]){
        int sum=0;
       for(int i=1;i<a.length-1;i++){
        for(int j=0;j<a.length;j++){
              sum=sum+a[i][j];
        }
       }
       System.out.println(sum);
    }
    public static void main(String[]args){
        int a[][]={{1,4,9},{11,4,3},{2,2,3}};
        sum1(a);
    }
}