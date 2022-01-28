
package 剑指Offer03数组中重复的数字;

//在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
// 数组中某些数字是重复的，但不知道有几个数字重复了，
// 也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> asertSet = new HashSet<>();
        int result = -1;
        for (int num : nums) {
            if(asertSet.contains(num)){
                result = num;
                break;
            }else {
                asertSet.add(num);
            }
        }
        return result;
    }
}
