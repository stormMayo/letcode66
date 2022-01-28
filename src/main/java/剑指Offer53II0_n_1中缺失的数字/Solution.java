
package 剑指Offer53II0_n_1中缺失的数字;

/*
一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。
在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。

排序数组中的搜索问题，首先想到二分法查找
*/

public class Solution {
    public int missingNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i){
                return i;
            }
        }
        return  nums.length;
    }

    //缺失的数字等于 “右子数组的首位元素” 对应的索引
    public int missingNumber1(int[] nums) {
        int i = 0 ,j = nums.length - 1;
        while (i <= j){
            int mid = (i + j) / 2;
            if(nums[mid] == mid){
                i = mid +1;
            }else {
                j = mid -1;
            }
        }
        return  i;
    }
}
