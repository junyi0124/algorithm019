/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */
package Q001;

import java.util.*;

// @lc code=start
class leetCode001 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
       return new int[] {};
    }
}
// @lc code=end

