package com.zhuravishkin.zhuravishkin.demo.interfaceimpl;

public interface A {
    default void foo() {
        System.out.println("A");
    }
}
