package com.platzi.functional._05_sam;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public class AgeUtils {
    /* create our own interfaces
    @FunctionalInterface
    interface BiConsumer {
        void accept();
    }*/

    @FunctionalInterface
    interface  TriFunction<T, U, V, R> {
        R apply(T t, U u, V v);
    }

    public static void main(String[] args) {
        Function<Integer, String> addZeros = x -> x < 10 ? "0" + x : String.valueOf(x);

        // Convert three integers in a concrete date
        TriFunction<Integer, Integer, Integer, LocalDate> parseDate =
                (day, month, year) -> LocalDate
                        .parse(String.format("%d-%s-%s", year, addZeros.apply(month), addZeros.apply(day)));

        TriFunction<Integer, Integer, Integer, Integer> calculateAge =
                (day, month, year) ->Period
                        .between(parseDate.apply(day, month, year), LocalDate.now())
                        .getYears();
        // example
        System.out.println(calculateAge.apply(10, 10, 1992));
    }
}
