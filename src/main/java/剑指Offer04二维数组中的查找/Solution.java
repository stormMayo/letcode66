package 剑指Offer04二维数组中的查找;


public class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int i = matrix.length-1;
        int j = 0;
        while (i>= 0 && j<matrix[0].length){
            if(target < matrix[i][j]){
                i--;
            }else if(target > matrix[i][j]){
                j++;
            }else {
                return true;
            }
        }
        return false;
    }
}
