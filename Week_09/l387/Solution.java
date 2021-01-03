package l387;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

//easy 字符串中的第一个唯一字符
public class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> charDict = new HashMap<Character, Integer>();
        //统计一遍
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            charDict.put(ch, charDict.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < s.length(); ++i) {
            if (charDict.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public int firstUniqChar2(String s) {
        Map<Character, Integer> position = new HashMap<Character, Integer>();
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            char ch = s.charAt(i);
            if (position.containsKey(ch)) {
                position.put(ch, -1);
            } else {
                position.put(ch, i);
            }
        }
        int first = n;
        for (Map.Entry<Character, Integer> entry : position.entrySet()) {
            int pos = entry.getValue();
            if (pos != -1 && pos < first) {
                first = pos;
            }
        }
        if (first == n) {
            first = -1;
        }
        return first;
    }

    public int firstUniqChar3(String s) {
        Map<Character, Integer> position = new HashMap<>();
        Queue<Pair> q = new LinkedList<>();
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            char ch = s.charAt(i);
            if (!position.containsKey(ch)) {
                position.put(ch, i);
                q.offer(new Pair(ch, i));
            } else {
                position.put(ch, -1);
                while (!q.isEmpty() && position.get(q.peek().ch) == -1) {
                    q.poll();
                }
            }
        }
        return q.isEmpty() ? -1 : q.poll().pos;
    }



    public static void main(String[] args) {
        var sol = new Solution();
        int n = sol.firstUniqChar3("leetcode");
        System.out.println("n= "+ n);

        n = sol.firstUniqChar3("loveleetcode");
        System.out.println("n= "+ n);
    }
}

class Pair {
    char ch;
    int pos;

    Pair(char ch, int pos) {
        this.ch = ch;
        this.pos = pos;
    }
}
