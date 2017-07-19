package examplesOOP.chain.factory;

/**
 * Created by asus on 19.07.17.
 */
public class BoilCrockery implements Crockery {
    @Override
    public void createCrockery() {
        System.out.println();
        System.out.println("create boil!!!");


        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println(" ");
                System.out.println("#         #");
                System.out.println(" #       #");
                System.out.println("  #     #");
                System.out.println("   ####");
                System.out.println();
            }
        });


        System.out.println();
        System.out.println("Wait a boil create ......");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        myThread.start();

    }
    }

