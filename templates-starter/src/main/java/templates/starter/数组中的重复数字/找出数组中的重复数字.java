package templates.starter.数组中的重复数字;

import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.*;

public class 找出数组中的重复数字 {
    /**
     * 题目一：找出数组中重复的数字
     * 在一个长度为n的数组里，所有数字都在0~n-1的范围内，数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
     * 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是重复的数字2或者3
     */


    /**
     * 解法一：利用hash来解决，时间复杂度O(n)，空间复杂度O(n)
     * @param input
     * @return
     */
    private static Integer 解法一(List<Integer> input){
        if(CollectionUtils.isEmpty(input)){
            return null;
        }
        Integer res = null;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<input.size();i++){
            if(map.containsKey(input.get(i))){
                res = input.get(i);
                break;
            }else{
                map.put(input.get(i),1);
            }
        }
        return res;
    }

    /**
     * 解法二：对数组进行排序，然后利用数组的有序性进行查找
     * 数组排序时间复杂度为O(nlogn),查找为O(n),故时间复杂度为O(n),空间复杂度为O(1)
     */
    private static Integer 解法二(List<Integer> input){
        if(CollectionUtils.isEmpty(input)){
            return null;
        }
        Integer res = null;
        Collections.sort(input);
        for(int i = 0;i<input.size()-1;i++){
            if(input.get(i).equals(input.get(i+1))){
                res = input.get(i);
                break;
            }
        }
        return res;
    }

    /**
     * 解法三：
     * 从头到尾一次扫描这个数组中的每个数字，当扫描到下标为i的数字时，首先比较这个数字(m)是不是等于i。如果是，则接着扫描下一个数字，如果不是，则再拿它和第m个数字进行比较。如果它和第m个数字相等，
     * 就找到了一个重复的数字(该数字在下标为i和m的位置都出现了)；如果它和第m个数字不相等，就把第i个数字和第m个数字交换，把m放到属于它的位置。接下来再重复这个比较、交换的过程，直到发现第一个重复的数字。
     * 总的时间复杂度为O(n)，空间复杂度为O(1)
     */
    private static Integer 解法三(List<Integer> input){
        if(CollectionUtils.isEmpty(input)){
            return null;
        }
        Integer res = null;
        int i = 0;
        while(i<input.size()){
            //如果数组的索引和当前存储值相等，则说明位置存放正确，不用移动，指针跳到下一节点
            if(i == input.get(i)){
                i++;
                continue;
            }else{
                //否则，将数据放置其应该在的位置
                //如果目标位置和当前移动的值相等，则说明找到重复数字
                if(input.get(i).equals(input.get(input.get(i)))){
                    res = input.get(i);
                    break;
                }else{
                    //否则，将索引i的值放置到正确位置，并将原来的值放到索引i的地方
                    int temp = input.get(input.get(i));
                    input.set(input.get(i),input.get(i));
                    input.set(i,temp);
                }
            }

        }
        return res;
    }


    public static  void main(String[] args){
//       Integer[] arr = {0,3,1,0,2,5,3};
//       Integer[] arr = {4,2,1,0,6,5,3};
        Integer[] arr = {4,2,1,0,6,3,3};
       List<Integer> input = Arrays.asList(arr);
       System.out.println("解法一输出："+解法一(input));
       System.out.println("解法二输出："+解法二(input));
       System.out.println("解法三输出："+解法三(input));
    }






}
