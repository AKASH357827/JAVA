public class reversearray{
    public static void main(String[]args)
    {
        int n[]={2,4,6,8,10,12,13,34,21};
        int first=0;
        int last=n.length-1;
        while(first<last)
        { System.out.println("hi");
            int temp=n[last];
            n[last]=n[first];
            n[first]=temp;
            first++;
            last--;
        }
        for(int i=0;i<n.length;i++)
        System.out.print(n[i]+" ");
    }
}