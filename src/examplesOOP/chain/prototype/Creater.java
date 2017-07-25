package examplesOOP.chain.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by asus on 25.07.17.
 */
public class Creater {

    public static Map<Integer,Toys> map = new HashMap<>();

    public static Toys getToys(Integer id) {
        Toys toy = map.get(id);
        try {
            return (Toys) toy.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void Starter(){
        ToysBall toysBall = new ToysBall();
        map.put(1, toysBall);

        ToysCar toysCar = new ToysCar();
        map.put(2,toysCar);

        ToysGirl toysGirl = new ToysGirl();
        map.put(3, toysGirl);
    }
}
