package task;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class task1 {
    //Убрать дубликаты, отсортировать по идентификатору, сгруппировать по имени
    public static void main(String[] args) {

    }

    static class Person {
        final int id;

        final String name;

        Person(int id, String name) {
            this.id = id;
            this.name = name;
        }
        private static Person[] RAW_DATA = new Person[]{
                new Person(0, "Harry"),
                new Person(0, "Harry"), // дубликат
                new Person(1, "Harry"), // тёзка
                new Person(2, "Harry"),
                new Person(3, "Emily"),
                new Person(4, "Jack"),
                new Person(4, "Jack"),
                new Person(5, "Amelia"),
                new Person(5, "Amelia"),
                new Person(6, "Amelia"),
                new Person(7, "Amelia"),
                new Person(8, "Amelia"),
        };
        //дубликаты с помощью stream.distinct

        Stream<Person> distinctInts = Arrays.stream(RAW_DATA).distinct();
       // Stream<Person> personGrouppingByname = Person.collect(Collectors.groupingBy(Person :: get.name);
        Stream<Person> sortingInts = Arrays.stream(RAW_DATA).sorted();


        private static <K, T> K get(T t) {
            return null;
        };

        private static void collect() {
        }

    }
}
