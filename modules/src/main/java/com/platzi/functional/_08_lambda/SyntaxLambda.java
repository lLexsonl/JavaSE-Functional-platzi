package com.platzi.functional._08_lambda;

import com.platzi.functional._06_reference_operator.NamesUtils;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class SyntaxLambda {
    public static void main(String[] args) {
        List<String> courses = NamesUtils.getList("Java", "Functional");
        courses.forEach(course -> System.out.println(course));

        // use functional interface ZeroArguments
        useZero(() -> 2);
        usePredicate((text) -> text.isEmpty() );
        useBiFunction((x, y) -> x*y);

        useBiFunction((x, y) -> {
            System.out.println("IN lambda ");
            return x-y;
        });

        // syntax: function that does not receive any data and does not return any data
        useNothing(()-> {
            System.out.println("Hello, inside Nothing");
        });

        // Lambda with explicit data type // Not use primitives
        useBiFunction((Integer x, Integer y) -> x + y);
    }

    static void useZero(ZeroArguments zeroArguments) {    }
    static void usePredicate(Predicate<String> predicate) {    }
    static void useBiFunction(BiFunction<Integer, Integer, Integer> biFunction) {   }
    static void useNothing(Nothing nothing) {   }

    @FunctionalInterface
    interface ZeroArguments {
        int get();
    }

    @FunctionalInterface
    interface Nothing {
        void nothing();
    }
}
