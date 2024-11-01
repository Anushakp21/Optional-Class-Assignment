package com;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FlatMapExample {

    public static List<String> getNonEmptyStrings(Optional<List<String>> optionalList) {
        return optionalList
                .flatMap(list -> Optional.of(
                    list.stream()
                        .filter(s -> !s.isEmpty())
                        .collect(Collectors.toList())
                ))
                .orElse(List.of());
    }

    public static void main(String[] args) {
        Optional<List<String>> nonEmptyList = Optional.of(List.of("apple", "", "banana", " ", "cherry", ""));
        Optional<List<String>> emptyOptionalList = Optional.empty();

        System.out.println(getNonEmptyStrings(nonEmptyList)); 

        System.out.println(getNonEmptyStrings(emptyOptionalList));
    }
}
