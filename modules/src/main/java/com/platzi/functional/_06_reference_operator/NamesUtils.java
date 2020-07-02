package com.platzi.functional._06_reference_operator;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class NamesUtils {
    @SafeVarargs
    public static <T> List<T> getList(T... elements) {
        return Arrays.asList(elements);
    }

    public static void main(String[] args) {
        List<String> teachers = getList("Nicolas" , "Pedro" ,"Marcos");

        Consumer<String> printer = text -> System.out.println(text);

        // are the same
        teachers.forEach(printer);
        teachers.forEach(System.out::println);
    }
}
