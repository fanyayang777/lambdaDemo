package com.united.中间操作.跟踪和调试;

import com.united.中间操作.FileToWords;

/**
 * @author: fyy
 * @date: 2021/6/5 16:21
 * @description:
 */
public class Peeking {
    public static void main(String[] args) throws Exception {
        /**
         * peek() 操作的目的是帮助调试。它允许你无修改地查看流中的元素
         * 因为 peek() 符合无返回值的 Consumer 函数式接口，所以我们只能观察，无法使用不同的元素来替换流中的对象。
         */
        FileToWords.stream("F:/fuliao/data/lambdaDemo/src/main/java/com/united/Cheese.dat")
                .skip(21)
                .limit(4)
                .map(w -> w + " ")
                .peek(System.out::println)
                .map(String::toUpperCase)
                .peek(System.out::println)
                .map(String::toLowerCase)
                .forEach(System.out::println);
    }
}
