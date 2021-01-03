package l557;

//easy
class Solution {
    public String reverseWords(String s) {
        StringBuffer ret = new StringBuffer();
        int length = s.length();
        int i = 0;
        while (i < length) {
            int start = i;
            while (i < length && s.charAt(i) != ' ') {
                i++;
            }
            for (int p = start; p < i; p++) {
                ret.append(s.charAt(start + i - 1 - p));
            }
            while (i < length && s.charAt(i) == ' ') {
                i++;
                ret.append(' ');
            }
        }
        return ret.toString();
    }

    public void swap(char a, char b) {
        char temp;
        temp = a; a = b; b = temp;
    }

    public static void main(String[] args) {
        var sol = new Solution();
        System.out.println(sol.reverseWords("Let's take LeetCode contest"));
    }
}