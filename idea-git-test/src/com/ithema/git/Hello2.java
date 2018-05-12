package com.ithema.git;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Hello2 {
    @Test
    public void test() {
        List<String> list = Stream.of("1", "a", "b", "c", "5").collect(Collectors.toList());
        list.forEach(e-> System.out.println(e));
    }
    @Test
    public void test2() {
        List<String> list = Stream.of("1", "a", "b", "c", "5").collect(Collectors.toList());
        list.forEach(e-> System.out.println(e));
    }
}
