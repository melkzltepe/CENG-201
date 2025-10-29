public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList();
        myLinkedList.append(2);
        myLinkedList.append(7);
        myLinkedList.append(9);
        myLinkedList.prepend(21);

        myLinkedList.printLinkedList();
        System.out.println(myLinkedList.getSize());
        myLinkedList.insert(7);
        System.out.println(" ");
        myLinkedList.printLinkedList();
        System.out.println(myLinkedList.getSize());
    }
}