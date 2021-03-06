package templates.starter;

public class 青蛙跳台阶 {
    /**
     * 题目一：一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个n级台阶总共有多少种跳法。
     * n=1时，只有1种跳法，即跳1级；
     * n=2时，有2种跳法，跳2次1级和跳1次2级；
     * n>2时，有f(n)种跳法：【第一次跳1级,f(n-1)次跳法】，【第一次跳2级，f(n-2)次跳法】，所以共有f(n) = f(n-1) + f(n-2)种跳法
     * 即斐波那契数列
     *
     */


    /**
     * 题目二：一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶...它也可以跳上个n级台阶，此时该青蛙跳上一个n级台阶总共有多少种跳法？
     * 数学归纳法:f(n) = 2^n-1
     *
     */



}
