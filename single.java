public class single {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        int result = singleNumber(nums);
        System.out.println("Single number is: " + result);
    }
    public static int singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }

        return xor;
    }
}
