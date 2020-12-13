package Week_06.l91;

/*
 * @lc app=leetcode.cn id=91 lang=java
 *
 * [91] 解码方法
 */

// @lc code=start
class Solution {
    public int numDecodings(String s) {
        if(s==null || s.length()==0) return 0;
        char[] nums = s.toCharArray();
        int len = nums.length;
        int[] dp = new int[len+1];  // dp[i] 表示从第i+1个数到第n个数的所有方案数
        dp[len] = 1;
        // 从右往左
        for(int i = len-1; i >= 0; i--) {
            // 注意判断0字符
            if (nums[i] == '0') continue;   // 当开始位为0字符时不满足任意一个字母的解析，跳过
            int num = 0;
            for (int j = i; j < len && j-i<2; j++) {
                num = num*10 + (nums[j]-'0');
                // 对子状态dp[j+1]为0开头的也可进行添加，因为没有赋值为dp[j+1]为0
                if (num <= 26) dp[i] += dp[j+1];
            }
        }
        return dp[0];
    }
}
// @lc code=end