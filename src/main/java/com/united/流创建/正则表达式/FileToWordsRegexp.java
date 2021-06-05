package com.united.流创建.正则表达式;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author: fyy
 * @date: 2021/6/5 16:04
 * @description:
 */
public class FileToWordsRegexp {
    private String all;

    public FileToWordsRegexp(String filePath) throws IOException {
        all = Files.lines(Paths.get(filePath))
                .skip(1)
                .collect(Collectors.joining(" "));
    }

    public Stream<String> stream() {
        return Pattern.compile("[ .,?]+").splitAsStream(all);
    }

    public static void main(String[] args) throws IOException {
        /**
         * 在构造器中我们读取了文件中的所有内容（跳过第一行注释，并将其转化成为单行字符串）。
         * 现在，当你调用 stream() 的时候，可以像往常一样获取一个流，但这次你可以多次调用 stream() 在已存储的字符串中创建一个新的流。
         * 这里有个限制，整个文件必须存储在内存中；在大多数情况下这并不是什么问题，但是这损失了流操作非常重要的优势：
         *      流“不需要存储”。当然它们需要一些内部存储，但是这只是序列的一小部分，和持有整个序列并不相同。
         *      它们是懒加载计算的。
         *
         */
        FileToWordsRegexp fw = new FileToWordsRegexp("F:/fuliao/data/lambdaDemo/src/main/java/com/united/流创建/随机数流/Cheese.dat");
        fw.stream()
                .limit(7)
                .map(w -> w + " ")
                .forEach(System.out::print);
        System.out.println();
        fw.stream()
                .skip(2)
                .limit(7)
                .map(w -> w + " ")
                .forEach(System.out::print);
    }
}
