import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class wMaps {

    public static void wHashMap() {
        // Creating a HashMap with keys as String and values as Integer
        Map<String, Integer> studentScores = new HashMap<>();

        // Adding key-value pairs to the HashMap
        studentScores.put("Alice", 95);
        studentScores.put("Bob", 87);
        studentScores.put("Charlie", 92);
        studentScores.put("David", 78);

        // Adding a duplicate key with a different value (it will replace the previous value)
        studentScores.put("Bob", 89);

        // Getting the value associated with a key
        String studentName = "Charlie";
        int score = studentScores.get(studentName);
        System.out.println(studentName + "'s score is: " + score);

        // Checking if a key exists in the HashMap
        String searchName = "Eve";
        boolean containsKey = studentScores.containsKey(searchName);
        System.out.println("Does the HashMap contain " + searchName + "? " + containsKey);

        // Removing a key-value pair from the HashMap
        String removeName = "David";
        studentScores.remove(removeName);
        System.out.println("Removed " + removeName + "'s score from the HashMap.");

        // Iterating through the HashMap and printing all key-value pairs
        System.out.println("Iterating through the HashMap:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            String name = entry.getKey();
            int studentScore = entry.getValue();
            System.out.println(name + ": " + studentScore);
        }

        // Getting the size of the HashMap
        int size = studentScores.size();
        System.out.println("Size of the HashMap: " + size);

        // Clearing the HashMap
        studentScores.clear();
        System.out.println("Cleared the HashMap. Is it empty? " + studentScores.isEmpty());
    }

    public static void wLinkedHashMap() {
        // Creating a LinkedHashMap with keys as String and values as Integer
        Map<String, Integer> population = new LinkedHashMap<>();

        // Adding key-value pairs to the LinkedHashMap
        population.put("New York", 8336817);
        population.put("Los Angeles", 39776830);
        population.put("Chicago", 2695598);
        population.put("Houston", 2320268);

        // Adding a duplicate key with a different value (it will replace the previous value)
        population.put("Chicago", 2716000);

        // Getting the value associated with a key
        String city = "Los Angeles";
        int cityPopulation = population.get(city);
        System.out.println("Population of " + city + ": " + cityPopulation);

        // Checking if a key exists in the LinkedHashMap
        String searchCity = "San Francisco";
        boolean containsKey = population.containsKey(searchCity);
        System.out.println("Does the LinkedHashMap contain " + searchCity + "? " + containsKey);

        // Removing a key-value pair from the LinkedHashMap
        String removeCity = "Houston";
        population.remove(removeCity);
        System.out.println("Removed " + removeCity + " from the LinkedHashMap.");

        // Iterating through the LinkedHashMap and printing all key-value pairs
        System.out.println("Iterating through the LinkedHashMap:");
        for (Map.Entry<String, Integer> entry : population.entrySet()) {
            String cityName = entry.getKey();
            int cityPop = entry.getValue();
            System.out.println(cityName + ": " + cityPop);
        }

        // Getting the size of the LinkedHashMap
        int size = population.size();
        System.out.println("Size of the LinkedHashMap: " + size);

        // Clearing the LinkedHashMap
        population.clear();
        System.out.println("Cleared the LinkedHashMap. Is it empty? " + population.isEmpty());

    }

    public static void wTreeMap() {
        // Creating a TreeMap with keys as String and values as Integer
        TreeMap<String, Integer> studentScores = new TreeMap<>();

        // Adding key-value pairs to the TreeMap
        studentScores.put("Alice", 95);
        studentScores.put("Bob", 87);
        studentScores.put("Charlie", 92);
        studentScores.put("David", 78);

        // Adding a duplicate key with a different value (it will replace the previous value)
        studentScores.put("Bob", 89);

        // Printing the TreeMap (elements will be in sorted order based on keys)
        System.out.println("TreeMap: " + studentScores);

        // Getting the value associated with a key
        String studentName = "Charlie";
        int score = studentScores.get(studentName);
        System.out.println(studentName + "'s score is: " + score);

        // Checking if a key exists in the TreeMap
        String searchName = "Eve";
        boolean containsKey = studentScores.containsKey(searchName);
        System.out.println("Does the TreeMap contain " + searchName + "? " + containsKey);

        // Removing a key-value pair from the TreeMap
        String removeName = "David";
        studentScores.remove(removeName);
        System.out.println("Removed " + removeName + "'s score from the TreeMap.");

        // Iterating through the TreeMap and printing all key-value pairs
        System.out.println("Iterating through the TreeMap:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            String name = entry.getKey();
            int studentScore = entry.getValue();
            System.out.println(name + ": " + studentScore);
        }

        // Getting the size of the TreeMap
        int size = studentScores.size();
        System.out.println("Size of the TreeMap: " + size);

        // Clearing the TreeMap
        studentScores.clear();
        System.out.println("Cleared the TreeMap. Is it empty? " + studentScores.isEmpty());

    }
}
