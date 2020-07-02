package com.platzi.functional._15_streams_intro;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TypeStream {
    public static void main(String[] args) {
        Long start = 0L, end = 0L;

        start = System.currentTimeMillis();
        IntStream infiniteStreamParallel1 = IntStream.iterate(0, x -> x + 1);
        List<Integer> listParallel1 = infiniteStreamParallel1.limit(1000)
                .parallel() // concurrent but unordered
                .filter(x -> x % 2 == 0)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(listParallel1);
        end = System.currentTimeMillis();
        System.out.print("Parallel bad: ");
        System.out.println(end - start);

        start = System.currentTimeMillis();
        IntStream infiniteStream = IntStream.iterate(0, x -> x + 1);
        List<Integer> list  = infiniteStream.limit(1000)
                .filter(x -> x % 2 == 0)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(list);
        end = System.currentTimeMillis();
        System.out.print("No parallel: ");
        System.out.println(end - start);

        start = System.currentTimeMillis();
        IntStream infiniteStreamParallel = IntStream.iterate(0, x -> x + 1);
        List<Integer> listParallel = infiniteStreamParallel.limit(1000)
                .parallel() // concurrent but unordered
                .filter(x -> x % 2 == 0)
                .boxed()
                .sorted(Integer::compareTo)
                .collect(Collectors.toList());
        System.out.println(listParallel);
        end = System.currentTimeMillis();
        System.out.print("Parallel: ");
        System.out.println(end - start);
    }
}
