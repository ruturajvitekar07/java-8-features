import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Example implements Cloneable, Serializable {

    Example(){
        System.out.println("Constructor invoked: Object created");
    }

    // Factory method for creating an object
    public static Example createInstance() {
        System.out.println("Factory method invoked: Object created");
        return new Example();
    }

    // Overriding the clone method to support cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("clone() method invoked: Cloned object created");
        return super.clone();
    }

}

// Enum example (implicitly creates a singleton object)
enum ExampleEnum {
    INSTANCE;

    ExampleEnum() {
        System.out.println("Enum constant invoked: Singleton object created");
    }
}

public class ObjectCreationWays {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, CloneNotSupportedException, IOException {

        // 1. Using the `new` keyword
        System.out.println("\n1. Using the `new` keyword : ");
        Example e1 = new Example();

        // 2. Using `Class.forName()`
        System.out.println("\n2. Using `Class.forName()` : ");
        Example e2 = (Example) Class.forName("Example").getDeclaredConstructor().newInstance();

        // 3. Using `clone()` method
        System.out.println("\n3. Using `clone()` method : ");
        Example e3 = (Example) e1.clone();

        // 4. Using Deserialization
        System.out.println("\n4. Using Deserialization : ");
        // Serialize the object
        FileOutputStream fileOut = new FileOutputStream("example.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(e1);
        out.close();
        fileOut.close();

        // Deserialize the object
        FileInputStream fileIn = new FileInputStream("example.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        Example e4 = (Example) in.readObject();
        in.close();
        fileIn.close();
        System.out.println("Deserialization invoked: Object created");

        // 5. Using Reflection with Constructor
        System.out.println("\n5. Using Reflection with Constructor : ");
        Constructor<Example> constructor = Example.class.getDeclaredConstructor();
        Example e5 = constructor.newInstance();

        // 6. Using Factory Method
        System.out.println("\n6. Using Factory Method : ");
        Example e6 = Example.createInstance();

        // 7. Using Enum
        System.out.println("\n7. Using Enum : ");
        ExampleEnum obj7 = ExampleEnum.INSTANCE;
    }

}
