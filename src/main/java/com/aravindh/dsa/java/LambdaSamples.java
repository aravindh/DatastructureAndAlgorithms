package com.aravindh.dsa.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class LambdaSamples {
    public static void main(String[] args) {
        interfaceImplementationVsLambda();
        anonymousThreadVsLambda();
        comparatorExample();
        threadsSample();
    }

    private static void threadsSample() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

    /*
    * Comparator as Lambda vs Class impl
    * */
    private static void comparatorExample() {
        List<Person> personList = Arrays.asList(
                new Person("a", "a"),
                new Person("a", "b"),
                new Person("a", "c"),
                new Person("b", "b"),
                new Person("d", "d")
        );

        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.lastName.compareTo(o2.lastName);
            }
        });
        personList.forEach(p -> System.out.println(p));

        Collections.sort(personList, (p1,p2) -> p1.firstName.compareTo(p2.firstName));

        //Function as reference
        personList.forEach(System.out::println);
    }

    /*
    *  anonymous class implementation vs lambda
    *  Passing impl instance vs lambda as method param
    *  Type inference - Notice that in lambda impl, param passing and return the type is not specified, java infers from interface.
    * */
    private static void interfaceImplementationVsLambda() {

        Greeting greetingClass = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello world");
            }
        };

        Greeting greetingLambda = () -> System.out.println("Hello world");
        greetingClass.perform();
        greetingLambda.perform();

        System.out.println("Passing lambda as param");
        passingLambdaAsParama(greetingClass);
        passingLambdaAsParama(greetingLambda);

        Add addLambda = (x,y) ->  x+y;
        System.out.println("Using lambda with param "+addLambda.add(2,3));
    }

    private static  void passingLambdaAsParama(Greeting greeting){
        greeting.perform();
    }


    /*
     * Lambda works based on interface, it helps is backward compatability.
     * But note there should be only one method in interface
     * Notice there is arrow "-> between function param and implementation"
     * */
    private static void anonymousThreadVsLambda(){
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world");
            }
        });

        Thread myLambda = new Thread( () -> System.out.println("Hello world"));

        System.out.println("Using anonymousThread ");
        myThread.run();

        System.out.println("Using lambda ");
        myLambda.run();
    }

    /*
     * This annotation tells its FunctionalInterface, ie. there is only one abstract method, this is used for lambda expressions.
     * This is same as a interface with single method, but this annotation enforces this constraint
     * */
    @FunctionalInterface
    public interface Greeting {
        void perform();

        default void log(){
            System.out.println("Inside log");
        }
    }

    @FunctionalInterface
    public interface Add {
        int add(int a, int b);
    }

    static class Person{
        String firstName;
        String lastName;

        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }
    }



}
