public class factorialr{
    public static int  fac(int f){
        if(f==0){
            return 1;
        }
        int fn=f*fac(f-1);
        return fn;
        
        
    }
    public static void main(String[]args){
        int f=5;
        fac(f);
        System.out.println(fac(f));
    }
}