public class linear{
    public static int  linear(int n[],int key){
      for(int i=0;i<n.length;i++)
      {
        if(n[i]==key)
        {
            return i;
        }
        
      }
      return -1;
    }
    public static void main(String[]args){
        int n[]={2,4,6,8,10,12,14,16};
        int key=16;
        int index=linear(n,key);
        if(index==-1)
        {
            System.out.println("not found key");
        }
        else
        {
            System.out.println("index"+index);
        }
    }
}