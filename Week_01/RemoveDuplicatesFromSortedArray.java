package Week_01;
/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除排序数组中的重复项
 */

// @lc code=start


public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        // 长度
        int len = nums.length;

        int i = 0;
        for(int j = 1; j <len; j++ ){ 
            // 判单重复
            if (nums[j] != nums[i]) {
                // 如果重复，则向慢指针存入数字
                nums[i + 1] = nums[j];
                // 慢指针前移
                i++;
            }
        }
        return i + 1;
    }

    // 官方方法
    public int removeDuplicates_Offical(int[] nums) {
        // 特例直接处理
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
    
}
