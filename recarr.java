public class recarr {
    public static int s(int a[], int m, int i) {
        if (i == m - 1) {
            System.out.println("It is sorted");
            return 1;
        }
        if (a[i] > a[i + 1]) {
            System.out.println("It is not sorted");
            return 0;
        }
        return s(a, m, i + 1);
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int m = a.length;
        int i = 0;
        s(a, m, i);
    }
}
