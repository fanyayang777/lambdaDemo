package com.united.流创建.流的建造者模式;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author: fyy
 * @date: 2021/6/5 15:13
 * @description:
 */
public class FileToWordsBuilder {
    Stream.Builder<String> builder = Stream.builder();

    public FileToWordsBuilder(String filePath) throws IOException {
        Files.lines(Paths.get(filePath))
                .skip(1) // 略过第一行开头的注释
                .forEach(line -> {
                    for (String w : line.split("[ .?,]+")) {
                        builder.add(w);
                    }
                });
    }

    Stream<String> stream() {
        return builder.build();
    }

    public static void main(String[] args) throws IOException {
        /**
         * 注意，构造器会添加文件中的所有单词（除了第一行，它是包含文件路径信息的注释），
         * 但是其并没有调用 build()。只要你不调用 stream() 方法，就可以继续向 builder 对象中添加单词。
         */
        new FileToWordsBuilder("F:/fuliao/data/lambdaDemo/src/main/java/com/united/流创建/随机数流/Cheese.dat")
                .stream()
                .limit(7)
                .map(w -> w + " ")
                .forEach(System.out::print);
    }
}
