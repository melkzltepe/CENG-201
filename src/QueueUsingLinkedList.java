public class QueueUsingLinkedList {
    Node front,back;
    private int size;

    public QueueUsingLinkedList() {
        this.back = null;
        this.front = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = newNode;
            back = newNode;
            return;
        }
        back.next = newNode;
        back = newNode;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.print("The queue is empty");
            return;
        }
        front = front.next;
        if (front == null) {
            back = null;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.print("The queue is empty");
            return 0;
        }
        return front.data;
    }

    public int back() {
        if (isEmpty()) {
            System.out.print("The queue is empty");
            return 0;
        }
        return back.data;
    }
}
