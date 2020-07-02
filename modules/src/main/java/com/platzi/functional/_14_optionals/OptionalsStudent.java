package com.platzi.functional._14_optionals;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class OptionalsStudent {
    // normal functions
    static List<String> getNames() {
        List<String> list = new LinkedList<>();
        return Collections.emptyList();
    }

    static String mostValuablePlayer() {
        return null;
    }

    static int mostExpensiveItem() {
        return 0;
    }

    public static void main(String[] args) {
        List<String> names = getNames();
        if(names.isEmpty()) {

        }
        Optional<List<String>> optionalNames = getOptionalNames();
        if(optionalNames.isPresent()) {

        }

        optionalNames.ifPresent(namesValue -> namesValue.forEach(System.out::println));
        optionalNames.ifPresent(System.out::println);

        Optional<String> valuablePlayer = mostValuablePlayerOptional();
        String name = valuablePlayer.orElseGet(() -> "No player");

    }

    // functions with optional
    static Optional<List<String>> getOptionalNames() {
        List<String> list = new LinkedList<>();
        return Optional.of(list);
    }

    static Optional<String> mostValuablePlayerOptional() {
        String str = "";
        return Optional.empty();
    }

    static Optional<Integer> mostExpensiveItemOptional() {
        return Optional.empty();
    }
}
