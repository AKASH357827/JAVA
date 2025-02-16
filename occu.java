public class occu{
    public static void   occur(int a[],int key,int i) {
        if(a[i]==a.length){
            return;
        }
        if(a[i]==key){
            System.out.println(i);
        }
        occur(a,key,i+1);
        
    }
    public static void main(String[]args){
    int a[]={2,4,6,3,6,7,74,3,5,3,5,6,2};
    occur(a,4,0);
    }
    
}