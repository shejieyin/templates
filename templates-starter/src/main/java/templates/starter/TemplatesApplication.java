package templates.starter;



import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;


@SpringBootApplication
@ComponentScan({"templates.service","templates.starter"})
//@ImportResource(locations = {"classpath*:applicationContext.xml"})
public class TemplatesApplication {

	static char ca[]="abcdefg".toCharArray();
	static char ia[]="12345678".toCharArray();
	static ReentrantLock lock = new ReentrantLock();
	static Condition condition1 = lock.newCondition();
	static Condition condition2 = lock.newCondition();

//
//	public static void print(int n){
//		if(n<=0){
//			return;
//		}
//		for(int i = 1; i<=n;i++){
//			//print left whitespace
//			printchar(2*n-1-i,' ',false);
//			//print *
//			printchar(2*n-1,'*',false);
//			//print right whitespace
//			printchar(2*n-1-i,' ',true);
//		}
//	}
//	public static void printchar(int n,char c,boolean flag){
//		if(n<=0){
//			return;
//		}
//		for(int i = 0;i<n;i++){
//			System.out.print(c);
//		}
//		if(flag == true){
//			System.out.print('\n');
//		}
//
//		List<String> ss = new ArrayList<>();
//		if(ss.is){
//
//		}
//	}

	public static List<Integer> multiple(int x, int y, int z, int n) {
		// Write your code here
		List<Integer> res = new ArrayList<>();
		int num = 1;

		if(x>y){
			int temp = y;
			x=y;
			y=temp;
		}
		while(x*num <= n || y*num <=n){
			if(x*num%z!=0 && x*num<n){
				res.add(x*num);
			}
			if(y%x!=0){
				if(y*num%z!=0 && y*num<n){
					res.add(y*num);
				}
			}
			num++;
		}
		return res;
	}




	public static void main(String[] args) {

		multiple(3,5,10,12);



	}

	public static int fun1(String[] array,Integer target){
		int res = -1;
		if(array.length==0){
			return res;
		}

		Integer minValueIndex = 0;
		Integer maxValue =  Integer.parseInt(array[0]);
		Integer minValue =  Integer.parseInt(array[0]);
		for(int i = 1;i<array.length;i++){
			if(Integer.parseInt(array[i])<minValue){
				minValueIndex = i;
				minValue = Integer.parseInt(array[i]);
				maxValue = Integer.parseInt(array[i-1]);
				break;
			}
		}
		if(target<minValue || target>maxValue){
			return res;
		}

		res = fun2(array,target,0,minValueIndex-1);
		if(res != -1){
			return res;
		}else {
			res = fun2(array, target, minValueIndex, array.length-1);
		}
		return res;

	}


	public static int findTarget(String[] array,Integer target){
		int res = -1;
		int startIndex = 0;
		int endIndex = array.length-1;
		while(startIndex<=endIndex) {
			int midIndex = (endIndex-startIndex)/2 + startIndex;
			if(Integer.parseInt(array[midIndex])==target){
				res = midIndex;
				break;
			}
			if(Integer.parseInt(array[startIndex])<Integer.parseInt(array[midIndex])){
				if(target >= Integer.parseInt(array[startIndex]) && target< Integer.parseInt(array[midIndex])){
					endIndex = midIndex-1;
				}else {
					startIndex = midIndex + 1;
				}
			}else{
				if(target > Integer.parseInt(array[midIndex]) && target <= Integer.parseInt(array[endIndex])){
					startIndex = midIndex + 1;
				}else{
					endIndex = midIndex -1;
				}
			}
		}
		return res;


	}

	public static int fun2(String[] array,Integer target,int startIndex,int endIndex){

		int res = -1;
		while(startIndex<=endIndex) {
			int midIndex = (endIndex-startIndex)/2 + startIndex;
			if (target < Integer.parseInt(array[midIndex])) {
				endIndex = midIndex-1;

			}else if(target > Integer.parseInt(array[midIndex])){
				startIndex = midIndex+1;
			}else{
				res =  midIndex;
				break;
			}
		}
		return res;

	}


}
