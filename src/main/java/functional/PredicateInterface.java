package functional;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredictInterface {

    public static void main(String[] args) {

        //  normal method
        System.out.println(validPhoneNumber("0245678"));
        System.out.println(validPhoneNumber("0345678"));
        System.out.println(validPhoneNumber("02456781"));

        //  Predict
        System.out.println(predicateValidPhoneNumber.test("0245678"));
        System.out.println(predicateValidPhoneNumber.test("0645678"));

        System.out.println(predicateValidPhoneNumber.and(predicatePhoneNumberContainsThree).test("0245638"));

        System.out.println(biPredicateValidPhoneNumber.test("0245638", "024"));
    }

    static BiPredicate<String, String> biPredicateValidPhoneNumber =
            (phoneNumber, match) -> phoneNumber.startsWith("02") &&
                    phoneNumber.length()==7 && phoneNumber.contains(match);

    static Predicate<String> predicatePhoneNumberContainsThree =
            phoneNumber -> phoneNumber.contains("3");

    static Predicate<String> predicateValidPhoneNumber =
            phoneNumber -> phoneNumber.startsWith("02") && phoneNumber.length()==7;

    static boolean validPhoneNumber(String phoneNumber){
        return phoneNumber.startsWith("02") && phoneNumber.length()==7;
    }
}
