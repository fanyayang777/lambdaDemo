package com.united.流创建;

import com.united.Bubble;

import java.util.*;

/**
 * @author: wyx
 * @date: 2021/6/4 18:49
 * @description:
 */
public class CollectionToStream {
    public static void main(String[] args) {
        /**
         * 创建 List 对象后，调用集合的 stream()
         * 中间操作 map()  会获取流中的所有元素，并且对流中元素应用操作从而产生新的元素，并将其传递到后续的流中
         * 通常 map() 会获取对象并产生新的对象，但在这里产生了特殊的用于数值类型的流。例如，mapToInt() 方法将一个对象流（object stream）转换成为包含整型数字的 IntStream。
         * 通过调用字符串的 split()来获取元素用于定义变量 w。
         * 为了从 Map 集合中产生流的数据，调用 entrySet() 产生一个对象流，每个对象都包含一个 key 键以及与其相关联的 value 值。然后分别调用 getKey() 和 getValue() 获取值。
         */

        List<Bubble> bubbles = Arrays.asList(new Bubble(1), new Bubble(2), new Bubble(3));
        System.out.println(bubbles.stream()
            .mapToInt(b -> b.i)
            .sum());

        HashSet<String> w = new HashSet<>(Arrays.asList("It's a wonderful day for pie".split(" ")));
        w.stream()
                .map(x -> x + " ")
                .forEach(System.out::print);

        System.out.println();

        Map<String, Double> m = new HashMap<>();
        m.put("pi", 3.14159);
        m.put("e", 2.718);
        m.put("phi", 1.618);
        m.entrySet().stream()
                .map(e -> e.getKey() + ": " + e.getValue())
                .forEach(System.out::println);

    }
}
