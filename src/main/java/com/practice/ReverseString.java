package com.practice;

public class ReverseString {
    public static void main(String[] args) {
        //reverse the string - dont have reverse function in string
        // using for loop
        String str = "Shaurya Auti";
        int len = str.length();
        String rev = "";
        for (int i=len-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);

        // using string buffer class
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());

        // String is immutable and StringBuffer is Mutable
    }
}
