import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.concurrent.ArrayBlockingQueue;

public class wQueues {
    public static void wQueue(){
        // Create a queue using a linked list
        LinkedList<Integer> queue = new LinkedList<>();

        // Enqueue elements
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        System.out.println("Queue elements: " + queue);

        // Dequeue elements
        int dequeuedItem1 = queue.poll();
        int dequeuedItem2 = queue.poll();

        System.out.println("Dequeued items: " + dequeuedItem1 + ", " + dequeuedItem2);
        System.out.println("Updated queue: " + queue);

        // Peek at the front element
        int frontElement = queue.peek();
        System.out.println("Front element: " + frontElement);

        // Check if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);
    }

    public static void wPriorityCode() {
        // Create a PriorityQueue of integers
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Adding elements with priorities
        priorityQueue.offer(30); // Add 30 with priority 30
        priorityQueue.offer(10); // Add 10 with priority 10
        priorityQueue.offer(20); // Add 20 with priority 20

        // Peek at the element with the highest priority
        int highestPriorityElement = priorityQueue.peek();
        System.out.println("Highest Priority Element: " + highestPriorityElement);

        // Remove elements in priority order
        int element1 = priorityQueue.poll(); // Remove and return the highest priority element
        int element2 = priorityQueue.poll(); // Remove and return the next highest priority element

        // Printing the remaining elements in the PriorityQueue
        System.out.println("Remaining Elements in PriorityQueue: " + priorityQueue);

        // Add another element
        priorityQueue.offer(5); // Add 5 with priority 5

        // Printing the PriorityQueue after adding an element
        System.out.println("Updated PriorityQueue: " + priorityQueue);
    }

    public static void wDeque(){
        // Create a Deque using ArrayDeque
        Deque<String> deque = new ArrayDeque<>();
        // Deque<String> deque1 = new LinkedList<>();

        // Adding elements to the front and rear of the Deque
        deque.addFirst("First");
        deque.addLast("Last");
        deque.offerFirst("Front");
        deque.offerLast("Rear");

        // Printing the Deque
        System.out.println("Deque: " + deque);

        // Removing elements from the front and rear
        String frontElement = deque.pollFirst();
        String rearElement = deque.pollLast();

        // Printing the removed elements
        System.out.println("Removed Front Element: " + frontElement);
        System.out.println("Removed Rear Element: " + rearElement);

        // Printing the updated Deque
        System.out.println("Updated Deque: " + deque);

        // Peeking at the front and rear elements without removing them
        String frontPeek = deque.peekFirst();
        String rearPeek = deque.peekLast();

        // Printing the peeked elements
        System.out.println("Front Peek: " + frontPeek);
        System.out.println("Rear Peek: " + rearPeek);
    }

    public static void wArrayDeque(){
        // Create an ArrayDeque to represent the queue
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        // Enqueue elements
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        System.out.println("Queue elements: " + queue);

        // Dequeue elements
        int dequeuedItem1 = queue.poll();
        int dequeuedItem2 = queue.poll();

        System.out.println("Dequeued items: " + dequeuedItem1 + ", " + dequeuedItem2);
        System.out.println("Updated queue: " + queue);

        // Peek at the front element
        int frontElement = queue.peek();
        System.out.println("Front element: " + frontElement);

        // Check if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);
    }

    public static void wArrayBlockingQueue(){
        // Create an ArrayBlockingQueue with a maximum capacity of 3
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);

        try {
            // Enqueue elements
            queue.put(1);
            queue.put(2);
            queue.put(3);

            System.out.println("Queue elements: " + queue);

            // Attempt to enqueue more elements (blocking until space is available)
            queue.put(4);
            queue.put(5);

            System.out.println("Updated queue: " + queue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            // Dequeue elements
            int dequeuedItem1 = queue.take();
            int dequeuedItem2 = queue.take();

            System.out.println("Dequeued items: " + dequeuedItem1 + ", " + dequeuedItem2);
            System.out.println("Updated queue: " + queue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Peek at the front element
        int frontElement = queue.peek();
        System.out.println("Front element: " + frontElement);

        // Check if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);
    }
}
