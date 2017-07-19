package examplesOOP.chain.factory;

public class CupCrockeryCreater implements CrockeryCreater{

    @Override
    public Crockery createCrockeryNew() {
        return new CupCrockery();
    }
}
