public class pairsarray{
    public static void main(String[]args)
    {
        int n[]={2,4,6,8,10};
        int c=0;
        for(int i=0;i<n.length;i++){
            c=n[i];
            for(int j=i+1;j<n.length;j++)
            {
                System.out.println("("+c+","+n[j]+")");
            }
            
        }
        System.out.println();    
    }
}