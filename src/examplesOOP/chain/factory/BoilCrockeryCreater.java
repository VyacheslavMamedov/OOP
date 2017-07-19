package examplesOOP.chain.factory;

/**
 * Created by asus on 19.07.17.
 */
public class BoilCrockeryCreater implements CrockeryCreater {
    @Override
    public Crockery createCrockeryNew() {
        return new BoilCrockery();
    }
}
