package 剑指Offer32II从上到下打印二叉树II;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> resultList = new ArrayList<>();
        if(root == null ) return resultList;

        Queue<TreeNode> queue = new LinkedList<TreeNode>(){{add(root);}};
        while (!queue.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            for (int i = queue.size(); i >0 ; i--) {
                TreeNode node = queue.poll();
                temp.add(node.val);
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null) {
                    queue.add(node.right);
                }
            }
            resultList.add(temp);
        }
        return resultList;
    }
}
