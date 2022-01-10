package functional;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionalInterface {

    public static void main(String[] args) {

        //  Function
        //            takes single param and returns single value.

//        int imperative = incremental(5);
//        int declarative = incrementalByOneFunction.apply(5);
//        System.out.println(" imperative = " + imperative);
//        System.out.println(" declarative = " + declarative);

//        int incrementAndMulti = incrementThenMultiplyFunction.apply(5);
//        System.out.println(" incrementAndMulti = " + incrementAndMulti);

        //  BiFunction
        //              takes 2-param and returns single value.
        System.out.println("BiFunction = " + incrementThenMultiplyBiFunction.apply(3,10));

    }

    static int incremental(int number){
        return ++number;
    }

    //  Function

    static Function<Integer, Integer> incrementalByOneFunction = number -> ++number;

    static Function<Integer, Integer> multiplyByTenFunction = number -> number * 10;

    static Function<Integer, Integer> incrementThenMultiplyFunction = incrementalByOneFunction.andThen(multiplyByTenFunction);

    // BiFunction

    static BiFunction<Integer, Integer, Integer> incrementThenMultiplyBiFunction =
            (incrementVal, multiplyVal) -> ++incrementVal * multiplyVal;
}
