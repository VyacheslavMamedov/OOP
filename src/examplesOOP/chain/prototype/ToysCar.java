package examplesOOP.chain.prototype;

/**
 * Created by asus on 25.07.17.
 */
public class ToysCar extends Toys {
    @Override
    public void CreateToys() {
        System.out.println("Create toy car");
    }

    public ToysCar(){
        setType("toys is view car");
        setCost("1_234");
    }
}
