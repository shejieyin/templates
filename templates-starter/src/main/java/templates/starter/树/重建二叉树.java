package templates.starter.树;

import org.springframework.boot.configurationprocessor.json.JSONObject;

import java.util.Arrays;
import java.util.List;

public class 重建二叉树 {
    /**
     * 题目：输入某二叉树的前序遍历和中序的结果，请重建该二叉树。
     * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字，例如，输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6},则重建如图所示的二叉树并输出它的头结点。
     *      1
     *   2      3
     * 4     5     6
     *   7        8
     */

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    /**
     *思路：前序遍历中，第一个数字总是根节点的值。中序遍历中，根节点的值在序列中间，左子树的值位于根节点的坐标，右子树的值位于根节点的右边。
     * 也即可以找到左子树的前序遍历和中序遍历序列，因此可以采用同样的方法构建左右子树。
     * 即使用递归来构建整棵树。
     */
    /**
     * 异常情况：
     *  输入的前序遍历和张红霞遍历序列不匹配，该情况未验证
     */
    public static TreeNode restoreTree(List<Integer> preArr,List<Integer>midArr){
        if(preArr.isEmpty() || midArr.isEmpty() || preArr.size()!=midArr.size()){
            return null;
        }

        TreeNode treeNode = new TreeNode(preArr.get(0));
        int index = midArr.indexOf(treeNode.val);

        treeNode.left = restoreTree(preArr.subList(1,index+1),midArr.subList(0,index));
        treeNode.right = restoreTree(preArr.subList(index+1,preArr.size()),midArr.subList(index+1,midArr.size()));
        return treeNode;
    }


    public static  void main(String[] args) {
        Integer[] arr1 = {1,2,4,7,3,5,6,8};
        Integer[] arr2 = {4,7,2,1,5,3,8,6};
        List<Integer> preArr= Arrays.asList(arr1);
        List<Integer> midArr = Arrays.asList(arr2);
        TreeNode treeNode = restoreTree(preArr,midArr);

    }
}
