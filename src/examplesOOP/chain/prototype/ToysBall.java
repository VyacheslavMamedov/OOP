package examplesOOP.chain.prototype;

/**
 * Created by asus on 25.07.17.
 */
public class ToysBall extends Toys {
    @Override
    public void CreateToys() {
        System.out.println("Create toy ball");
    }

    public ToysBall(){
        setType("toys is view ball");
        setCost("2_45");
    }
}
