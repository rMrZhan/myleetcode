package part1;

public class LC001 {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        int a = 0;
        int b = 0;
        for (int i = 0; i < nums.length; i++) {
            a = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                b = nums[j];
                if (a + b == target) {
                    res = new int[]{i, j};
                }
            }
        }
        return res;
    }
}
