package com.platzi.functional._04_functional;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public class StringFunctions {
    public static void main(String[] args) {
        UnaryOperator<String> quote = text -> String.format("\"%s\"", text);
        System.out.println(quote.apply("Studying in functional programing"));

        BiFunction<Integer, Integer, Integer> multiply = (x, y) -> x*y;
        System.out.println(multiply.apply(5, 4));

        // left path
        BiFunction<String, Integer, String> leftPad = (text, number) -> String.format("%" + number + "s", text);
        System.out.println(leftPad.apply("java", 10));

        List<BiFunction<String, Integer, String>> formatter;
    }
}