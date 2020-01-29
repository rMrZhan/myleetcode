package part2;

public class LC12 {
    public static String longestCommonPrefix(String[] strs) {

        int minLen = strs[0].length();
        boolean flag =true;
        int len = 0;
        for (int i = 0; i < strs.length; i++) {
            minLen = minLen < strs[i].length() ? minLen : strs[i].length();
        }
        for (int j = 0; j < minLen; j++) {
            char c = strs[0].charAt(j);
            for (int k = 0; k < strs.length ; k ++) {
                char cur = strs[k].charAt(j);
                if (cur != c) {
                    return strs[0].substring(0, len);
                }
            }
            len++;
        }
        return strs[0].substring(0, len);
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{""}));
    }
}
