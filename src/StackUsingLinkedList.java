public class StackUsingLinkedList {

    private class StackNode {
        int data;
        StackNode link;
    }

    StackNode top;

    public StackUsingLinkedList() {
        this.top = null;
    }

    public void push(int data) {
        StackNode newNode = new StackNode();
        if (newNode == null) {
            System.out.println("Heap overflow");
            return;
        }
        newNode.data = data;
        newNode.link = top;
        top = newNode;
    }

    public boolean isEmpty() {
        return (top == null);
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return 0;
        }
        return top.data;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return;
        }
        top = top.link;
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return;
        }
        StackNode current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.link;
        }
    }
}
