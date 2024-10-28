public class bintodec{

    public static void  bindec(int binnum){
        int pow=0;
        int decnum=0;
        while(binnum>0){
          int lastdigit=binnum%10;
          decnum=decnum +(lastdigit*(int)Math.pow(2, pow));
          pow++;
          binnum=binnum/10;
        }
        System.out.println(decnum);
    }
    public static void main(String[]args){
      bindec(101);
    }
}