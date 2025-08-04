
public class stri {

    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        String path = "WNEENESENNN";
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if (dir == 'S') {
                y--;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'W') {
                x--;
            } else {
                x++;
            }

        }
        int x1 = x * x;
        int y1 = y * y;
        System.out.println((float) Math.sqrt(x1 + y1));
    }
}
