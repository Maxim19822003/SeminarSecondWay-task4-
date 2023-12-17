package task4;

public class GBLinkedList<T> {
    private Node<T> head;
    private int size;

    public GBLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void insertAtBeginning(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void insertAtEnd(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public int getSize() {
        return size;
    }

    public T getElementAtIndex(int index) {
        if (index < 0 || index >= size || head == null) {
            return null; // or throw an exception
        }

        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.data;
    }

    public void displayList() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}