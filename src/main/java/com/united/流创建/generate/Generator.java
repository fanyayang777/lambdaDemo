package com.united.流创建.generate;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author: fyy
 * @date: 2021/6/5 13:55
 * @description:
 */
public class Generator implements Supplier<String> {
    Random rand = new Random(47);
    char[] letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    @Override
    public String get() {
        return "" + letters[rand.nextInt(letters.length)];
    }

    public static void main(String[] args) {
        /**
         * 使用 Random。nextInt() 方法来挑选字母表中的大写字母。
         * Random。nextInt() 的参数代表可以接受的最大的随机数范围。所以使用数组边界是经过深思熟虑的
         */
        String word = Stream.generate(new Generator())
                .limit(30)
                .collect(Collectors.joining());
        System.out.println(word);

        /**
         * 如果要创建包含相同对象的流,只需要传递一个生成那些对象的 lambda 到 generate() 中
         */
        Stream.generate(() -> "duplicate")
                .limit(3)
                .forEach(System.out::println);
    }
}
