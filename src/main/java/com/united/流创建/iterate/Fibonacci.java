package com.united.流创建.iterate;

import java.util.stream.Stream;

/**
 * @author: fyy
 * @date: 2021/6/5 14:42
 * @description:  利用 iterate() 生成一个斐波那契数列
 */
public class Fibonacci {
    int x = 1;

    Stream<Integer> numbers() {
        return Stream.iterate(0, i-> {
           int result = x + i;
           x = i;
           return result;
        });
    }

    public static void main(String[] args) {
        /**
         * 斐波那契数列将数列中最后两个元素进行求和以产生下一个元素。
         * iterate() 只能记忆结果，因此我们需要利用一个变量 x 追踪另外一个元素。
         * skip() 操作，它根据参数丢弃指定数量的流元素。在这里，我们丢弃了前 20 个元素。
         */
        new Fibonacci().numbers()
                .skip(20)   // 过滤前 20 个
                .limit(10)  // 取 10 个
                .forEach(System.out::println);
    }
}
