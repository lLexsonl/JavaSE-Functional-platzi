package com.platzi.functional._15_streams_intro;

import com.platzi.functional._06_reference_operator.NamesUtils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<String> courseList = NamesUtils.getList("Java", "Go", "CSharp");

        for (String course : courseList) {
            System.out.println(course.toLowerCase());
        }

        Stream<String> courseStream = Stream.of("Java", "Go", "CSharp");

        Stream<String> coursesToLowerCase = courseStream.map(String::toLowerCase);

        Optional<Integer> longestNameCourse = coursesToLowerCase.map(String::length).max((x, y) -> x-y);
        longestNameCourse.ifPresent(System.out::println);

        // a Stream cannot be called more than once
        //Stream<String> justJavaCourse = coursesToLowerCase.filter(course -> course.contains("java"));

        Stream<String> courseStreamTwo = courseList.stream();
        addOperator(courseStreamTwo // stream chaining
                .map(String::toUpperCase)
                .filter(course -> course.contains("A")))
                .forEach(System.out::println);
    }

    static <T> Stream<T> addOperator(Stream<T> stream) {
        return stream.peek(s -> System.out.println("Data: " + s));
    }
}
