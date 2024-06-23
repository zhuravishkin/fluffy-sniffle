package com.zhuravishkin.interview;

public class FinallyDemo {
    public static void main(String[] args) {
        try {
            throw new NullPointerException("npe 1");
        } catch (NullPointerException e) {
            throw new NullPointerException("npe 2");
        } finally {
            return;
        }
    }
}
