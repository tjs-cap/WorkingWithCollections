import java.util.*;

public class wSets {
    public static void wHashSet() {
        // Creating a HashSet
        Set<String> fruits = new HashSet<>();

        // Adding elements to the Set
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // Duplicate element, will not be added

        // Printing the Set
        System.out.println("Fruits Set: " + fruits);

        // Checking if an element exists in the Set
        String searchFruit = "Mango";
        if (fruits.contains(searchFruit)) {
            System.out.println(searchFruit + " is in the Set.");
        } else {
            System.out.println(searchFruit + " is not in the Set.");
        }

        // Removing an element from the Set
        String removeFruit = "Banana";
        fruits.remove(removeFruit);
        System.out.println("Removed " + removeFruit + " from the Set.");

        // Iterating through the Set
        System.out.println("Iterating through the Set:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Getting the size of the Set
        int setSize = fruits.size();
        System.out.println("Size of the Set: " + setSize);

        // Clearing the Set
        fruits.clear();
        System.out.println("Cleared the Set. Is it empty? " + fruits.isEmpty());
    }

    public static void wLinkedHashSet() {
        // Creating a LinkedHashSet
        Set<String> cities = new LinkedHashSet<>();

        // Adding elements to the LinkedHashSet
        cities.add("New York");
        cities.add("San Francisco");
        cities.add("Los Angeles");
        cities.add("Chicago");

        // Adding a duplicate element, which will not be added
        cities.add("Los Angeles");

        // Printing the LinkedHashSet
        System.out.println("Cities LinkedHashSet: " + cities);

        // Checking if an element exists in the LinkedHashSet
        String searchCity = "Boston";
        if (cities.contains(searchCity)) {
            System.out.println(searchCity + " is in the LinkedHashSet.");
        } else {
            System.out.println(searchCity + " is not in the LinkedHashSet.");
        }

        // Removing an element from the LinkedHashSet
        String removeCity = "San Francisco";
        cities.remove(removeCity);
        System.out.println("Removed " + removeCity + " from the LinkedHashSet.");

        // Iterating through the LinkedHashSet
        System.out.println("Iterating through the LinkedHashSet:");
        for (String city : cities) {
            System.out.println(city);
        }

        // Getting the size of the LinkedHashSet
        int setSize = cities.size();
        System.out.println("Size of the LinkedHashSet: " + setSize);

        // Clearing the LinkedHashSet
        cities.clear();
        System.out.println("Cleared the LinkedHashSet. Is it empty? " + cities.isEmpty());

    }

    public static void wEnumSet(){
        // Creating an EnumSet containing all days of the week
        EnumSet<Day> allDays = EnumSet.allOf(Day.class);
        System.out.println("All days: " + allDays);

        // Creating an empty EnumSet
        EnumSet<Day> emptySet = EnumSet.noneOf(Day.class);
        System.out.println("Empty set: " + emptySet);

        // Creating an EnumSet with specific elements
        EnumSet<Day> workDays = EnumSet.of(Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY, Day.THURSDAY, Day.FRIDAY);
        System.out.println("Work days: " + workDays);

        // Creating an EnumSet by complementing another set
        EnumSet<Day> weekend = EnumSet.complementOf(workDays);
        System.out.println("Weekend: " + weekend);

        // Adding elements to an EnumSet
        emptySet.add(Day.SATURDAY);
        emptySet.add(Day.SUNDAY);
        System.out.println("Updated empty set: " + emptySet);

        // Checking if an EnumSet contains a specific element
        System.out.println("Does allDays contain MONDAY? " + allDays.contains(Day.MONDAY));

        // Removing elements from an EnumSet
        workDays.remove(Day.TUESDAY);
        System.out.println("Updated work days after removing TUESDAY: " + workDays);

        // Iterating through an EnumSet
        System.out.println("Iterating through allDays:");
        for (Day day : allDays) {
            System.out.println(day);
        }

        // Clearing an EnumSet
        emptySet.clear();
        System.out.println("Cleared empty set. Is it empty? " + emptySet.isEmpty());
    }

    public static void wTreeSet(){
        // Creating a TreeSet of integers
        Set<Integer> treeSet = new TreeSet<>();

        // Adding elements to the TreeSet
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(1);

        // Adding a duplicate element, which will not be added
        treeSet.add(8);

        // Printing the TreeSet (elements will be in sorted order)
        System.out.println("TreeSet: " + treeSet);

        // Checking if an element exists in the TreeSet
        int searchValue = 2;
        if (treeSet.contains(searchValue)) {
            System.out.println(searchValue + " is in the TreeSet.");
        } else {
            System.out.println(searchValue + " is not in the TreeSet.");
        }

        // Removing an element from the TreeSet
        int removeValue = 5;
        treeSet.remove(removeValue);
        System.out.println("Removed " + removeValue + " from the TreeSet.");

        // Iterating through the TreeSet
        System.out.println("Iterating through the TreeSet:");
        for (int num : treeSet) {
            System.out.println(num);
        }

        // Getting the size of the TreeSet
        int setSize = treeSet.size();
        System.out.println("Size of the TreeSet: " + setSize);

        // Clearing the TreeSet
        treeSet.clear();
        System.out.println("Cleared the TreeSet. Is it empty? " + treeSet.isEmpty());

    }
}
