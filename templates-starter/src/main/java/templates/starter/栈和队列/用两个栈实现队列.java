package templates.starter.栈和队列;

import java.util.Stack;

public class 用两个栈实现队列 {
    /**
     * 题目：用两个栈实现一个队列。队列的声明如下，请实现它的两个函数appendTail和deleteHHead，分别完成在队列尾部插入节点和在队列头部删除节点的功能。
     */

    public static class Queue{
        private Stack<Integer> stack1;
        private Stack<Integer> stack2;
        public Queue(){
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        /**
         *
         * @param val
         * @return
         */
        public void appendTail(Integer val){
            stack1.add(val);
        }

        public Integer deleteHead()throws Exception{
            if(stack2.isEmpty()){
                while(!stack1.isEmpty()){
                    stack2.add(stack1.pop());
                }
            }
            if(stack2.isEmpty()){
                throw new Exception("queue is empty");
            }
            Integer val = stack2.pop();
            return val;
        }

    }








}
