package examplesOOP.chain.chain;

public abstract class Money {
    private int methodPay;
    private Money nextPay;

    public Money(int methodPay) {
        this.methodPay = methodPay;
    }

    public void setNextPay(Money nextPay) {
        this.nextPay = nextPay;
    }

    public void moneyManager(String message, int method) {

        //System.out.println(method +" : " + methodPay);
        if ( method >= methodPay) {
            write(message);
        }
        if (nextPay != null) {
            nextPay.moneyManager(message, method);
        }
    }

    public abstract void write(String message);
}
