package com.platzi.functional._11_composition;

import java.util.function.Function;

public class MathOperationTwo {
    public static void main(String[] args) {
        // add steps before a function
        Function<Integer, Integer> multiplyByThree =
                x -> {
                    System.out.println("Multiplying: " + x);
                    return x * 3;
                };

        Function<Integer, Integer> addOneMultiplyByThree =
                multiplyByThree.compose(y -> {
                    System.out.println("Add 1 to: " + y);
                    return y + 1;
                });

        System.out.println(addOneMultiplyByThree.apply(5));

        // add steps after a function
        Function<Integer, Integer> andSquare =
                addOneMultiplyByThree.andThen(x -> {
                    System.out.println("Square of " + x);
                    return x * x;
                });
        System.out.println(andSquare.apply(4));
    }
}
