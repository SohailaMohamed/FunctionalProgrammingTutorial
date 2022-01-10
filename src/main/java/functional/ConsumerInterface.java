package functional;

import java.util.function.BiConsumer;
import java.util.function.Consumer;



public class ConsumerInterface {

    public static void main(String[] args) {

        Customer customer = new Customer("Sohaila", "123698745");

        //  Normal java function
        greeting(customer);

        // consumer takes one argument and return nothing
        //  Consumer Functional Interface
        greetingConsumerFunctional.accept(customer);

        // BiConsumer takes two argument and return nothing
        greetingBiConsumerFunctional.accept(customer, false);
    }

    static BiConsumer<Customer, Boolean> greetingBiConsumerFunctional =
            (customer, showPhoneNumber) -> System.out.println("Hello " + customer.customerName+
            ", thanks for registering \t phone number "+
                    (showPhoneNumber ? customer.customerPhoneNumber : "**********"));

    static Consumer<Customer> greetingConsumerFunctional =
                    customer -> System.out.println("Hello " + customer.customerName+
                    ", thanks for registering \t phone number "+
                    customer.customerPhoneNumber);

    static void greeting(Customer customer){
        System.out.println("Hello " + customer.customerName+
                ", thanks for registering \t phone number "+
                customer.customerPhoneNumber);
    }

    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
