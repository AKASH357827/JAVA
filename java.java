public class java{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int key=3;
        int count=0;
        for (int i=1;i<a.length;i++) {
          int temp=a[i];
          a[a.length-i  *]=temp;
        }
            for(int j=0;j<a.length;j++){
                System.out.println(a[j]);
            }
        
    }
}