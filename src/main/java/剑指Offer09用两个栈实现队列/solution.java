package 剑指Offer09用两个栈实现队列;

import java.util.Stack;

/**
 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class solution {
    static class CQueue {

        Stack<Integer> stack1,stack2;
        public CQueue() {
            stack1 = new Stack();
            stack2 = new Stack();
        }

        public void appendTail(int value) {
            stack1.add(value);
        }

        public int deleteHead() {
            if(!stack2.isEmpty()) return stack2.pop();
            if(stack1.isEmpty()) return -1;
            while (!stack1.isEmpty())
                stack2.add(stack1.pop());
            return stack2.pop();
        }
    }

}
