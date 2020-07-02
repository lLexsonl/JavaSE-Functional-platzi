package com.platzi.functional._04_functional;

import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunction {
    public static void main(String[] args) {
        // functions as types
        Function<Integer, Integer> square = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        };
        System.out.println(square.apply(5));

        // first lambda
        Function<Integer, Boolean> isOdd = x -> x % 2 == 1;
        System.out.println(isOdd.apply(3));

        // predicates
        Predicate<Integer> isEven = x -> x%2 == 0;
        System.out.println(isEven.test(4));

        Predicate<Student> isApproved = student -> student.getNote() > 6.0;
        Student student = new Student(5.9);
        System.out.println(isApproved.test(student));
    }

    static class Student {
        private double note;

        public Student(double note) {
            this.note = note;
        }

        public double getNote() {
            return this.note;
        }
    }
}
