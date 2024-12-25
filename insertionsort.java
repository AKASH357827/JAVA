public class insertionsort {
    public static void main(String[] args) {
        int a[] = {5, 4, 7, 3, 6, 2};
        
        for (int i = 1; i < a.length; i++) {
            int curr = a[i]; 
            int prv = i - 1; 
            while (prv >= 0 && a[prv] > curr) {
                a[prv + 1] = a[prv]; 
                prv--;
            }
            a[prv + 1] = curr;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
