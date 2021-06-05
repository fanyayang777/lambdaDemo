package com.united.中间操作.流元素排序;

import com.united.中间操作.FileToWords;

import java.util.Comparator;

/**
 * @author: fyy
 * @date: 2021/6/5 16:38
 * @description: 在 Randoms.java 中，我们熟识了 sorted() 的默认比较器实现。其实它还有另一种形式的实现：传入一个 Comparator 参数。
 */
public class SortedComparator {
    public static void main(String[] args) throws Exception {
        /**
         * sorted() 预设了一些默认的比较器。这里我们使用的是反转“自然排序”。
         * 当然你也可以把 Lambda 函数作为参数传递给 sorted()。
         */
        FileToWords.stream("F:/fuliao/data/lambdaDemo/src/main/java/com/united/Cheese.dat")
                .skip(10)
                .limit(10)
                .sorted(Comparator.reverseOrder()) //自然排序
                .map(w -> w + " ")
//                .peek(System.out::print)
                .forEach(System.out::print);
    }
}
