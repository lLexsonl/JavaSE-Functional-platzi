package com.platzi.functional._07_inference;

import com.platzi.functional._06_reference_operator.NamesUtils;

import java.util.List;
import java.util.function.Function;

public class InferenceStudent {
    public static void main(String[] args) {
        Function<Integer, String> functionConvert =
                integer -> "The double: " + integer * 2;

        List<String> students = NamesUtils.getList("John", "Tonya", "JJ");
        students.forEach(System.out::println);
    }
}
