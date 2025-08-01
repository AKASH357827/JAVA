public class occu{
    public static int occur(int a[],int key,int i) {
        if(a[i]==a.length){
            return -1;
        }
        if(a[i]==key){
            return i;
        }
       return  occur(a,key,i+1);
    
    }
    public static void main(String[]args){
    int a[]={2,4,6,3,6,7,74,3,5,3,5,6,2};
    System.out.println(occur(a,3,0));
    }
    
}