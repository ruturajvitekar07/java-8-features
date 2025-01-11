import java.util.Map;  
public class FactoryMethodsExample {

    public static void main(String[] args) {

        Map.Entry<Integer, String> e1 = Map.entry(101, "Java");
        Map.Entry<Integer, String> e2 = Map.entry(102, "Spring");

        Map<Integer, String> map = Map.ofEntries(e1,e2);
        for(Map.Entry<Integer, String> m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());  
        }  
    }  
} 