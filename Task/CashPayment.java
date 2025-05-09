public class CashPayment implements Payable{

    @Override
    public void pay(double amount){
        System.out.println("Cash pay "+amount);
    }
}
