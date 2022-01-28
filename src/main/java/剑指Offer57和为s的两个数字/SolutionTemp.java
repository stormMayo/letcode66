package 剑指Offer57和为s的两个数字;

import java.util.HashSet;

public class SolutionTemp {
    public int[] twoSum(int[] nums, int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(target - nums[i])){
                return new int[]{nums[i],target-nums[i]};
            }
            set.add(nums[i]);
        }
        return new int[0];
    }

    public int[] twoSum1(int[] nums, int target) {
        int i = 0 ,j = nums.length - 1;
        while (i < j){
            if((nums[i] + nums[j]) < target){
                i++;
            }else if((nums[i] + nums[j]) > target){
                j--;
            }else {
                return new int[]{nums[i],nums[j]};
            }
        }
        return new int[0];
    }
}
