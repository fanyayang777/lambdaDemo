package com.united.中间操作.移除元素;

import java.util.stream.IntStream;

import static java.util.stream.IntStream.iterate;
import static java.util.stream.IntStream.rangeClosed;

/**
 * @author: fyy
 * @date: 2021/6/5 16:45
 * @description:
 */
public class Prime {
    /**
     * rangeClosed() 包含了上限值。如果不能整除，即余数不等于 0，
     * noneMatch() 操作返回 true，如果出现任何等于 0 的结果则返回 false。
     * noneMatch() 操作一旦有失败就会退出。
     */
    public static Boolean isPrime(int n) {
        return rangeClosed(2, (int) Math.sqrt(n))   //rangeClosed() 包含上限值
                .noneMatch(i -> n % i== 0);         //noneMatch 操作返回 true，如果出现任何等于 0 的结果则返回 false
    }

    public IntStream numbers() {
        return iterate(2, i -> i + 1)
                .filter(Prime::isPrime);
    }

    public static void main(String[] args) {
        new Prime().numbers()
                .limit(10)
                .forEach(n -> System.out.format("%d ", n));
        System.out.println();

        new Prime().numbers()
                .skip(50)
                .limit(10)
                .forEach(n -> System.out.format("%d ", n));
    }
}
