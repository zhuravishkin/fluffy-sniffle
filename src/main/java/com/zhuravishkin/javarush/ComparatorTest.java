package com.zhuravishkin.javarush;

public class ComparatorTest {
    public static void main(String[] args) {
        String s = "Привет, мир";
        System.out.println(s.lastIndexOf(" "));
        System.out.println(s.substring(s.lastIndexOf(" ")));
    }
}
