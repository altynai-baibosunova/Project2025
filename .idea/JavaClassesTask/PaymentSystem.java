//public class PaymentSystem {
//
//    interface Payable {
//        void pay(double amount);
//
//        }
//
//        class CreditCardPayment implements Payable {
//            @Override
//            public void pay(double amount) {
//                System.out.println("CreditCard " + amount);
//
//            }
//        }
//
//        static class CashPayment implements Payable {
//            @Override
//            public void pay(double amount) {
//                System.out.println("CashPayment " + amount);
//            }
//        }
//
//
//        public static void main(String[] args) {
//            Payable creditCardPayment = new CreditCardPayment();
//            Payable cashPayment = new CashPayment();
//
//            creditCardPayment.pay(238.35);
//            cashPayment.pay(100.0);
//        }
//    }


//    static class CreditCardPayment implements Payable {
//        @Override
//        public void pay(double amount) {
//            System.out.println("CreditCard " + amount);
//        }

//1. Payment System (Interface)
//Requirements:
//● Create an interface Payable:
//void pay(double amount);
//● Implement two classes:
//○ CreditCardPayment
//○ CashPayment
//● Each should print a custom message in pay() indicating how the payment is
//processed.
//Bonus:
//● Write a method that takes a Payable[] and charges each one a random amount
//between $1–100.
//● Demonstrate how the same method can call pay() on all types using polymorphism.
//● Add a refund(double amount) method to the interface. Think about how
//CreditCardPayment and CashPayment would behave differently.

