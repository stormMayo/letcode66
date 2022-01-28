package 剑指Offer10I斐波那契数列;
/*
写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项（即 F(N)）。斐波那契数列的定义如下：

        F(0) = 0,   F(1) = 1
        F(N) = F(N - 1) + F(N - 2), 其中 N > 1.

        来源：力扣（LeetCode）
        链接：https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof
        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
*/

public class Solution {
    public int fib(int n) {
        if(n < 2) return n;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2 ; i<= n ;i++){
            dp[i] = dp[i-1] + dp[i-2];
            dp[i] %= 1000000007;
        }
        return dp[n];
    }

    public int fib1(int n) {
        int a =0 ,b = 1,sum;
        for(int i = 0 ; i < n ;i++){
            sum = (a+b)%1000000007;
            a = b;
            b=sum;
        }
        return a;
    }
}
