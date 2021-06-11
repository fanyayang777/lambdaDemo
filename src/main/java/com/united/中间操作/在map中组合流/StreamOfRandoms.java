package com.united.中间操作.在map中组合流;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author fyy
 * @date 2021/6/9 11:37
 */
public class StreamOfRandoms {
    /**
     * 从一个整数流开始，然后使用每一个整数去创建更多的随机数
     *
     * 引入了 concat() 它以参数顺序组合两个流。如此，我们在每个随机 integer 流的末尾添加一个 -1 作为标记，。你可以看到最终流确实是从一组扁平流中创建的
     * 因为 rand.ints() 产生的是一个 IntStream ， 所以我必须使用 flatMap() 、 cocat() 和 of() 的特定整数形式
     */
    static Random rand = new Random(47);
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5)
                .flatMapToInt(i -> IntStream.concat(
                        rand.ints(0, 100).limit(i), IntStream.of(-1)))
                .forEach(n -> System.out.format("%d ", n));
    }
}
