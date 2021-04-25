package com.cybertek.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {

        Integer[ ] numbersArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Stream<Integer>  numberStream = Arrays.stream(numbersArray);


        System.out.println("****** FILTER *******");

        //FILTER
        System.out.println("Number of odd numbers in the list : " + numberStream.filter(number -> number % 2 != 0).count());


        Stream<String> strStream = Arrays.asList("Apple", "Orange", "Kiwi", "Banana", "Apple", "Cherry", "Mango").stream();
        //System.out.println("Number of words having 5 letter length in the list : " + strStream.filter(str -> str.length() == 5).count());
//AFTER COUNT STREAM IS CLOSED. YOU CAN NOT ASK FOR ANOTHER TERMIMAL OPERATION
        System.out.println("Number of words starting with A in the list : " +strStream.filter(str -> str.startsWith("A")).count());

        Arrays.asList("Apple", "Orange", "Kiwi", "Banana", "Apple", "Cherry", "Mango").stream().filter(str -> str.equals("Apple")).forEach(str-> System.out.println(str));


        System.out.println("****** MAP *******");

        Arrays.asList("Apple", "Orange", "Kiwi", "Banana", "Apple", "Cherry", "Mango").stream().map(str->str.toUpperCase()).forEach(str-> System.out.println(str));


        System.out.println("****** DISTINCT *******");
        Arrays.asList("Apple", "Orange", "Kiwi", "Banana", "Apple", "Cherry", "Mango").stream().distinct().forEach(str-> System.out.println(str));

        System.out.println("****** SORTED ORDER *******");

        Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream().sorted().forEach(number -> System.out.print(number + " "));

        System.out.println();

        System.out.println("****** SORTED REVERSED ORDER *******");

        Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream().sorted(Comparator.reverseOrder()).forEach(number -> System.out.print(number + " "));






    }
}
