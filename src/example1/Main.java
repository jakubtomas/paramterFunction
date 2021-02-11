package example1;

import java.util.function.BiFunction;

public class Main {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> age =Animal::age;

        Person person = new Person(1996);

        int personAge = age.apply(person.getYearOfBirt(), 2021);

        System.out.println("Age of this person is " + personAge);
        System.out.println("Age of this person is " + personAge);
    }
}
