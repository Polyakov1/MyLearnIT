import java.util.HashMap;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        HashMap<Integer, Toy> toyHashMap = new HashMap<>();
        toyHashMap.put(1, new Toy("Toy", 10, 15));

    }
}