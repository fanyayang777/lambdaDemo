package com.united.流创建.随机数流;

import java.util.Random;
import java.util.stream.Stream;

/**
 * @author: wyx
 * @date: 2021/6/4 19:05
 * @description: 随机数流   Random 类被一组生成流的方法增强了
 */
public class RandomGenerators {
    public static <T> void show(Stream<T> stream) {
        stream
            .limit(4)
            .forEach(System.out::println);
        System.out.println("++++++++++++++++++");
    }

    public static void main(String[] args) {
        /**
         * boxed() 流操作将会自动地吧基本类型包装成对应的装箱类型
         * 从而使得 show() 能够接受流。
         */
        Random rand = new Random(47);
        show(rand.ints().boxed());
        show(rand.longs().boxed());
        show(rand.doubles().boxed());

        //控制上限和下限
        System.out.println("==========================控制上限和下限============================");
        show(rand.ints(10,20).boxed());
        show(rand.longs(20,100).boxed());
        show(rand.doubles(20,30).boxed());

        //控制流大小
        System.out.println("===========================控制流大小===========================");
        show(rand.ints(2).boxed());
        show(rand.longs(2).boxed());
        show(rand.doubles(2).boxed());

        //控制流的大小和界限
        System.out.println("===========================控制流的大小和界限===========================");
        show(rand.ints(3,3,9).boxed());
        show(rand.longs(3,12,22).boxed());
        show(rand.doubles(3,11.5,12.5).boxed());

    }

}
