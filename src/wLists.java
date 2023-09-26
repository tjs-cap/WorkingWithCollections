import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class wLists {
    public static void wArrayLists(){
        // Creating an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Accessing elements by index
        int firstNumber = numbers.get(0);
        int secondNumber = numbers.get(1);

        // Printing the elements
        System.out.println("ArrayList: " + numbers);
        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);

        // Modifying an element
        numbers.set(2, 35); // Changing the value at index 2 to 35

        // Removing an element by value
        numbers.remove(Integer.valueOf(40)); // Removes the first occurrence of 40

        // Printing the modified ArrayList
        System.out.println("Modified ArrayList: " + numbers);

        // Checking if an element exists in the ArrayList
        boolean contains30 = numbers.contains(30);
        System.out.println("Contains 30? " + contains30);

        // Checking the size of the ArrayList
        int size = numbers.size();
        System.out.println("ArrayList size: " + size);
    }

    public static void wLinkedList(){
        // Creating a LinkedList of doubles
        LinkedList<Double> doubleList = new LinkedList<>();

        // Adding elements to the LinkedList
        doubleList.add(3.14);
        doubleList.add(2.718);
        doubleList.add(1.618);
        doubleList.add(0.577);

        // Accessing elements by index
        double firstValue = doubleList.get(0);
        double secondValue = doubleList.get(1);

        // Printing the elements
        System.out.println("LinkedList: " + doubleList);
        System.out.println("First value: " + firstValue);
        System.out.println("Second value: " + secondValue);

        // Modifying an element
        doubleList.set(2, 2.0); // Changing the value at index 2 to 2.0

        // Removing an element by value
        doubleList.remove(3.14); // Removes the first occurrence of 3.14

        // Printing the modified LinkedList
        System.out.println("Modified LinkedList: " + doubleList);

        // Checking if an element exists in the LinkedList
        boolean containsEuler = doubleList.contains(2.718);
        System.out.println("Contains 2.718? " + containsEuler);

        // Checking the size of the LinkedList
        int size = doubleList.size();
        System.out.println("LinkedList size: " + size);
    }

    public static void wVector(){
        // Creating a Vector of strings
        Vector<String> stringVector = new Vector<>();

        // Adding elements to the Vector
        stringVector.add("Java");
        stringVector.add("Python");
        stringVector.add("C++");
        stringVector.add("JavaScript");

        // Accessing elements by index
        String firstLanguage = stringVector.get(0);
        String secondLanguage = stringVector.get(1);

        // Printing the elements
        System.out.println("Vector: " + stringVector);
        System.out.println("First language: " + firstLanguage);
        System.out.println("Second language: " + secondLanguage);

        // Modifying an element
        stringVector.set(2, "C#"); // Changing the value at index 2 to "C#"

        // Removing an element by value
        stringVector.remove("Python"); // Removes the first occurrence of "Python"

        // Printing the modified Vector
        System.out.println("Modified Vector: " + stringVector);

        // Checking if an element exists in the Vector
        boolean containsCPlusPlus = stringVector.contains("C++");
        System.out.println("Contains 'C++'? " + containsCPlusPlus);

        // Checking the size of the Vector
        int size = stringVector.size();
        System.out.println("Vector size: " + size);
    }

    public static void wStack() {
        // Creating a Stack of integers
        Stack<Integer> integerStack = new Stack<>();

        // Pushing elements onto the stack
        integerStack.push(10);
        integerStack.push(20);
        integerStack.push(30);
        integerStack.push(40);

        // Peeking at the top element
        int topElement = integerStack.peek();

        // Popping elements from the stack
        int poppedElement1 = integerStack.pop();
        int poppedElement2 = integerStack.pop();

        // Printing the elements
        System.out.println("Stack: " + integerStack);
        System.out.println("Top element: " + topElement);
        System.out.println("Popped element 1: " + poppedElement1);
        System.out.println("Popped element 2: " + poppedElement2);

        // Checking if the stack is empty
        boolean isEmpty = integerStack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);

        // Checking the size of the stack
        int size = integerStack.size();
        System.out.println("Stack size: " + size);
    }
}
