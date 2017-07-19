package examplesOOP.chain.bridge;

/**
 * Created by asus on 19.07.17.
 */
public class YellowVechicle extends CreateVechicle {


    public YellowVechicle(Vechicle vechicle) {
        super(vechicle);
    }

    @Override
    public void developerCar() {
        System.out.print("Created Yellow collor ");
        vechicle.createVechicle();
    }
}
