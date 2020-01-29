package part2;

public class LC11 {
    public static int maxArea(int[] height) {
        int h = 0;
        int l = 0;
        int max = 0;

        for (int i = 0; i < height.length; i++) {
            h = height[i];
            for (int j = 0; j < height.length; j++) {
                l = Math.abs(j - i) ;
                if (height[i] <= height[j]) {
                    max = max > h * l ? max : h * l;
                }
            }
        }
        return max;
    }


    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}
