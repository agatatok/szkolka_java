package pl.accenture.dp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

import static pl.accenture.dp.domain.Person.posortujPoMiescie;
import static pl.accenture.dp.domain.Person.posortujPoNazwisku;

public class Lambda {
    public static void main(String[] args) {


        List<Person> people = przygotujListeOsob();
        System.out.println("TODO 1");
        sortowanieJeden(people);
        System.out.println("TODO 2");
        sortowanieOba(people);
        System.out.println("TODO 3");
        sortowanieObaJedenOdwrocony(people);

        System.out.println("TODO z flatmap");
        flatMapuj();


 /*
        //stream map
        var imionaLudzi = people
                .stream()
                .map(p->p.getName())
                .collect(Collectors.toList());
        System.out.println(imionaLudzi);

        List<String> ludzie = List.of(
                "Lukasz-Wyspianski", "Ania-Kowalska", "Jan-Nowak", "Jerzy-Borowik", "Kasia-Nowacka"
        );

        ludzie
                .stream()
                .map(s->new Person(s.substring(0, s.indexOf('-')), s.substring(s.indexOf('-')+1),new Address("Krakow")))
                .forEach(System.out::println);
            */


    }

    private static void flatMapuj() {
        List<Integer> liczbyPierwsze = List.of(3,5,7);
        List<Integer> liczbyParzyste = List.of(2,4,6);
        List<Integer> liczbyNieparzyste = List.of(1,3,5);

        List<List<Integer>> listaDoSplaszczenia = List.of(liczbyPierwsze, liczbyParzyste, liczbyNieparzyste);

        System.out.println(listaDoSplaszczenia);

        listaDoSplaszczenia
                .stream()
                .flatMap(Collection::stream)
                .sorted()
                .forEach(System.out::println);
    }


    private static void sortowanieJeden(List<Person> people) {
        people
                .stream()
                .sorted(posortujPoNazwisku)
                .forEach(System.out::println);
    }
    private static void sortowanieOba(List<Person> people) {
        people
                .stream()
                .sorted(posortujPoNazwisku.thenComparing(posortujPoMiescie))
                .forEach(System.out::println);
    }
    private static void sortowanieObaJedenOdwrocony(List<Person> people) {
        people
                .stream()
                .sorted(posortujPoNazwisku.thenComparing(posortujPoMiescie).reversed())
                .forEach(System.out::println);
    }

    private static List<Person> przygotujListeOsob() {
        return List.of(
                new Person("Adam", "Kowalski", new Address("Katowice")),
                new Person("Jan", "Nowak", new Address("Krakow")),
                new Person("Anna", "Borowska", new Address("Warszawa")),
                new Person("Barbara", "Ibisz", new Address("Gdynia")),
                new Person("Krzysztof", "Ibisz", new Address("Kozia Wolka")),
                new Person("Anna", "Ibisz", new Address("Zakopane"))
        );
    }
}

@Data
@AllArgsConstructor
class Person {
    private String name;
    private String lastName;
    private Address address;

    static Comparator<Person> posortujPoNazwisku = Comparator.comparing(Person::getLastName);
    static Comparator<Person> posortujPoMiescie = Comparator.comparing(p -> p.getAddress().getCity());

}
@Data
@AllArgsConstructor
class Address {
    private String city;
}