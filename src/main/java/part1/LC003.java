package part1;

public class LC003 {
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        int start = 0;
        int end = 1;
        if (s.isEmpty()) {
            return 0;
        }
        while (end < s.length()) {
            String temp = s.substring(start, end);
            char cur = s.charAt(end);
            if (temp.contains(String.valueOf(cur))) {
                start++;
                max = max > temp.length() - 1 ? max : temp.length() - 1;
            } else {
                if (end < s.length()) {
                    end++;
                    max = max > temp.length() ? max : temp.length();
                }
            }

        }
        return max + 1;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcde"));
    }

}
