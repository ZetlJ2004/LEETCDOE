package com.algorithm.DoublePointArrary.QuickSlowPointer;

public class RemoveNums {
}
class Solution2 {
    public void moveZeroes(int[] nums) {
        // 去除 nums 中的所有 0，返回不含 0 的数组长度
        int p = removeElement(nums, 0);
        // 将 nums[p..] 的元素赋值为 0
        for (; p < nums.length; p++) {
            nums[p] = 0;
        }
    }
    int removeElement(int[] nums, int val){

        return val;
    }
}