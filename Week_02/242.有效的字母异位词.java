/*
 * @lc app=leetcode.cn id=242 lang=java
 *
 * [242] 有效的字母异位词
 */

// @lc code=start
import java.util.Arrays;

public class leetCode242 {

    /**
     * 使用计数器
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] counter = new int[26];

        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            if (--counter[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 暴力破解
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram_b(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1, chars2);
    }

}
// @lc code=end

