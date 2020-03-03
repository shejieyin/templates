package templates.starter.查找;

import java.util.Arrays;
import java.util.List;

public class _2二分查找 {

    /**
     * 复杂度分析：O(logn)；
     */

    /**
     * _2二分查找，一般用于查找有序数组中某个值是否存在
     * @param list
     * @param target
     * @return
     */

    public static boolean search(List<Integer> list, Integer target){
        if(list.isEmpty()){
            return false;
        }
        int start = 0;
        int end = list.size()-1;
        while(start<=end){
            int mid = (end-start)/2+start;
            if(target.equals(list.get(mid))){
                return true;
            }else if(target < list.get(mid)){
                end = mid-1;
            }else{
                start = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[]args){
        Integer[] arr = {2,3,5,6,8,9,10,14,16,17};
        List<Integer> list = Arrays.asList(arr);
        int target = 17;
        System.out.println(search(list,target));

    }





}
