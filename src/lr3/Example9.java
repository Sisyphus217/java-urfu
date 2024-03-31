package lr3;
import java.util.HashMap;

public class Example9 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Carrot");
        map.put(4, "Dolphin");
        map.put(5, "Elephant");
        map.put(6, "Fox");
        map.put(7, "Giraffe");
        map.put(8, "Horse");
        map.put(9, "Iguana");
        map.put(10, "Jackal");

        StringBuilder result = new StringBuilder();
        for (Integer key : map.keySet()) {
            if (key > 5) {
                System.out.println("Key: " + key + ", Value: " + map.get(key));
            } else if (key == 0) {
                result.append(map.get(key)).append(", ");
            }
        }
        if (!result.isEmpty()) {
            result.delete(result.length() - 2, result.length());
            System.out.println("Key is 0, Values: " + result.toString());
        }

        int product = 1;
        for (String value : map.values()) {
            if (value.length() > 5) {
                product *= map.entrySet().stream()
                        .filter(entry -> entry.getValue().equals(value))
                        .mapToInt(HashMap.Entry::getKey)
                        .findFirst()
                        .orElse(1);
            }
        }
        System.out.println("Product of keys where length of string > 5: " + product);
    }
}
