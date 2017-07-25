package examplesOOP.chain.adapter;

import java.util.Scanner;

public class AdapterJavaToDatabase extends JavaApplication implements Database {

    Integer id = list.size();
    @Override
    public void insert() {
        Scanner in = new Scanner(System.in);
        id++;
        System.out.print("Enter name: ");String name = in.next();
        System.out.print("Enter dept: ");Integer dept = Integer.parseInt(in.next());

        saveObject(new Deptor(id,name,dept));
    }

    @Override
    public void update() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter id: ");Integer id= Integer.parseInt(in.next());
        System.out.print("Enter name: ");String name = in.next();
        System.out.print("Enter dept: ");Integer dept = Integer.parseInt(in.next());
        updateObject(id,new Deptor(id,name,dept));
    }

    @Override
    public void select() {
        loadObject();
    }

    @Override
    public void remove() {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter id: ");Integer id= Integer.parseInt(in.next());
        deleteObject(id);
    }
}
