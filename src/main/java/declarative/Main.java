package declarative;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

import static declarative.Main.Gender.FEMALE;
import static declarative.Main.Gender.MALE;


public class Main {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Sohaila", FEMALE),
                new Person("Marwan", MALE),
                new Person("Esraa", FEMALE),
                new Person("Asmaa", FEMALE),
                new Person("Belal", MALE),
                new Person("Esawy", MALE),
                new Person("Kholod", FEMALE)
        );

        people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // to collect in list
        List<Person> females = people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                .collect(Collectors.toList());

        // to print directly
        people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                .forEach(System.out::println);

        // to do foreach
        females.forEach(System.out::println);

    }

    static class Person{
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person { " +
                    " Name : " + name + ",\t" +
                    "Gender : " + gender
                    + " }";
        }
    }

    enum Gender{
        MALE, FEMALE
    }
}
