package Qize1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1 {
    public static int jump(int[] nums) {
        int length;
        if ((length = nums.length) == 0) return 0;
        int rightmost = 0;
        for (int i = 0; i < length; ++i) {
            if (i <= rightmost) {
                rightmost = Math.max(rightmost, i + nums[i]);
                if (rightmost >= length - 1) {
                    return i + 1;
                }
            }
        }
        return 0;
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        // 枚举 a
        for (int first = 0; first < n; ++first) {
            // 需要和上一次枚举的数不相同

            for (int second = 1; second < n; second++) {
//                if (second > 1 && (nums[second] == nums[first - 1]/* || nums[second] == nums[first]*/)) {
//                    continue;
//                }
                if (first > 0 && (nums[first] == nums[first - 1] || nums[second] == nums[first])) {
                    continue;
                }
                // c 对应的指针初始指向数组的最右端
                int fourth = n - 1;
                //int target = -nums[first];
                // 枚举 b
                for (int third = first + 1; third < n; ++third) {
                    // 需要和上一次枚举的数不相同
                    if (third > first + 1 && nums[third] == nums[third - 1]) {
                        continue;
                    }
                    // 需要保证 b 的指针在 c 的指针的左侧
                    while (third < fourth && nums[third] + nums[fourth] > target) {
                        --fourth;
                    }
                    // 如果指针重合，随着 b 后续的增加
                    // 就不会有满足 a+b+c=0 并且 b<c 的 c 了，可以退出循环
                    if (third == fourth) {
                        break;
                    }
                    if (nums[first]+nums[second]+nums[third] + nums[fourth] == target) {

                        List<Integer> list = new ArrayList<Integer>();
                        list.add(nums[first]);
                        list.add(nums[second]);
                        list.add(nums[third]);
                        list.add(nums[fourth]);
                        ans.add(list);
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
//        int[] nums = new int[]{2, 2, 1, 1, 4};
//        int result = jump(nums);
//        System.out.println(result);

        int[] nums = new int[]{1, 0, -1, 0, -2, 2};
        List<List<Integer>> result = fourSum(nums, 0);
        for (int i = 0; i < result.size(); i++) {
            result.get(i).forEach(x-> System.out.print(x + " "));
            System.out.println("next");
        }
    }
}
