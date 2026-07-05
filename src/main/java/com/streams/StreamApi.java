package com.streams;

import java.util.Arrays;
import java.util.List;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5,10,20,10,40,70);
        numbers.stream()
            .filter(n -> n > 10)
            .map(n -> n  * 2)
            .distinct()
            .sorted()
            .forEach(System.out::println);

        List<List<String>> listoflists = Arrays.asList(
                Arrays.asList("Reflection", "Collection", "Stream"),
                Arrays.asList("Structure","State", "Flow"),
                Arrays.asList("Sorting", "Mapping", "Reduction", "Stream")
        );
        System.out.println(listoflists);

        List<String> results = listoflists.stream()
                .flatMap(List::stream)
                .filter(s -> s.startsWith("S"))
                .map(String::toUpperCase)
                .distinct()
                .sorted()
                .toList();
        System.out.println(results);
    }

}
