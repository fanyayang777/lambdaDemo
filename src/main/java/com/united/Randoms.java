package com.united;

import java.util.Random;

/**
 * @author: fyy
 * @date: 2021/6/4 18:19
 * @description: 随机展示 5 至 20 之间不重复的整数并进行排序
 */
public class Randoms {

    public static void main(String[] args) {
        /**
         * 随机展示 5 至 20 之间不重复的整数并进行排序
         * 注意 ：
         *     Randoms.java 中没有声明任何变量，流可以在不适用赋值或可变数据的情况下对有状态的系统建模
         */
        new Random(47)  //我们给 Random 对象一个种子（以便程序再次运行时产生相同的输出）
                .ints(5,20) //ints() 方法产生一个流并且 ints()方法有多重凡事的重载—— 两个参数限定了数值产生的边界。将生成一个整数流
                .distinct() //使用中间流 distinct() 来获取他们的非重复值
                .limit(8)   //使用 limit() 方法获取前7个元素
                .sorted()   //使用 sorted（） 方法排序
                .forEach(System.out::println); //循环输出
    }
}
