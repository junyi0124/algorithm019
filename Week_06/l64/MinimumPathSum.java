package Week_06.l64;

/*
 * @lc app=leetcode.cn id=64 lang=java
 *
 * [64] 最小路径和
 */

// @lc code=start
class Solution {
    public static int minPathSum(int[][] grid) {
        // return 0 if input is invalid
        if (grid == null || grid.length == 0 || grid[0].length == 0)
            return 0;
        // init dp matrix
        int row = grid.length, col = grid[0].length;
        int[][] dp = new int[row][col];
        dp[0][0] = grid[0][0];
        // first row and column of dp matrix
        for (int i = 1; i < row; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
            System.out.println("dp["+i+"][0]=" + dp[i][0]);
        }
            
        for (int j = 1; j < col; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
            System.out.println("dp[0]["+j+"]=" + dp[0][j]);
        }
            

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
                System.out.println("dp["+i+"]["+j+"]=" + dp[i][j]);
            }
        }
        return dp[row - 1][col - 1];
    }

    public static void main(String[] args) {


        /**
         * 1, 2   1, 3
         * 5, 6   6, 9
         * 1, 1   7, 8
         */
        int path3 = minPathSum(new int[][] { { 1, 2 }, { 5, 6 }, { 1, 1 } });
        System.out.println(path3);


        /**
         * 1, 3, 1
         * 1, 5, 1
         * 4, 2, 1
         */
        int path = minPathSum(new int[][] { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } });
        System.out.println(path);

        /**
         * 1, 2, 3
         * 4, 5, 6
         */
        int path2 = minPathSum(new int[][] { { 1, 2, 3 }, { 4, 5, 6 } });
        System.out.println(path2);
    }
}
// @lc code=end
