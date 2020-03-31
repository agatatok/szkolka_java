package pl.accenture.dp.domain;

import lombok.ToString;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Lambda {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Bogdan"),
                new Person("Ala"),
                new Person("Barbara"),
                new Person("Zbyszek")
        );

        var collect = people
                .stream()
                .filter(Person.imieZaczynaSieNaBPredicate)
                //.forEach(System.out::println);
                .collect(Collectors.toList());
    }
}

@ToString
class Person {
    String name;
    public Person(String name){
        this.name = name;
    }
    static Predicate<Person> imieZaczynaSieNaBPredicate = p -> p.name.startsWith("B");

}
