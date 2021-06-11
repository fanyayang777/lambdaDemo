package com.united.中间操作.在map中组合流;

import java.util.stream.Stream;

/**
 * @author fyy
 * @date 2021/6/7 18:57
 */
public class StreamOfStreams {
    /**
     * 为了弄清它的工作原理，我们从传入一个刻意设计的函数给 map() 开始。该函数接受一个整数并产生一个字符串流：
     */
    public static void main(String[] args) {
        Stream.of(1, 2, 3)
                .map(i -> Stream.of("Gonzo", "Kermit", "Beaker"))
//                .peek(System.out::println)
                .map(e -> e.getClass().getName())
                .forEach(System.out::println);
    }
}
