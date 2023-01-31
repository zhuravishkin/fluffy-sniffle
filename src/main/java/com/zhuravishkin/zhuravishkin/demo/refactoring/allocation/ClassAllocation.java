package com.zhuravishkin.zhuravishkin.demo.refactoring.allocation;

public class ClassAllocation {
    public static void main(String[] args) {
        Human human = new Human("Sam", 30, Address.builder().build());
        System.out.println(human.getFullAddress());
    }
}
