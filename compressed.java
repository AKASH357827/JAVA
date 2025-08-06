
public class compressed {

    public static void main(String[] args) {
        String newstr = "";
        String str = "aaaaabbbbbbbbccccccc";

        for (int i = 0; i < str.length(); i++) {
            int count = 1;

            while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newstr += str.charAt(i);
            if (count > 1) {
                newstr += count;
            }
        }

        System.out.println(newstr);
    }
}
