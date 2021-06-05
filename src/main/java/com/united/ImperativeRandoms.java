package com.united;

import java.util.Random;
import java.util.TreeSet;

/**
 * @author: wyx
 * @date: 2021/6/4 18:33
 * @description:    streams/ImperativeRandoms.java
 */
public class ImperativeRandoms {
    public static void main(String[] args) {
        /**
         * 在 Randoms.java 中，我们无需定义任何变量
         * 但在这里我们定义了 3 个变量： rand，rints 和 r
         * 由于 nextInt() 方法没有下限的原因（其内置的下限永远为 0），这段代码实现起来更复杂
         * 所以我们要生成额外的值来过滤小于 5 的结果。
         */
        Random rand = new Random(47);
        TreeSet<Integer> rints = new TreeSet<>();
        while (rints.size() < 7) {
            int r = rand.nextInt(20);
            if(r < 5) {
                continue;
            }
            rints.add(r);
        }
        System.out.println(rints);
    }
}
