package com.zhuravishkin.javarush;

import java.util.regex.Pattern;

public class RegExTest {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[?,]+");
        String string = "?,?";
        System.out.println(pattern.matcher(string).matches());
    }
}
