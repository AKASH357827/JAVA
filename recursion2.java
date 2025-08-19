public class recursion2{
       public static void  r(int i,int n[],int key){
        if(i==n.length){
            return ;
        }
        if(n[i]==key){
            System.out.println(i);
        }
        r(i+1,n,2);
       }
       public static void main(String[] args) {
           int n[]={3,2,4,5,6,2,7,2,2};
           int i=0;
           int key=2;
           r(i,n,key);
       }
}