public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void printLinkedList () {
        if (isEmpty()) {
            System.out.println("The linked list is empty");
        }else {
            Node current = head;
            System.out.println(current.data + " ");
            current = current.next;
        }
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
    }

    public void insert(int data) {
        Node current = head;
        Node previous = null;

        while (current.data != data) {
            previous.next = current;
            current.next = current.next.next;

            if (current.next == null){
                System.out.println("The item is not found in the list");
            }
        }

        if (current.data == data) {
            previous.next = current.next;
        }
    }


}
