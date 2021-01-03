package l917;

import java.util.Stack;

//easy
class Solution {
    public String reverseOnlyLetters(String S) {
        Stack<Character> letters = new Stack();
        for (char c: S.toCharArray())
            if (Character.isLetter(c))
                letters.push(c);

        StringBuilder ans = new StringBuilder();
        for (char c: S.toCharArray()) {
            if (Character.isLetter(c))
                ans.append(letters.pop());
            else
                ans.append(c);
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        var sol = new Solution();
        System.out.println(sol.reverseOnlyLetters("ab-cd"));
        System.out.println(sol.reverseOnlyLetters("a-bC-dEf-ghIj"));
        System.out.println(sol.reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }
}