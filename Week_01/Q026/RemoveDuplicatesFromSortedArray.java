package Q026;
/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除排序数组中的重复项
 */

// @lc code=start


import java.util.Arrays;
import java.util.stream.Stream;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        // 长度
        int len = nums.length;

        int i = 0;
        for (int j = 1; j < len; j++) {
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
    public static int removeDuplicates_Offical(int[] nums) {
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

    public static int remove_foo(int[] numbers) {
        int i = 0, j = 1;
        for (; j < numbers.length; j++) {
            if (numbers[j] != numbers[i]) {
                i++;
                numbers[i] = numbers[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] num = new int[]{1, 1, 2, 2, 3, 3, 3, 6, 8, 9};
        int result = remove_foo(num);

        System.out.println("result is " + result);
        System.out.print("array is [");
        Arrays.stream(num).forEach(x -> System.out.print(x + " "));
        System.out.println("]");
    }
}
