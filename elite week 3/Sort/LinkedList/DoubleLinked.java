package LinkedList;

public class DoubleLinked {
    // Node class
    class Node {
        int data;
        Node prev, next;

        Node(int value) {
            data = value;
            prev = null;
            next = null;
        }
    }

    Node head = null;

    // Insert at end
    public void insertEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
        System.out.println(value + " inserted at end");
    }

    // Insert at beginning
    public void insertBeginning(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        System.out.println(value + " inserted at beginning");
    }

    // Delete by value
    public void delete(int value) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;

        // If head needs to be deleted
        if (current.data == value) {
            head = current.next;
            if (head != null) {
                head.prev = null;
            }
            System.out.println(value + " deleted");
            return;
        }

        // Search for node
        while (current != null && current.data != value) {
            current = current.next;
        }

        if (current == null) {
            System.out.println(value + " not found in the list");
            return;
        }

        // Unlink node
        if (current.next != null) {
            current.next.prev = current.prev;
        }
        if (current.prev != null) {
            current.prev.next = current.next;
        }
        System.out.println(value + " deleted");
    }

    // Display forward
    public void displayForward() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        System.out.print("Forward: ");
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    // Display backward
    public void displayBackward() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next; // move to last node
        }
        System.out.print("Backward: ");
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }
        System.out.println("NULL");
    }

    // Main method
    public static void main(String[] args) {
        DoubleLinked dll = new DoubleLinked();

        dll.insertEnd(10);
        dll.insertEnd(20);
        dll.insertEnd(30);
        dll.displayForward();
        dll.displayBackward();

        dll.insertBeginning(5);
        dll.displayForward();

        dll.delete(20);
        dll.displayForward();

        dll.delete(40); // not found
        dll.displayForward();
    }
}
