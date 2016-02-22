/**
 * Created by MacLap on 2/22/16.
 */
public class AnonymousFunctionExample {
    public static void main(String[] args) {
        //Runcode from seperate method
        sayHello();

        //run code from anonymous class
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class.");
            }
        };
        r1.run();

        //run code from an anonymous function
        Runnable r2 = () -> {
            System.out.println("Hello from anonymous function.");
        };
        r2.run();
    }

    static void sayHello(){
        System.out.println("Hello.");
    }
}
