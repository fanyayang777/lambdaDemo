package com.united.中间操作.在map中组合流;

import java.util.stream.Stream;

/**
 * @author fyy
 * @date 2021/6/7 19:40
 */
public class FlatMap {
    /**
     * 从映射返回的每个流都会自动扁平为组成它的字符串
     */
    public static void main(String[] args) {
        Stream.of(1, 2, 3)
                .flatMap(i -> Stream.of("Gonzo", "Fozzie", "Beaker"))
                .forEach(System.out::println);
    }
}
