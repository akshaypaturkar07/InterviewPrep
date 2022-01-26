package com.practice.altimetrik;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 5, 6, 7, 8, 9, 10);
        System.out.println(list.stream().mapToInt(e -> e).sum());
        System.out.println(list.stream().filter(e -> e % 2 == 0).mapToInt(e -> e).sum());
        List<String> namesList = Arrays.asList("akshay","swati","pinky","shubham","swati","akshay");
        namesList.stream().distinct().forEach(e->System.out.println(e));
    }


}
