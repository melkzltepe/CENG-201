public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList();
        myLinkedList.insert(2);
        myLinkedList.insert(7);
        myLinkedList.insert(9);
        myLinkedList.prepend(21);
        myLinkedList.printLinkedList();
        System.out.println(myLinkedList.getSize());
        System.out.println(" ");
        myLinkedList.printLinkedList();
        System.out.println(myLinkedList.getSize());
        myLinkedList.reverse();
        myLinkedList.printLinkedList();
        myLinkedList.makeCircular();
        System.out.println(myLinkedList.isCircular());
        myLinkedList.printCircularLinkedList();
        System.out.println(" ");
        myLinkedList.insertCircularLinkedList(6);
        myLinkedList.printCircularLinkedList();
        System.out.println(" ");
        System.out.println(myLinkedList.countCircularLinkedList());
        myLinkedList.printMiddle();

        /*DoublyLinkedList myLinkedList = new DoublyLinkedList();
        myLinkedList.appendDoublyLinkedList(8);
        myLinkedList.appendDoublyLinkedList(700);
        myLinkedList.appendDoublyLinkedList(9);
        myLinkedList.appendDoublyLinkedList(5);
        myLinkedList.appendDoublyLinkedList(2);
        myLinkedList.appendDoublyLinkedList(3);
        myLinkedList.appendDoublyLinkedList(4);
        myLinkedList.printLinkedList();
        System.out.println(myLinkedList.getSizeOfDoublyLinkedList());
        myLinkedList.deleteNode(4);
        myLinkedList.printLinkedList();
        System.out.println(myLinkedList.getSizeOfDoublyLinkedList());
        myLinkedList.printLinkedList();

        System.out.println(37149212 % 111);*/

    }
}