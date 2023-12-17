package task4;

public class Main {
    public static void main(String[] args) {
        GBLinkedList<Integer> linkedList = new GBLinkedList<>();
        linkedList.insertAtBeginning(1);
        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(3);

        System.out.println("Size of the linked list: " + linkedList.getSize());
        System.out.println("Element at index 1: " + linkedList.getElementAtIndex(1));

        System.out.print("Linked list elements: ");
        linkedList.displayList();
    }
}
