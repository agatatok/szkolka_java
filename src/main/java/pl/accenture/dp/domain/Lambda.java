package pl.accenture.dp.domain;

import lombok.ToString;

import java.util.List;
import java.util.function.Predicate;

import static pl.accenture.dp.domain.Person.*;

public class Lambda {
    public static void main(String[] args) {

        List<Person> ludzie = List.of(
                new Person("Anna", "Barańska", 30),
                new Person("Andrzej", "Nowak", 21),
                new Person("Jan", "Baran", 15),
                new Person("Alicja", "Bobrowska", 24),
                new Person("Alojzy", "Bór", 18),
                new Person("Jacek", "Placek", 24),
                new Person("Ignacy", "Kowalski", 50)
        );

        ludzie
                .stream()
                .filter(imieZaczynaSieNaAPredicate.and(nazwiskoZaczynaSieNaBPredicate).and(wiekPowyzej20Lat))
                .forEach(System.out::println);
    }
}

@ToString
class Person {
    String firstName;
    String lastName;
    int age;

    public Person(String name, String lastName, int age) {
        this.firstName = name;
        this.lastName = lastName;
        this.age = age;
    }

    static Predicate<Person> imieZaczynaSieNaAPredicate = p -> p.firstName.toUpperCase().startsWith("A");
    static Predicate<Person> nazwiskoZaczynaSieNaBPredicate = p -> p.lastName.toUpperCase().startsWith("B");
    static Predicate<Person> wiekPowyzej20Lat = p -> p.age>20;

}
