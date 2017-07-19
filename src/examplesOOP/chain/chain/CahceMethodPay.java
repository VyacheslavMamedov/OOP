package examplesOOP.chain.chain;

/**
 * Created by asus on 16.07.17.
 */
public class CahceMethodPay extends Money {

    public CahceMethodPay(int methodPay) {
        super(methodPay);
    }

    @Override
    public void write(String message) {
        System.out.println( "Cache method. Check opportunity pay  - " + message);
    }
}
