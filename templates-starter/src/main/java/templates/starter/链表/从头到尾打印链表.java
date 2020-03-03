package templates.starter.链表;


import java.util.ArrayList;
import java.util.List;

public class 从头到尾打印链表 {
    /**
     * 题目：输入一个链表的头节点，从尾到头反过来打印每个节点的值。链表节点定义如下：
     * struct ListNode{
     *     int m_nKey,
     *     ListNode * m_pNext;
     * }
     */


    public static class ListNode{
        public int value;
        public ListNode nextNode;
    }



    public static  void main(String[] args){
        ListNode listNode = new ListNode();
        listNode.value = 5;
        listNode.nextNode = new ListNode();
        listNode.nextNode.value = 10;
        listNode.nextNode.nextNode = new ListNode();
        listNode.nextNode.nextNode.value = 15;
        listNode.nextNode.nextNode.nextNode = null;

//        printList(listNode);
        printList2(listNode);
    }

    /**
     * 解法一：使用递归
     * 缺点：调用层次比较深时，可能导致函数调用栈溢出
     */
    public static void printList(ListNode listNode){
        if(listNode.nextNode!=null){
            printList(listNode.nextNode);
        }
        System.out.println(listNode.value);
    }

    /**
     * 解法二：用栈基于循环实现
     */
    public static void printList2(ListNode listNode){

        List<Integer> values = new ArrayList<>();
        ListNode tmp = listNode;
        while(tmp != null){
            values.add(tmp.value);
            tmp = tmp.nextNode;
        }
        for(int i = values.size()-1;i>=0;i--){
            System.out.println(values.get(i));
        }
    }



}
