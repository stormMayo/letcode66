package 剑指Offer42连续子数组的最大和;



//[-2,1,-3,4,-1,2,1,-5,4]
//要计算连续子数组最大和，遍历数组，计算每个以nums[i]结尾的最大和即可（需要包含nums[i]），另外dp[i-1]hu
//会对dp[i]产生影响
public class SolutionTemp {
    public static void main(String[] argus){
        int[] s = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int i = maxSubArray(s);
        System.out.println(i);
    }

    public static  int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max_res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i-1] + nums[i],nums[i]);
            max_res = Math.max(max_res, dp[i]);
        }
        return max_res;
    }
}
