package templates.starter;

import java.util.List;
import java.util.Stack;

public class 斐波那契数列 {
    /**
     * 题目：求斐波那契数列的第N项
     * 写一个函数，求斐波那契数列的第n项。斐波那契数列的定义如下：
     * f(0) = 0;
     * f(1) = 1;
     * f(n) = f(n-1) + f(n-2);n>1
     */

    /**
     * 解法一：递归
     * 缺点：存在很多的重复计算，且随着n的增大，呈指数级增大；如：f(9)=f(8)+f(7);f(8)=f(7)+f(6);此处f(7)被计算了两次
     */
    public static int 解法一(int n){
        if(n == 0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return 解法一(n-1) + 解法一(n-2);
    }

    /**
     * 解法二：非递归
     * 把已经得到的中间数列保存起来，在下次用的时候查出来即可
     */
    public static int 解法二(int n){
        if(n == 0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int prepre = 0;
        int pre = 1;
        for(int i = 2;i<=n;i++){
           int tmp = prepre + pre;
           prepre = pre;
           pre = tmp;
        }
        return pre;
    }

    public static void main(String[] args){
        int n = 5;
        System.out.println(解法一(n));
        System.out.println(解法二(n));

    }


}
