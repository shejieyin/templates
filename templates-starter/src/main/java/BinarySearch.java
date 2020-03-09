import java.util.Arrays;
import java.util.List;

public class BinarySearch {

    public static void main(String[]args){
        Integer[] arr = {2,3,5,6,8,9,10,14,16,17};
        List<Integer> list = Arrays.asList(arr);
        int target = 5;
        System.out.println(binarySearch(list,target));

    }


    public static boolean binarySearch(List<Integer> list, Integer target){
        if(list.isEmpty()){
            return false;
        }
        int start = 0;
        int end = list.size()-1;
        while(start<=end){
            int mid = (end-start)/2 + start;
            if(target.equals(list.get(mid))){
                return true;
            }else if(target<list.get(mid)){
                end = mid -1;
            }else{
                start = mid +1;
            }
        }
        return false;

    }
}
