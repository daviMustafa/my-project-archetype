package com.demo.utils;

import java.util.Collection;

public final class ValidationUtils {

    private ValidationUtils() {}

    public static <T> boolean IsNullOrEmpty(Collection<T> list) {
        return list == null || list.isEmpty();
    }

}
