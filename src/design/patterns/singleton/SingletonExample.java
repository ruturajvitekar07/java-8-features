package design.patterns.singleton;


class Singleton {

    private static Singleton INSTANCE;

    private Singleton(){
        System.out.println("Singleton class constructor");
    }

    public static Singleton getInstance(){
        if (INSTANCE == null){
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
public class SingletonExample {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();

        Singleton singleton1 = Singleton.getInstance();


        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
    }
}
