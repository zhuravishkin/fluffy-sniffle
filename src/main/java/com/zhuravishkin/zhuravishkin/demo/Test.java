package com.zhuravishkin.zhuravishkin.demo;

import lombok.Data;

@Data
public class Test {
    private String name;

    public static void main(String[] args) {
//        Object[] objects = new String[2];
//        objects[0] = "test";
////        objects[1] = 1;
//        for (int i = 0; i < objects.length; i++) {
//            System.out.println(objects[i]);
//        }
//
//        String[] strings = new String[0];
//        strings[0] = "test";

        int a = 150;
        byte b = (byte) a;
        System.out.println(b);
        System.out.println(Integer.toBinaryString(150));
    }
}
