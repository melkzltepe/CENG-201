public class QueueUsingArray {
    private int[] queue;
    private int front;
    private int back;
    private int size;
    private int capacity;

    public QueueUsingArray(int data) {
        this.capacity = data;
        queue = new int[data];
        this.front = 0;
        this.back = -1;
        this.size = 0;
    }

    public void enqueue(int data) {
        if (size == capacity) {
            System.out.print("The queue is full");
            return;
        }
        back = (back + 1 ) % capacity;
        queue[back] = data;
        size++;
    }

    public void dequeue(){
        if (size == 0) {
            System.out.print("The queue is empty");
            return;
        }
        front = (front + 1) % capacity;
        size--;
    }

    public int peek() {
        if (size == 0) {
            System.out.print("The queue is empty");
            return 0;
        }
        return queue[front];
    }

    public int back() {
        if (size == 0) {
            System.out.print("The queue is empty");
            return 0;
        }
        return queue[back];
    }

    public boolean isFull() {
        return (size == capacity);
    }

    public boolean isEmpty() {
        return (size == 0);
    }
}
