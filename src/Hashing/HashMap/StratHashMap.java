package Hashing.HashMap;

import java.util.HashMap;
import java.util.Map;

public class StratHashMap {

    public static void main(String[] args) {
//        basicMap();
//        iterationMap();
        basicOperation();
    }

    public static void basicMap() {

        HashMap<String, Integer> map = new HashMap<>();

        // 1. Adding key-value pairs
        map.put("Alice", 90);
        map.put("Bob", 80);

        System.out.println("Map: " + map);

        // 2. Getting values
        System.out.println("Alice's marks: " + map.get("Alice"));
        System.out.println("Unknown's marks: " + map.get("Unknown"));

        // 3. Checking keys and values
        System.out.println("Contains Bob? " + map.containsKey("Bob"));
        System.out.println("Contains value 80? " + map.containsValue(80));

        // 4. Removing a key-value pair
        map.remove("Bob");
        System.out.println("After removing Bob: " + map);

        // 5. Size
        System.out.println("Size: " + map.size());

        // 6. Check if empty
        System.out.println("Is map empty? " + map.isEmpty());

        // 7. Clear the map
        map.clear();
        System.out.println("After clear: " + map);

        // 8. Check if empty again
        System.out.println("Is map empty? " + map.isEmpty());
    }

    public static void iterationMap() {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);
        // 1. keySet() - gives all the keys
        for (Integer key : map.keySet()) {
            System.out.println("Using keySet(): " + key + " -> " + map.get(key));
        }
        // 2. values() - gives only the values
        for (Integer marks : map.values()) {
            System.out.println("Value: " + marks);
        }
        // 3. entrySet() - gives both key and value
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Using entrySet(): " + entry.getKey() + " -> " + entry.getValue());
        }
        // 4. entrySet() - Entry's toString() prints key=value
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Entry: " + entry);
        }
    }

    public static void basicOperation(){
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = {1, 2, 1, 3, 4, 1, 2, 4, 4};

        // Pre-Store
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println("Freq Counts: " + map);

        // Fetching
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
