package 剑指Offer11旋转数组的最小数字;

public class Solution {
    public int minArray(int[] numbers) {
        int i = 0 ;
        int j = numbers.length - 1;
        while (i < j){
            int m = (i+j)/2;
            if(numbers[m] > numbers[j]){
                //m点在左排列数组，需要缩小i范围
                i= m+1;
            }else if(numbers[m] < numbers[j]){
                //m在右排序数组中，需要缩减j范围
                j = m;
            }else{
                j--;
            }
        }
        return numbers[i];
    }
}
