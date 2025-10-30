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
        return (head == null);
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

    public void deleteByKey(int data) {
        Node previous = head;
        Node current = head.next;
        if (previous.data == data) {
            head = current;
            return;
        }
        while (current != null) {
            if (current.data == data) {
                previous.next = current.next;
                return;
            }
            previous = previous.next;
            current = current.next;
        }
        if (current == null) {
            System.out.println("The key is not found");
        }
    }

    public void reverse() {
        Node prevNode = null;
        Node nextNode;
        Node currentNode = head;
        while (currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        head = prevNode;
    }

    public boolean search(int data) {
        Node current = head;
        while (current.next != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void makeCircular() {
        if (head == null){
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = head;
    }

    public boolean isCircular() {
        if (head == null) {
            return false;
        }
        Node current = head.next;
        while (current != null && current != head) {
            current = current.next;
        }
        return (current == head);
    }

    public void printCircularLinkedList() {
        if (head == null) {
            return;
        }
        Node current = head;
        while (current != null && current.next != head) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.print(current.data);
    }

    public void insertCircularLinkedList(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }
        newNode.next = head;
        Node last = head;
        while (last.next != head) {
            last = last.next;
        }
        last.next = newNode;
        head = newNode;
        size++;
    }

    public int countCircularLinkedList() {
        if (head == null) {
            return 0;
        }
        Node current = head.next;
        int count = 1;
        while (current != head) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void printMiddle() {
        double size = getSize();
        size = Math.ceil(size/2);
        Node middle = head;
        for (int i = 1; i < size ; i++) {
            middle = middle.next;
        }
        System.out.println(middle.data);
    }






































}
