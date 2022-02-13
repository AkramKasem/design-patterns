package Creational.Singleton;

public class SingletonMain extends Thread{

    @Override
    public void run() {
        Singleton s = Singleton.getInstance();
        System.out.println(s);
    }

    public static void main(String[] args) {

//        Singleton s1 = Singleton.getInstance();
//        Singleton s2 = Singleton.getInstance();
//
//        System.out.println( s1.equals(s2) );

        for (int i = 0; i < 40; i++) {
            SingletonMain s = new SingletonMain();
            s.start();
        }



    }
}
