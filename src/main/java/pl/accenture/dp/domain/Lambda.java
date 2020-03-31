package pl.accenture.dp.domain;

import java.util.Arrays;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {

        List<String> aList = Arrays.asList("a21","a2","a13","a4","b10","b2","c13","c4");

        aList
                .stream()
                .filter(s -> s.startsWith("b"))
                .map(s -> s.toUpperCase())
                .sorted()
                .forEach(s->System.out.println(s));

    }
}
