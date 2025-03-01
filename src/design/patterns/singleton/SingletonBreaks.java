package design.patterns.singleton;

import java.io.*;
import java.lang.reflect.Constructor;

class SingletonClass  implements Serializable {
    private static final long serialVersionUID = 1L; // Required for serialization
    // Volatile ensures visibility across threads and prevents instruction reordering
    private static volatile SingletonClass INSTANCE = new SingletonClass();

    private SingletonClass() {
        // Modify the constructor to throw an exception if an instance already exists.
        if (INSTANCE != null) {
            throw new RuntimeException("Instance already created! Use getInstance() method.");
        }
    }

    public static SingletonClass getInstance() {
        if (INSTANCE == null){ // First check (without locking)
            synchronized (SingletonClass.class) {  // Locking to ensure only one thread enters
                if (INSTANCE == null){ // Second check (inside synchronized block)
                    INSTANCE = new SingletonClass();
                }
            }
        }
        return INSTANCE;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
       // return super.clone(); // Creates a new object
        // Override the clone() method to prevent cloning.
        throw new CloneNotSupportedException("Cloning is not allowed");
    }

    protected Object readResolve() {
        return INSTANCE;
    }

    public void showMessage() {
        System.out.println("Thread-Safe Singleton Instance: " + this.hashCode());
    }
}
public class SingletonBreaks {

    public static void main(String[] args) {
        try {
            // 1. Reflection allows us to access private constructors and create multiple instances of a singleton class.
//            SingletonClass instance1 = SingletonClass.getInstance();
//            Constructor<SingletonClass> constructor = SingletonClass.class.getDeclaredConstructor();
//            constructor.setAccessible(true); // Bypass private access
//            SingletonClass instance2 = constructor.newInstance();
//
//            System.out.println("Instance 1: " + instance1.hashCode());
//            System.out.println("Instance 2: " + instance2.hashCode());

            // 2. Cloning can create a copy of the singleton instance.
//            SingletonClass instance3 = SingletonClass.getInstance();
//            SingletonClass instance4 = (SingletonClass) instance3.clone();
//
//            System.out.println("Instance 3: " + instance3.hashCode());
//            System.out.println("Instance 4: " + instance4.hashCode());

            // 3. Serialization and deserialization can create new instances.
//            SingletonClass instance1 = SingletonClass.getInstance();
//
//            // Serialize
//            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
//            out.writeObject(instance1);
//            out.close();
//
//            // Deserialize
//            ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton.ser"));
//            SingletonClass instance2 = (SingletonClass) in.readObject();
//            in.close();
//
//            System.out.println("Instance 1: " + instance1.hashCode());
//            System.out.println("Instance 2: " + instance2.hashCode());

            // 4. Thread Safety Issues (In Multi-threaded Environments)
//            Runnable task = () -> {
//                SingletonClass instance = SingletonClass.getInstance();
//                instance.showMessage();
//            };
//
//            // Creating and starting multiple threads
//            Thread thread1 = new Thread(task);
//            Thread thread2 = new Thread(task);
//            Thread thread3 = new Thread(task);
//
//            thread1.start();
//            thread2.start();
//            thread3.start();

            SingletonClass s1 = SingletonClass.getInstance();
            SingletonClass s2 = SingletonClass.getInstance();

            System.out.println("Instance 1: " + s1.hashCode());
            System.out.println("Instance 2: " + s2.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
