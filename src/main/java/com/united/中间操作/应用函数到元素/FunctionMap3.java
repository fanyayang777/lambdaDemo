package com.united.中间操作.应用函数到元素;

import java.util.stream.Stream;

/**
 * @author fyy
 * @date 2021/6/7 18:48
 */
public class FunctionMap3 {
    public static void main(String[] args) {
        Stream.of("5", "7", "9")
                .mapToInt(Integer::parseInt)
                .forEach(n -> System.out.format("%d ", n));

        System.out.println("\n");

        Stream.of("17", "19", "23")
                .mapToLong(Long::parseLong)
                .forEach(n -> System.out.format("%d ", n));

        System.out.println("\n");

        Stream.of("17", "1.9", ".25")
                .mapToDouble(Double::parseDouble)
                .forEach(n -> System.out.format("%f ", n));
    }
}
