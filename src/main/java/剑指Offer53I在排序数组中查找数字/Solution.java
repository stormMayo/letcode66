
package 剑指Offer53I在排序数组中查找数字;

/*
统计一个数字在排序数组中出现的次数。
*/

public class Solution {
    public int search(int[] nums, int target) {
        int result = 0;
        for (int num : nums) {
            if(num ==target) result++;
        }
        return result;
    }
    //二分法
    public int search1(int[] nums, int target) {
        //查找左右边界
        int i= 0 , j = nums.length - 1;
        //查找右边界
        while (i <= j){
            int mid = (i + j) / 2;
            if(nums[mid] < target){
                i = mid + 1;
            }else if(nums[mid] > target){
                j = mid-1;
            }else if(nums[mid] == target){
                //收缩左边界
                i = mid+1;
            }
        }
        int right = i;
        if(j >=0 && nums[j] != target) return 0;

        i= 0;
        j = nums.length - 1;
        //查找左边界
        while (i <= j){
            int mid = (i + j) / 2;
            if(nums[mid] < target){
                i = mid + 1;
            }else if(nums[mid] > target){
                j = mid-1;
            }else if(nums[mid] == target){
                //收缩又边界
                j = mid-1;
            }
        }
        int left = j;
        return right - left -1;

    }

}
