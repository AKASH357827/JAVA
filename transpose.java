public class transpose {
    public static void transpose(int a[][]) {
        int rows = a.length;        
        int cols = a[0].length;       
        int tem[][] = new int[cols][rows];
         for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                tem[j][i] = a[i][j];  
            }
        }
        for (int i = 0; i < cols; i++) { 
            for (int j = 0; j < rows; j++) {
                System.out.print(tem[i][j] + " "); 
            }
            System.out.println(); 
        }
    }
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3}, {21, 22, 23}}; 
        transpose(a); 
    }
}
