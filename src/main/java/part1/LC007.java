package part1;

public class LC007 {
    public static int reverse(int x) {
        if (x == 0 || x <= Integer.MIN_VALUE) return 0;
        int temp = Math.abs(x);
        StringBuilder sb = new StringBuilder();
        while (temp > 0) {
            sb.append(temp % 10);
            temp = temp / 10;
        }
        int res = 0;
        if (Long.valueOf(sb.toString()) > Integer.MAX_VALUE) {
            return res;
        } else {
            res = Integer.valueOf(sb.toString());
        }
        if (x < 0) {
            res = 0 - res;
        }
        return res;
    }

    public static void main(String[] args) {
        reverse(-2147483648);
    }
}
