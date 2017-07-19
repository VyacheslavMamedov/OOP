package examplesOOP.chain.factory;

/**
 * Created by asus on 19.07.17.
 */
public class CupCrockery implements Crockery{

    @Override
    public void createCrockery() {
        System.out.println();
        System.out.println("create   cup for tea or coffe!");


        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println(" #####");
                System.out.println("#     ##");
                System.out.println("#     # #");
                System.out.println("#     ##");
                System.out.println(" ####");
                System.out.println();
              //  System.out.println("A cup of Create");
            }
        });


        System.out.println();
        System.out.println("Wait a cup create ......");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        myThread.start();

    }


}
