package 剑指Offer21调整数组顺序使奇数位于偶数前面;

public class SolutionTemp {
    public int[] exchange(int[] nums) {
        int i=0,j =nums.length-1,tmp;
        while (i < j){
            //寻找偶数
            while (i<j && (nums[i] & 1) == 1)  i++;
            //寻找奇数
            while (i<j && (nums[j] & 1) == 0 ) j--;
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        return nums;
    }
}
