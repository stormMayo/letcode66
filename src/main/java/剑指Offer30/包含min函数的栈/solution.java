package 剑指Offer30.包含min函数的栈;

import java.util.Stack;

/**
 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，
 分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class solution {
    public static void main(String[] argus) {


    }

    static  class MinStack {
        Stack<Integer> A,B;
        /** initialize your data structure here. */
        public MinStack() {
            A = new Stack<>();
            B = new Stack<>();
        }

        public void push(int x) {
            A.add(x);
            if(B.isEmpty()){
                B.add(x);
            }else if(B.peek() > x || B.peek().equals(x)){
                B.add(x);
            }
        }

        public void pop() {
            Integer popA = A.pop();
            if(B.peek().equals(popA)){
                B.pop();
            }
        }

        public int top() {
            return A.peek();
        }

        public int min() {
            return B.peek();
        }
    }

}
