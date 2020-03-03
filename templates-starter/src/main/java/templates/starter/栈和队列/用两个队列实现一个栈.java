package templates.starter.栈和队列;

import java.util.LinkedList;
import  java.util.Queue;

public class 用两个队列实现一个栈 {

    public static class Stack {
        private Queue<Integer> queue1;
        private Queue<Integer> queue2;

        public Stack() {
            queue1 = new LinkedList<>();
            queue2 = new LinkedList<>();
        }




    }
}
