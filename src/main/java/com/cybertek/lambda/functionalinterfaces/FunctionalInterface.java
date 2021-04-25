package com.cybertek.lambda.functionalinterfaces;

import java.lang.invoke.ConstantCallSite;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterface {
    public static void main(String[] args) {
        System.out.println("There are 4 types of inbuilt Functional Interfaces: apply, get, accept, test");
        System.out.println("//Accepts a single parameter and returns a single value");
        Function<Integer, Double> half = a -> a/2.0;
        System.out.println(half.apply(10));

        System.out.println("//Does not accept  any arguments and returns an object");
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());

        System.out.println("//Accepts a single argument and does not return any result");
        Consumer<Integer> display = a  -> System.out.println(a);
        display.accept(10);

        System.out.println("//Accepts a single argument and returns true or false");
        Predicate<Integer> lesserThan = i -> (i<10);
        System.out.println(lesserThan.test(5));
    }
}
