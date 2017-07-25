package examplesOOP.chain.prototype;

/**
 * Created by asus on 25.07.17.
 */
public class ToysGirl extends Toys {
    @Override
    public void CreateToys() {
        System.out.println("create toy girl");
    }

    public ToysGirl(){
        setType("toy is vew girl");
        setCost("1_000");
    }
}
