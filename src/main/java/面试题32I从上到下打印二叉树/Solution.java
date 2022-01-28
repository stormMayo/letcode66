package 面试题32I从上到下打印二叉树;


import java.util.ArrayList;
import java.util.LinkedList;

public class Solution {

    public int[] levelOrder(TreeNode root) {
        if(root == null) return new int[0];
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        ArrayList<Integer> ans = new ArrayList<>();
        while (!queue.isEmpty()){
            TreeNode node = queue.pop();
            ans.add(node.val);
            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }
        }
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        return result;
    }

}


