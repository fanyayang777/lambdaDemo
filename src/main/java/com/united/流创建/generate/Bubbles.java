package com.united.流创建.generate;

import com.united.Bubble;

import java.util.stream.Stream;

/**
 * @author: wyx
 * @date: 2021/6/5 14:27
 * @description:
 */
public class Bubbles {
    public static void main(String[] args) {
        /**
         * 由于 bubbler() 与 Supplier<Bubble> 是接口兼容的
         * 我们可以将其方法引用直接传递给 Stream.generate()
         */
        Stream.generate(Bubble::bubbler)
                .limit(5)
                .forEach(System.out::println);
    }
}
