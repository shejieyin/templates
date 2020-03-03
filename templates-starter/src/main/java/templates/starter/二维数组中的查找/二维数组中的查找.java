package templates.starter.二维数组中的查找;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 二维数组中的查找 {
    /**
     * 题目：在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     * 如果包含，返回true,如果不包含，返回false
     * 1  2  8  9
     * 2  4  9  12
     * 4  7  10 13
     * 6  8  11 15
     *
     */

    public static boolean 解法一(List<List<Integer>> input,int targetNum){
        if(input.isEmpty()){
            return false;
        }
        int row = 0;
        int coloumn = input.get(0).size()-1;
        boolean res = false;

        while(row<=input.size()-1 && coloumn>=0){
            if(input.get(row).get(coloumn)==targetNum){
               res = true;
               break;
            }else if(input.get(row).get(coloumn)<targetNum){
                row = row + 1;
            }else{
                coloumn = coloumn -1;
            }
        }
        return res;
    }




    public static  void main(String[] args){
//        Integer[] arr = {4,2,1,5,6,3,3};
//        Integer[] arr = {2,5,1,5,6,3,3};
        Integer[] arr1 = {1,2,8,9};
        Integer[] arr2 = {2,4,9,12};
        Integer[] arr3 = {4,7,10,13};
        Integer[] arr4 = {6,8,11,15};
        int target = 0;
        List<List<Integer>> input = new ArrayList<>();
        input.add(Arrays.asList(arr1));
        input.add(Arrays.asList(arr2));
        input.add(Arrays.asList(arr3));
        input.add(Arrays.asList(arr4));
        System.out.println("解法一输出："+解法一(input,target));
//        System.out.println("解法二输出："+解法二(input));
//        System.out.println("解法三输出："+解法三(input));
    }


}
