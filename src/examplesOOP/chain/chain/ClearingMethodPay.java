package examplesOOP.chain.chain;

/**
 * Created by asus on 16.07.17.
 */
public class ClearingMethodPay extends Money {

    public ClearingMethodPay(int methodPay) {
        super(methodPay);
    }

    @Override
    public void write(String message) {
        System.out.println("Method 3 -" + message);
    }
}
