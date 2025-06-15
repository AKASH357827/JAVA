public class reverse {

    public static void reverse(int[] a) {
        int first=0,last=a.length-1;
        for(int i=0;i<a.length;i++){
            int temp=a[last];
            a[last]=a[first];
            a[first]=temp;
        }
        for(int i =0;i<a.length;i++){
          System.out.print(a[i]);
        }
       System.out.println(" ");
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        reverse(a);
    }
}
