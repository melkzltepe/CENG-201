public class BankSimulation {

    private class CustomerNode{
        private String name, surname;
        CustomerNode next;

        public CustomerNode(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }
    }

    private CustomerNode front, back;
    private int size;

    public BankSimulation() {
        this.front = null;
        this.back = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public void addCustomer(String name, String surname) {
        CustomerNode newCustomer = new CustomerNode(name, surname);
        if (isEmpty()) {
            front = back = newCustomer;
            size++;
            return;
        }
        back.next = newCustomer;
        back = newCustomer;
        size++;
    }

    public String deleteCustomer() {
        if (isEmpty()) {
            return "There is no customer on the line";
        }
        String name = front.name;
        String surname = front.surname;
        front = front.next;
        size--;
        if (front == null) {
            back = null;
        }
        return (name + " " + surname);
    }

    public int getNumberOfCustomers() {
        return size;
    }
}
