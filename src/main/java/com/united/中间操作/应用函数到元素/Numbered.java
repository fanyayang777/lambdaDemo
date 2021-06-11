package com.united.中间操作.应用函数到元素;

import java.util.stream.Stream;

/**
 * @author: fyy
 * @date: 2021/6/5 17:24
 * @description:
 */
public class Numbered {
    final int n;

    public Numbered(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "Numbered{" +
                "n=" + n +
                '}';
    }

    public static void main(String[] args) {
        Stream.of(1, 5, 7, 9, 11, 13)
                .map(Numbered::new) // 将获取到的整数通过构造器 Numbered::new 转化成为 Numbered 类型。
                .forEach(System.out::println);
    }
}
