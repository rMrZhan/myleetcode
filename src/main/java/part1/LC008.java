package part1;

public class LC008 {
    public static int myAtoi(String str) {
        String temp = str.trim();
        if (temp == null || temp.trim() == null || temp.length() == 0) {
            return 0;
        }
        char[] chars = temp.toCharArray();
        if (chars[0] != '+' && chars[0] != '-' && !find(chars[0])) {
            return 0;
        }
        if (chars.length == 1 && !find(chars[0]) ) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (find(chars[i])) sb.append(chars[i]);
            if (chars[i] == '.') break;
            if(i == 1) if(chars[i] == '-' || chars[i] == '+') return 0;
        }

        if (chars[0] != '-' && Long.valueOf(sb.toString()) >= Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (-Long.valueOf(sb.toString()) <= Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else {
            if (chars[0] == '-') {
                return 0 - Integer.valueOf(sb.toString());
            } else {
                return Integer.valueOf(sb.toString());
            }

        }
    }

    public static boolean find(char c) {
        if ((c >= '0' && c <= '9')) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("  -0012a42"));
    }
}
