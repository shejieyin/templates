package templates.starter.树;

import java.util.ArrayDeque;
import java.util.Stack;

public class 二叉树遍历 {


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * 先序遍历: 递归
     * @param
     *
     */
    public static void preOrder(TreeNode treeNode){
        if(treeNode == null){
            return;
        }
        //先遍历根节点
        System.out.println(treeNode.val);
        //在遍历左子树
        preOrder(treeNode.left);
        //再遍历右子树
        preOrder(treeNode.right);
    }

    /**
     * 先序遍历：非递归，借助栈
     * @param treeNode
     */
    public static void preOrder2(TreeNode treeNode){
        if(treeNode == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode tmp = treeNode;
        stack.push(tmp);
        while(!stack.isEmpty()) {
           tmp = stack.pop();
           System.out.println(tmp.val);
           if(tmp.right !=null){
               stack.push(tmp.right);
           }
           if(tmp.left!=null){
               stack.push(tmp.left);
           }
        }
    }

    public static void preOrder3(TreeNode treeNode){
        if(treeNode == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode tmp = treeNode;
        while(!stack.isEmpty()||tmp!=null) {
            while (tmp != null) {
                System.out.println(tmp.val);
                stack.push(tmp);
                tmp = tmp.left;
            }
            tmp = stack.pop();
            tmp = tmp.right;
        }
    }

    /**
     * 中序遍历：递归
     * @param
     */
    public static void midOrder(TreeNode treeNode){
        if(treeNode == null){
            return;
        }
        //先遍历左子树
        midOrder(treeNode.left);
        //再遍历根节点
        System.out.println(treeNode.val);
        //再遍历右子树
        midOrder(treeNode.right);
    }

    /**
     * 中序遍历：非递归 ，借助栈
     * @param
     */
    public static void midOrder2(TreeNode treeNode){
        if(treeNode == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode tmp = treeNode;
        while (!stack.empty() || tmp != null) {
            while (tmp != null) {
                stack.push(tmp);
                tmp = tmp.left;
            }
            tmp = stack.pop();
            System.out.println(tmp.val);
            tmp = tmp.right;
        }

    }



    /**
     * 后续遍历：递归
     * @param
     */
    public static void postOrder(TreeNode treeNode){
        if(treeNode == null){
            return;
        }
        //先遍历左子树
        postOrder(treeNode.left);
        //再遍历右子树
        postOrder(treeNode.right);
        //再遍历根节点
        System.out.println(treeNode.val);
    }

    /**
     * 后续遍历：非递归，借助栈
     * @param
     */
    public static void postOrder2(TreeNode treeNode){
        if(treeNode == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode tmp = treeNode;
        TreeNode pre = treeNode;
        while(tmp!=null || !stack.isEmpty()) {
            while (tmp != null) {
                stack.push(tmp);
                tmp = tmp.left;
            }

            tmp = stack.peek().right;
            if(tmp==null || tmp == pre){
                //若栈顶节点的右节点为空或者已经visit过，则按顺序应该访问栈顶节点
                tmp = stack.pop();
                System.out.println(tmp.val);
                //prev用来标记已经visit过这个节点
                pre = tmp;
                tmp = null;
            }
        }

    }


    /**
     * 宽度优先遍历，借助队列
     * @param
     */
    public static void levelOrderTraversal(TreeNode treeNode){
        if(treeNode == null){
            return;
        }
        ArrayDeque<TreeNode> queue=new ArrayDeque<TreeNode>();
        queue.add(treeNode);

        while(!queue.isEmpty()){
            TreeNode tmp = queue.remove();
            System.out.println(tmp.val);
            if(tmp.left!=null){
                queue.add(tmp.left);
            }
            if(tmp.right!=null){
                queue.add(tmp.right);
            }

        }
    }

    /**
     * 深度优先遍历：相当于先序遍历
     */





    public static  void main(String[] args){
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        a.left = b;
        a.right = c;
        b.right = d;
        c.left = e;
        c.right = f;
        f.left = g;

//        System.out.println("先序遍历");
//        preOrder(a);
//        System.out.println("=======");
//        preOrder2(a);
//        System.out.println("=======");
//        preOrder3(a);

//        System.out.println("中序遍历");
//        midOrder(a);
//        System.out.println("=======");
//        midOrder2(a);
//
//        System.out.println("后序遍历");
//        postOrder(a);
//        System.out.println("=======");
//        postOrder2(a);

        System.out.println("宽度优先遍历");
        levelOrderTraversal(a);

    }
}
