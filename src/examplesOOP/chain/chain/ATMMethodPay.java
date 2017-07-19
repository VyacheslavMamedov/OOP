package examplesOOP.chain.chain;

/**
 * Created by asus on 16.07.17.
 */
public class ATMMethodPay extends Money {
    public ATMMethodPay(int methodPay) {
        super(methodPay);
    }

    @Override
    public void write(String message) {
        System.out.println("Method 2 - "+message);
    }
}
