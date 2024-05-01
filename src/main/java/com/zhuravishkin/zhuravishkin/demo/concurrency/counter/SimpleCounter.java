package com.zhuravishkin.zhuravishkin.demo.concurrency.counter;

import lombok.Getter;

@Getter
public class SimpleCounter {
    private long count;

    public void increment() {
        count++;
    }
}
