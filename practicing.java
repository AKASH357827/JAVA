public class practicing {
    public static void main(String []args) {
        int a[]={1,2,6,3,6,22,5,2};
        int large=0;
        int i=0;
        for(i=0;i<a.length-1;i++){
            if(large<a[i]){
                large=a[i];
            }
        }
        System.out.println("the largest number is "+large);
    }
}
