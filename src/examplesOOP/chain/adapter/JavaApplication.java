package examplesOOP.chain.adapter;

import java.util.ArrayList;
import java.util.List;

public class JavaApplication {

    List<Deptor> list = new ArrayList<>();

    public void saveObject(Deptor deptor){
        list.add(deptor);
        System.out.println("Saving Deptor object...");
    }

    public void updateObject(Integer id, Deptor deptor){
        list.remove(id);
        list.add(id, deptor);
        System.out.println("Updating Deptor object...");
    }

    public void loadObject(){
        System.out.println("Loading All Deptor object...");
        System.out.println();
        System.out.println(list);
    }

    public void deleteObject(Integer id){
        list.remove(id);
        System.out.println("Deleting Deptor object...");
    }


}
