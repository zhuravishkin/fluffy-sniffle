package com.zhuravishkin.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestValidParenthesesTest {

    @Test
    void run1() {
        assertEquals(LongestValidParentheses.run("(()"), 2);
    }

    @Test
    void run2() {
        assertEquals(LongestValidParentheses.run(")()())"), 4);
    }

    @Test
    void run3() {
        assertEquals(LongestValidParentheses.run("()"), 2);
    }

    @Test
    void run4() {
        assertEquals(LongestValidParentheses.run("(())"), 4);
    }

    @Test
    void run5() {
        assertEquals(LongestValidParentheses.run("((()))"), 6);
    }

    @Test
    void run6() {
        assertEquals(LongestValidParentheses.run("()()()"), 6);
    }

    @Test
    void run7() {
        assertEquals(LongestValidParentheses.run("()(())"), 6);
    }

    @Test
    void run8() {
        assertEquals(LongestValidParentheses.run("(())(())"), 8);
    }

    @Test
    void run9() {
        assertEquals(LongestValidParentheses.run("((("), 0);
    }

    @Test
    void run10() {
        assertEquals(LongestValidParentheses.run(")))"), 0);
    }

    @Test
    void run11() {
        assertEquals(LongestValidParentheses.run(""), 0);
    }

    @Test
    void run12() {
        assertEquals(LongestValidParentheses.run("(())))((()))"), 6);
    }
}