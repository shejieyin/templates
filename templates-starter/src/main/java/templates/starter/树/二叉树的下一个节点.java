package templates.starter.树;

public class 二叉树的下一个节点 {
    /**
     * 题目：给定一棵二叉树和其中的一个节点，如何找出中序遍历序列的下一个节点？树中的节点除了有两个分别指向左、右子节点的指针，还有应该指向父节点的指针
     */

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode parent;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * 题解：
     *  给定了一个节点，因是中序遍历，说明其左子树和该节点已经遍历完毕，后续只需考虑其是否有右子树的情况即可。
     *  1. 如果一个节点有右子树，那么下一个节点就是右子树中的最左子节点
     *  2. 如果一个节点没有右子树，且它为其父节点的左节点，则其父节点为下一个节点
     *  3. 如果一个节点没有右子树，且它为其父节点的右节点，沿着他的父节点向上遍历，直到找到一个左子节点是其父节点的节点
     *
     *  答案为验证
     */
    public static TreeNode findNextNode(TreeNode treeNode){

        if(treeNode==null){
            return null;
        }
        TreeNode nextNode = null;

        if(treeNode.right!=null){
            nextNode = treeNode.right;
            while(nextNode.left!=null){
                nextNode = nextNode.left;
            }
        }else if(treeNode.parent !=null){
            if(treeNode == treeNode.parent.left){
                nextNode =  treeNode.parent;
            }else if(treeNode == treeNode.parent.right){
                while(treeNode !=null && treeNode != treeNode.parent.left){
                    treeNode = treeNode.parent;
                }
                nextNode =  treeNode;
            }
        }
        return nextNode;
    }





}
