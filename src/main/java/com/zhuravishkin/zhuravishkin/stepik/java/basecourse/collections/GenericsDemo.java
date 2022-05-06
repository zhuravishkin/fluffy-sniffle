package com.zhuravishkin.zhuravishkin.stepik.java.basecourse.collections;

import java.util.Optional;

public class GenericsDemo<T> {
    public void someMethod(Object obj) {
        T a = (T) obj;
        Optional<T> b = Optional.empty();
    }
}
