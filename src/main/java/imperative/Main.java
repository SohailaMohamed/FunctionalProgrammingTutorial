package imperative;

import java.util.ArrayList;
import java.util.List;

import static imperative.Main.Gender.FEMALE;
import static imperative.Main.Gender.MALE;

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

        //
        List<Person> females = new ArrayList<>();
        for (Person female: people) {
            if(FEMALE.equals(female.gender)){
                females.add(female);
            }
        }

        for (Person female: females) {
            System.out.println(female);
        }
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
