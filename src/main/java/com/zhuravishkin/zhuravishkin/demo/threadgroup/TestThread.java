package com.zhuravishkin.zhuravishkin.demo.threadgroup;

public class TestThread implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getThreadGroup() + ":" +
                Thread.currentThread().getName() + ":" +
                Thread.currentThread().getPriority());
    }
}
