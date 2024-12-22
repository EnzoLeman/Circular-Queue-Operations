import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circular queue = new Circular();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. enqueue()\n2. dequeue()\n3. isEmpty()\n4. isFull()\n5. count()\n6. display()\n7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (queue.isFull()) {
                        System.out.println("The queue is full");
                    } else {
                        System.out.print("Enter value to enqueue: ");
                        int value = scanner.nextInt();
                        queue.enqueue(value);
                    }
                    break;
                case 2:
                    if (queue.isEmpty()) {
                        System.out.println("The queue is empty");
                    } else {
                        System.out.println("The dequeued value is: " + queue.dequeue());
                    }
                    break;
                case 3:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is Empty");
                    } else {
                        System.out.println("Queue is not Empty");
                    }
                    break;
                case 4:
                    if (queue.isFull()) {
                        System.out.println("Queue is Full");
                    } else {
                        System.out.println("Queue is not Full");
                    }
                    break;                
                case 5:
                    System.out.printf("The amount of items are: %d", queue.count());
                    break;
                case 6:
                    queue.display();  
                    break;  
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!! Please try again.");
            }

        } while (choice !=7);

        scanner.close();
    }
}