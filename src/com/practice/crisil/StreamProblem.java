package com.practice.crisil;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamProblem {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7);
        Stream<Integer> integerStream = numList.stream();
        List<Integer> numList1 = integerStream.filter(e->e == 1).collect(Collectors.toList());
        List<Integer> numList2 = integerStream.filter(e->e == 2).collect(Collectors.toList());
        numList1.forEach(System.out::println);
        numList2.forEach(System.out::println);
    }
}
