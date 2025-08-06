public class last {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s1 = "Hello World";
        System.out.println(sol.lengthOfLastWord(s1)); 
    }
}
class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;       
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
}
