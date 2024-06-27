package com.zhuravishkin.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSequencesNumbers1Test {

    @Test
    void run1() {
        assertEquals(LongestSequencesNumbers1.run(new int[]{1, 1, 0, 0, 1, 1, 0}), 2);
    }

    @Test
    void run2() {
        assertEquals(LongestSequencesNumbers1.run(new int[]{1, 1, 0, 0, 1, 1, 1}), 3);
    }

    @Test
    void run3() {
        assertEquals(LongestSequencesNumbers1.run(new int[]{1, 1, 1, 1, 1}), 5);
    }

    @Test
    void run4() {
        assertEquals(LongestSequencesNumbers1.run(new int[]{0, 0, 0, 0, 0}), 0);
    }

    @Test
    void run5() {
        assertEquals(LongestSequencesNumbers1.run(new int[]{}), 0);
    }
}