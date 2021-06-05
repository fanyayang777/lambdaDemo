package com.united;

import java.util.stream.Stream;

/**
 * @author: wyx
 * @date: 2021/6/4 18:40
 * @description:
 */
public class StreamOf {
    public static void main(String[] args) {
        /**
         * 通过 Stream.of() 将一组元素转化为流
         */
        Stream.of(new Bubble(1),new Bubble(2),new Bubble(3))
                .forEach(System.out::println);
        Stream.of("It's ", "a ", "wonderful ", "day ", "for ", "pie!")
                .forEach(System.out::print);
        Stream.of(3.14159, 2.718, 1.618)
                .forEach(System.out::println);
    }
}
