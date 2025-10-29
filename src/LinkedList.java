public class LinkedList {
    Node head;
    int size = 0;

    public LinkedList() {
        this.head = null;
    }

    public void printLinkedList () {
        if (isEmpty()) {
            System.out.println("The linked list is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println(" ");
    }

    public int getSize() {
        return size;
    }

    public Boolean isEmpty() {
        if (head == null) {
            return true;
        }else {
            return false;
        }
    }

    public void append(int data) {
        Node newNode = new Node(data);
        size ++;
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void prepend(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void insert(int data) {
        Node current = head.next;
        Node previous = head;
        while (current.data != data) {
            if (current.next == null){
                System.out.println("The item is not found in the list");
                return;
            }
            previous = current;
            current = current.next;
        }
        previous.next = current.next;
        size--;
    }

    public void reverse() {
        Node prevNode = null;
        Node nextNode = null;
        Node currentNode = head;
        while (currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        head = prevNode;
    }
}
