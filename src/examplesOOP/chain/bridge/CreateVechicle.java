package examplesOOP.chain.bridge;

/**
 * Created by asus on 19.07.17.
 */
public abstract class CreateVechicle {
    protected Vechicle vechicle;

    public CreateVechicle(Vechicle vechicle) {
        this.vechicle = vechicle;
    }

    public abstract void developerCar();
}
