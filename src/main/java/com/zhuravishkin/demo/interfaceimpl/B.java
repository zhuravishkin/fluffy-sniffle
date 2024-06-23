package com.zhuravishkin.demo.interfaceimpl;

public interface B {
    default void foo() {
        System.out.println("B");
    }
}
