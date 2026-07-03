package com.practice;

public class RemoveJunk {
    public static void main(String[] args) {

        String str = "@#$ hello world .. ^& 12";
        // use regular expression  [^a-zA-Z0-9]
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str);

    }
}
