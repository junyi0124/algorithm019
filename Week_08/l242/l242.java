package l242;
//242. 有效的字母异位词(简单）
class Solution242 {

    public static void main(String[] args) {
        final boolean result = isAnagram("cat", "act");
        System.out.println( result);
    }

    public static boolean isAnagram(String s, String t) {
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
}