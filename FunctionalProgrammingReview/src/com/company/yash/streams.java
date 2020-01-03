package com.company.yash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class streams {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList(
                "Z11", "Z11",
                "E11", "E12",
                "G12", "g14", "G11", "G13",
                "F22");

  //      List<String> sortedNumbers = new ArrayList<>();
//        System.out.println("not sorted numbers:");
//        for (String number : strings) {
//
//            if (number.toUpperCase().startsWith("G")) {
//                sortedNumbers.add(number);
//                System.out.println(number);
//            }
//
//        }
//        System.out.println("Sorted numbers: ");
//        sortedNumbers.sort((s1, s2) -> s1.compareTo(s2));
//        sortedNumbers.forEach(System.out::println);
        strings.stream().map(String::toUpperCase).filter(value -> value.startsWith("G")).sorted().forEach(System.out::println);




    }
}
