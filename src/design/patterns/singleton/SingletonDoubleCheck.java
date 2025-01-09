package design.patterns.singleton;


// Thread-safe Singelton using Double Checked Locking
class BetterSingleton {

    private static volatile BetterSingleton INSTANCE;

    private BetterSingleton(){
        System.out.println("BetterSingleton Constructor");
    }

    public static BetterSingleton getInstance(){
        if (INSTANCE == null){
            synchronized (BetterSingleton.class){
                if (INSTANCE == null) {
                    INSTANCE = new BetterSingleton();
                }
            }
        }
        return INSTANCE;
    }

}

enum EnumSingleton {
    INSTANCE;

    private String config;

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public void something(){
        System.out.println("Enum singeleton is doing something");
    }
}

public class SingletonDoubleCheck {

    public static void main(String[] args) {

        EnumSingleton singleton = EnumSingleton.INSTANCE;
        singleton.setConfig("Configuration");
        System.out.println(singleton.getConfig());
        singleton.something();


        EnumSingleton singleton1 = EnumSingleton.INSTANCE;
        System.out.println(singleton1 == singleton);
    }
}
