public class firsts {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";

        int result = strStr(haystack, needle);

        System.out.println("First occurrence index: " + result);
    }

    public static int strStr(String haystack, String needle) {
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            String c = "";
            for (int j = 0; j < needle.length(); j++) {
                if (needle.charAt(j) == haystack.charAt(i + j)) {
                    c = c + needle.charAt(j);
                } else {
                    break;
                }
            }
            if (needle.equals(c)) {
                return i; 
            }
        }
        return -1;
    }
}
