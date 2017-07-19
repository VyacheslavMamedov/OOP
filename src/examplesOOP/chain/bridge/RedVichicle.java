package examplesOOP.chain.bridge;

/**
 * Created by asus on 19.07.17.
 */
public class RedVichicle extends CreateVechicle{
    @Override
    public void developerCar() {
        System.out.print("Created Red color");
        vechicle.createVechicle();
    }

    public RedVichicle(Vechicle vechicle) {
        super(vechicle);
    }
}
