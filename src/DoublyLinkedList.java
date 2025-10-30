public class DoublyLinkedList {
    DoublyNode head;
    int size = 0;

    public DoublyLinkedList() {
        this.head = null;
    }

    public void appendDoublyLinkedList(int data) {
        DoublyNode newNode = new DoublyNode(data);
        if (head == null) {
            newNode.prev = head;
            head = newNode;
            size++;
            return;
        }
        DoublyNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
        size++;
    }

    public int getSizeOfDoublyLinkedList() {
        return size;
    }

    public void deleteNode(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            if (head.next != null) {
                head.next.prev = head;
            }
            size--;
        }
        DoublyNode previous = head;
        DoublyNode current = head.next;
        while (current != null) {
            if (current.data == data) {
                previous.next = current.next;
                if (current.next != null) {
                    current.next.prev = previous;
                }
                size--;
                return;
            }
            current = current.next;
            previous = previous.next;
        }
    }

    public void printLinkedList () {
        if (head == null) {
            System.out.println("The linked list is empty");
            return;
        }
        DoublyNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println(" ");
    }

    public DoublyLinkedList concat(DoublyLinkedList doublyLinkedList) {
        if (this.head == null) {
            return doublyLinkedList;
        } else if (doublyLinkedList.head == null) {
            return this;
        }
        DoublyNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = doublyLinkedList.head;
        doublyLinkedList.head.prev = current;
        return this;
    }
}
