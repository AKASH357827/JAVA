import java.util.Scanner;
class selectionSort
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10],ind=0;
        for (int i = 0; i < 10; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("array is:");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        for (int i = 0; i < 10; i++) {
           int min=arr[i];
            for (int j = i+1; j < 10; j++) {
                if(arr[j]<min)
                {
                    min=arr[j];
                    ind=j;
                }
            }
            int tem=arr[i];
            arr[i]=min;
            arr[ind]=tem;
        }
        System.err.println("sorted array:");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");

    }
}