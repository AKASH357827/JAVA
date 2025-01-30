public class oops{
    public static void main(String[]args)
    {
     student s1=new student();
     student s2=new student("akash");
     student s3=new student(234);
    
    }
}
class student{
    String name;
    int roll;
    student(){
        System.out.println("sdhvbsdjhbd");
    }
    student(String name){
        this.name=name;
        
    }
    student(int roll){
        this.roll=roll;
    }
} 