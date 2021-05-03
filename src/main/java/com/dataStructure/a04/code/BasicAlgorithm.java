package com.dataStructure.a04.code;


import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.TimeInterval;

/**

  写一个 1 + ... + 100 的小程序
  会列举出最显而易见的代码
  和高斯童年的时候想到的公示进行比较

 * @author HCY
 * @since 2021/4/26 2:15 下午
*/
public class BasicAlgorithm {

    public static void main(String[] args) {
        simple();
        Gaussian();
    }

    /**
     * 最显而易见的代码
     * @author HCY
     * @since 2021/4/26 2:19 下午
     * @return void
    */
    public static void simple(){
        TimeInterval timer = DateUtil.timer();
        int sum = 0;
        int n = 100;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println( "simple ===>" + sum);
        System.out.println( "simple time ===>" + timer.interval());
    }

    /**
     * 利用高斯公式
     * @author HCY
     * @since 2021/4/26 2:41 下午
     * @return void
    */
    public static void Gaussian(){
        TimeInterval timer = DateUtil.timer();
        int sum = 0;
        int n = 100;
        sum = (1 + n) * n /2;
        System.out.println( "Gaussian ===>" + sum);
        System.out.println( "Gaussian time ===>" + timer.interval());
    }

}
