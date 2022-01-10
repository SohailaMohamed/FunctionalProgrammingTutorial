package functional;

import java.util.List;
import java.util.function.Supplier;

public class SupplierInterface {

    public static void main(String[] args) {

        System.out.println(getUrl());
        System.out.println(getUrlSupplier.get());
        System.out.println(getUrlsSupplier.get());
    }

    static String getUrl(){
        return "url Connection";
    }

    static Supplier<String> getUrlSupplier = () -> "url Supplier Connection";

    static Supplier<List<String>> getUrlsSupplier = () -> List.of("url Supplier Connection 1",
            "url Supplier Connection 2");

}
