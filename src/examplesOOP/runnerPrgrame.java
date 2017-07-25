package examplesOOP;

import examplesOOP.chain.adapter.AdapterJavaToDatabase;
import examplesOOP.chain.adapter.Database;
import examplesOOP.chain.bridge.*;
import examplesOOP.chain.chain.*;
import examplesOOP.chain.factory.*;
import examplesOOP.chain.interpreter.AndExpression;
import examplesOOP.chain.interpreter.Expression;
import examplesOOP.chain.interpreter.OrExpression;
import examplesOOP.chain.interpreter.TerminalExpression;
import examplesOOP.chain.prototype.Creater;
import examplesOOP.chain.prototype.Project;
import examplesOOP.chain.prototype.ProjectFactory;
import examplesOOP.chain.prototype.Toys;


import java.util.Scanner;

/**
 * Created by asus on 16.07.17.
 */
public class runnerPrgrame {
    public static void main(String[] args) {
        boolean stoped = false;

        while (stoped = true) {
            mainMenu();
            int typeOOP = correctEnterToIntScanner(new Scanner(System.in), "Enter nomber exsamples OOP: ");
            switch (typeOOP) {
                case 1: {
                    //chain
                    Money cacheMoney = new CahceMethodPay(MethodPayMoney.CACHE);
                    Money atmMoney = new ATMMethodPay(MethodPayMoney.ATM);
                    Money clearingMoney = new ClearingMethodPay(MethodPayMoney.CLEARING);

                    int valueMoney = correctEnterToIntScanner(new Scanner(System.in), "Entel summ your money from 0 to 10000: ");
                    if (valueMoney <= 1000) {
                        cacheMoney.moneyManager("you have to pay by cache", MethodPayMoney.CACHE);
                    } else if ((valueMoney > 1000) && (valueMoney <= 9000)) {
                        cacheMoney.setNextPay(atmMoney);
                        cacheMoney.moneyManager("you have to pay by ATM", MethodPayMoney.ATM);
                    } else if (valueMoney > 9000) {
                        cacheMoney.setNextPay(clearingMoney);
                        cacheMoney.moneyManager("youhave to pay by clearing", MethodPayMoney.CLEARING);
                    }
                    stoped = false;
                    break;
                }
                case 2: {
                    //factory
                    CrockeryCreater crockeryCreater = new CupCrockeryCreater();
                    Crockery crockery = crockeryCreater.createCrockeryNew();
                    crockery.createCrockery();

                    CrockeryCreater crockeryCreater1 = new BoilCrockeryCreater();
                    Crockery crockery1 = crockeryCreater1.createCrockeryNew();
                    crockery1.createCrockery();
                    stoped = false;
                    break;
                }
                case 3: {
                    //bridge
                    System.out.println("Enter type collor:\n 1-Yellow \n 2-Red");
                    System.out.println("Enter type car:\n 1-car\n 2-lorry");
                    int color = correctEnterToIntScanner(new Scanner(System.in), "Enter color");
                    int typeCar = correctEnterToIntScanner(new Scanner(System.in), "Enter type car");

                    if ((typeCar == 1) & (color == 1)) {
                        CreateVechicle createVechicle = new YellowVechicle(new CarVechcle());
                        createVechicle.developerCar();
                    }
                    if ((typeCar == 2) & (color == 1)) {
                        CreateVechicle createVechicle = new RedVichicle(new CarVechcle());
                        createVechicle.developerCar();
                    }
                    if ((typeCar == 1) & (color == 2)) {
                        CreateVechicle createVechicle = new YellowVechicle(new LorryVechicle());
                        createVechicle.developerCar();
                    }
                    if ((typeCar == 2) & (color == 2)) {
                        CreateVechicle createVechicle = new RedVichicle(new LorryVechicle());
                        createVechicle.developerCar();
                    }
                    stoped = false;
                    break;
                }
                case 4:{
                    Expression isJava = getJavaExpression();
                    Expression isJavaEEDeveloper = getJavaEEExpression();

                    System.out.println("Does developer knows Java Core: " + isJava.interpret("Java"));
                    System.out.println("Does developer knows Java EE: " + isJavaEEDeveloper.interpret("Java Spring"));
                }

                case 5:{
                    Database database = new AdapterJavaToDatabase();

                    database.insert();
                    database.insert();
                    database.insert();
                    database.update();
                    database.select();
                    database.remove();
                }

                case 6:{
                    Creater.Starter();

                    Toys toyGirl = Creater.getToys(3);
                    System.out.println(toyGirl.getType() + " : " + toyGirl.getCost());
                    toyGirl.CreateToys();

                    Toys toyCar = Creater.getToys(2);
                    System.out.println(toyCar.getType() + " : " + toyCar.getCost());
                    toyCar.CreateToys();

                    Toys toyBall = Creater.getToys(3);
                    System.out.println(toyBall.getType() + " : " + toyBall.getCost());
                    toyBall.CreateToys();

                }
                case 7: {
                    stoped = true;
                    break;
                }
            }
        }
        }


    public static Expression getJavaExpression() {
        Expression java = new TerminalExpression("Java");
        Expression javaCore = new TerminalExpression("Java Core");

        return new OrExpression(java, javaCore);
    }

    public static Expression getJavaEEExpression() {
        Expression java = new TerminalExpression("Java");
        Expression spring = new TerminalExpression("Spring");

        return new AndExpression(java, spring);
    }
    private static void mainMenu(){
        System.out.println("OOP Exsamples:");
        System.out.println("    1. Chain.");
        System.out.println("    2. Bridge");
        System.out.println("    3. Factory");
        System.out.println("    4. Inprerter");
        System.out.println("    5. Adapter");
        System.out.println("    6. Prototype");
        System.out.println("    7. Exit");
    }
    static int correctEnterToIntScanner(Scanner keyboard, String messageInput)
    {
        System.out.print(messageInput + " : ");
        while (!keyboard.hasNextInt())
        {
            System.err.println("You mast enter only integer value!!!");
            keyboard.next();
        }
        return keyboard.nextInt();
    }
}
