package templates.starter.数组中的重复数字;

import org.springframework.util.CollectionUtils;

import java.util.Arrays;
import java.util.List;

public class 不修改数组找出重复的数字 {
    /**
     * 题目二：不修改数组找出重复的数字
     * 在一个长度为n+1的数组里的所有数字都在1~n的范围内，所以数组中至少有一个数字是重复的。请找出数组中任意一个重复的数字，但不能修改输入的数组。
     * 例如，如果输入长度为8的数组{2,3,5,4,3,2,6,7}，那么对应的输出是重复的数字2或者3
     */


    /**
     * 解法一：同找出数组中的重复数字解法
     * 解法二：创建一个长度为N+1的数组，然后逐一把原数组中的每个数字复制到辅助数组。把原数组中值为m的数复制到下标为m的位置，这样很容易发现哪个是重复的。
     */

    /**
     * 解法三：把从1-n的数字，从中间的数字m分为两部分，前面一半为1~m，后面一半为m+1~n。如果1~m的数字数目超过m，那么这一半的区间里一定包含重复的数字；否则另一半m+1~n的区间里一定包含重复的数字。
     * 时间复杂度为O(nlong(n))，相当于以时间换空间
     * 这种算法不能找出所有重复的数字，如该算法不能找出{2,3,5,4,3,2,6,7}中重复的数字2
     */
    public static Integer 解法三(List<Integer> input){
        if(CollectionUtils.isEmpty(input)){
            return null;
        }
        int start = 1;
        int end = input.size()-1;
        Integer res;

        while(start!=end) {
            int mid = (end-start)/2 + start;
            int num = 0;
            for (int i = 0; i < input.size(); i++) {
                if (input.get(i) <= mid && input.get(i)>=start) {
                    num++;
                }
            }
            if (num > mid-start+1) {
                end = mid;
            }else{
                start = mid +1;
            }
        }
        res = end;
        return res;
    }



    public static  void main(String[] args){
//        Integer[] arr = {4,2,1,5,6,3,3};
//        Integer[] arr = {2,5,1,5,6,3,3};
        Integer[] arr = {2,5,1,5,6,4,3};
        List<Integer> input = Arrays.asList(arr);
//        System.out.println("解法一输出："+解法一(input));
//        System.out.println("解法二输出："+解法二(input));
        System.out.println("解法三输出："+解法三(input));
    }







}
