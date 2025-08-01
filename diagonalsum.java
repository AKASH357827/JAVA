public class diagonalsum{
    public static int  matirx1(int matirx[][]){
    int sum=0;
    for(int i=0;i<matirx.length;i++){
        for(int j=0;j<matirx.length;j++){
            if(i==j){
                sum=sum+matirx[i][j];
            }
            else if(i+j==matirx.length-1){
                sum=sum+matirx[i][j];
            }
        }
    }
    return sum;
    }
       public static void main(String[] args) {
       int matirx[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
       System.out.println(matirx1(matirx));
   }
}
