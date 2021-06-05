package com.united.流创建.int类型的范围;

import static java.util.stream.IntStream.range;

/**
 * @author: wyx
 * @date: 2021/6/5 13:46
 * @description:
 */
public class Repeat {
    public static void repeat(int n, Runnable action) {
        /**
         * 实用小功能 repeat() 可以用来替换简单的 for 循环
         * 注意 IntStream.range() 相比 onjava.Range.range() 拥有更多的限制。
         * 这是由于其可选的第三个参数，后者允许步长大于 1，并且可以从大到小来生成。
         */
        range(0,n).forEach(i -> action.run());
    }

    static void hi() {
        System.out.println("Hi!");
    }

    public static void main(String[] args) {
        repeat(3, () -> System.out.println("Looping!"));
        repeat(3, Repeat::hi);
    }
}
