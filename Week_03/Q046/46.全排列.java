package Q046;/*
 * @lc app=leetcode.cn id=46 lang=java
 *
 * [46] 全排列
 */

import java.util.*;

// @lc code=start
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<>();

        dfs(nums, 0, new ArrayList<Integer>(), res);
        return res;
    }

    public void dfs(int[] nums, int curr, List<Integer> list, List<List<Integer>> res){
        for (int i=curr;i<nums.length;++i){
            swap(nums, curr, i);
            list.add(nums[curr]);
            if (list.size() == nums.length){
                res.add(new ArrayList<Integer>(list));
            }
            dfs(nums, curr+1, list, res);
            swap(nums, curr, i);
            list.remove(list.size()-1);
        }
    }

    public void swap(int[] nums, int m, int n){
        int tmp = nums[m];
        nums[m] = nums[n];
        nums[n] = tmp;
    }
}
// @lc code=end

