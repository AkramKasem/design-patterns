package Creational.Singleton;

public class Singleton {

    private static volatile Singleton singleton;
    private static String url;
    public static int x = 12;

    public Singleton() {
    }

    public synchronized static Singleton getInstance(){
        if (singleton == null) {
            // مينفعش اى object من Singleton ينفذ البوك ده فى نفس الوقت
            synchronized (Singleton.class) {
                if (singleton == null) {
                        singleton = new Singleton();
                }else {
                    return singleton;
                }
            }
        }
        return singleton;
    }

    public static void setUrl(String url) {
        Singleton.url = url;
    }
}
