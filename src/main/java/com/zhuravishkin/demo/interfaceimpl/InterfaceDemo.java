package com.zhuravishkin.demo.interfaceimpl;

public class InterfaceDemo implements A, B {
    @Override
    public void foo() {
        A.super.foo();
    }
}
