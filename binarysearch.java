



public class binarysearch{
    public static void main(String[]args){
        int n[]={2,5,7,12,15,19,22,27,39,57};
        int key=100;
        int start=0;
        int end=n.length-1;
        int mid=0;
        while(start<=end){
        mid=(start+end)/2;
        if(n[mid]==key){
        System.out.println("elemt found "+mid);
        break;
        }
        else if(n[mid]>key)
        end=mid-1;
        else
        start=mid+1;
     }
    
    if(start>=end)
    System.out.println("key not found");
        }
}