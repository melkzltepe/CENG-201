public class StackUsingArray {
    int[] a;
    int top;
    int SIZE;

    public StackUsingArray(final int MAX) {
        a = new int[MAX];
        top = -1;
        final int SIZE = MAX;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return;
        }
        System.out.println(a[top]);
    }

    public void printStack() {
        for (int i = top ; i >= 0 ; i--){
            System.out.println(a[i] + " ");
        }
    }

    public void push(int data) {
        if (SIZE <= (top + 1)) {
            System.out.println("The stack is full");
            return;
        }
        top++;
        a[top] = data;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("The stack is empty");
            return 0;
        }
        return a[--top];
    }
}
