package com.nice.piyush;

import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        Demo.infiniteStreamTut();
    }

    public static void infiniteStreamTut() {
        Stream<Integer> infiniteStream = Stream.iterate(0, i -> i + 2);

        infiniteStream.limit(10000).forEach(System.out::println);
    }

    public void test(){
        System.out.println("Inside Test");
    }
}
