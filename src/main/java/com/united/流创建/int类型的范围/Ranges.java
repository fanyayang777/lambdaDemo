package com.united.流创建.int类型的范围;

import static java.util.stream.IntStream.range;

/**
 * @author: fyy
 * @date: 2021/6/5 11:37
 * @description:
 */
public class Ranges {
    public static void main(String[] args) {

        /**
         * 第一种方式 是我们传统编写 for 循环的方式
         * 第二种方式 使用 range() 创建了流并将其转化为数组，然后在 for-in 代码块中使用
         * 第三种方式 我们对范围中的数字进行求和。在流中可以很方便的使用 sum() 操作求和。
         */

        // 传统方法:
        int result = 0;
        for (int i = 10; i < 20; i++) {
            result += i;
        }
        System.out.println(result);

        // for-in 循环：
        result = 0;
        for (int i : range(10, 20).toArray()) {
            result += i;
        }
        System.out.println(result);

        // 使用流
        System.out.println(range(10, 20).sum());

    }
}
