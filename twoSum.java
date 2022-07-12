public class twoSum {

    private static int[] nums = { 2, 7, 11, 15 };
    private static int target = 9;

    public static int[] solution(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int y = i + 1; y < nums.length; y++) {
                if (nums[i] == target - nums[y]) {
                    return new int[] { i, y };
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {

        solution(nums, target);

    }

}
