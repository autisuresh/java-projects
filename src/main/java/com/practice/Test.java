package com.practice;

import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        // sort in reverse order
        List<Integer> num = Arrays.asList(3,5,7,9);
        List<Integer> sortedNum = num.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(sortedNum);

        // count list of names starts with specific char
        List<String> names = Arrays.asList("Alice","Array","Bob","Charlie","Alex");
        long count = names.stream()
                .filter(n -> n.startsWith("A"))
                .count();
        System.out.println(count);

        // sum of array list numbers
        List<Integer> num1 = Arrays.asList(4,2,6,1,9);
        int sum = num1.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);

        // group string by length
        List<String> words1 = Arrays.asList("java","Stream API", "code","Fun");
        Map<Integer, List<String>> groupByLength = words1.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(groupByLength);

        // reverse a string without using build in methods
        String str = "testing";
        String reversed = "";
        for (int i=str.length() - 1; i>=0; i--){
            reversed = reversed + str.charAt(i);

        }
        System.out.println(str);
        System.out.println(reversed);

        // reverse each work in sentense
        // hi hello how are you
        String sentense = "hi hello how are you";
        String[] words = sentense.split(" ");
        StringBuffer result = new StringBuffer();
        String reversedWords = "";
        for(int i = words.length - 1; i >=0; i--) {
            result.append(words[i]).append(" ");
            reversedWords = reversedWords + words[i] + " ";
        }
        System.out.println(reversedWords);



        // check is string is palindrome - check uppcase and spaces
        String str2 = "Nurses run";
        str2 = str2.replaceAll("\\s","").toLowerCase();
        boolean isPalindrome = true;
        int left = 0;
        int right = str2.length() - 1;

        while (left < right) {
            if (str2.charAt(left) != str2.charAt(right)) {
                isPalindrome = false;
                break;

            }
            left++;
            right--;
        }
        System.out.println("isPalindrome: " + isPalindrome);
    }


}
