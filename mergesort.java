public class mergesort{
     public static void mer(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"");
        }
         System.out.println(" ");
     }
     public static void merge(int arr[],int si,int ei) {
         if(si>=ei){
            return;
         }
         int mid=(si+ei)/2;
         merge(arr, si,mid);
         merge(arr,mid+1,ei);
         mergesort1(arr,si,mid,ei);
     }
     public static void mergesort1(int arr[],int si,int mid,int ei) {
         int[] temp=new int[si-ei+1];
         int i=si;
         int j=mid+1;
         int k=0;
         while(i<=mid&&j<ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
         }
         while(i<=mid){
            temp[k++]=arr[i++];
         }
         while(j<=ei){
            temp[k++]=arr[j++];
         }
         for(k=0,i=si;k<temp.length;k++,i++){
        arr[i]=temp[k];
         }
     }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        merge(arr,0,arr.length-1);
        mer(arr);
    }
}