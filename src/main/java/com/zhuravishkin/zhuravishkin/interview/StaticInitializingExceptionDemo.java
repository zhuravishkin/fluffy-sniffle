package com.zhuravishkin.zhuravishkin.interview;

public class StaticInitializingExceptionDemo {
    public static void main(String[] args) {
        try {
            Test.run();
        } catch (Throwable e) {
            Test.run();
        }
    }


}

class Test {
    static {
        if (true) throw new NullPointerException();
    }

    static void run() {
    }
}
