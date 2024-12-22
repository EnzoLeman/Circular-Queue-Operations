
class Circular {
    private int rear;
    private int front;
    private int[] array;
    private int itemCount;

    public Circular() {
        itemCount = 0;
        rear = -1;
        front = -1;
        array = new int[4]; // Fixed size queue with 4 elements
    }

    public boolean isEmpty() {
        return (front == -1 && rear == -1);
    }

    public boolean isFull() {
        return ((rear + 1)%4 == front); // Array size fixed at 4
    }

    public int count() {
        if (isEmpty()) 
        {
            return 0;
        }
        else
        {
            return (itemCount);
        }
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("The queue is full");
        } else if (isEmpty()) {
            rear = 0;
            front = 0;
            array[rear] = value;
        } else {
            rear = (rear + 1)%4; // Modulas(reminder) for make Queue to step new Position
            array[rear] = value;
        }
        itemCount++;
    }

    public int dequeue() {
        int x = 0;
        if (isEmpty()) {
            System.out.println("The queue is empty");
        } else if (front == rear) {
            x = array[rear];
            front = -1;
            rear = -1;
            itemCount--;
        } else {
            System.out.printf("Front(index) value: %d%n", front);
            x = array[front];
            array[front] = 0;
            front = (front +1 )%4;

            itemCount++;
        }
        return x;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
        } else {
            System.out.println("**** Items are ****");
            for (int i = front; i <= rear; i++) {
                System.out.println(array[i]);
            }
            System.out.println("******************");
        }
    }
}
