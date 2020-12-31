public class DoublyLinkedList<T> {
    Node head;   // Head of the doubly linked list

    class Node {
        T data;
        Node next;
        Node prev;

        // Node constructors
        Node () {
            data = null;
            next = prev = null;
        }

        Node (T d) {
            data = d;
            next = prev = null;
        }
    }

    // Doubly linked list constructors
    DoublyLinkedList () {
        head = null;
    }

    DoublyLinkedList (T d) {
        head = new Node(d);
    }

    /* Inserting at front in a doubly linked list */
    void insertFront (T data) {
        Node newNode = new Node(data);

        newNode.next = head;
        newNode.prev = null;

        if (head != null) {
            head.prev = newNode;
        }

        head = newNode;
    }

    /* Inserting at end in a doubly linked list */
    void insertEnd (T data) {
        Node node;
        Node newNode = new Node(data);

        for (node = head; node.next != null; node = node.next) {
            continue;
        }

        node.next = newNode;
        newNode.prev = node;
    }

    /* Inserting at certain index in a doubly linked list */
    void insertAt (int index, T data) {
        Node node;
        Node newNode = new Node(data);

        int i = 0;
        for (node = head; (node.next != null) && (i < index); node = node.next) {
            i++;
        }

        newNode.next = node.next;
        node.next = newNode;
        newNode.prev = node;
    } 

    /* printing doubly linked list */
    void print() {
        Node node;
        for (node = head; node.next != null; node = node.next) {
            System.out.print(node.data + " -> ");
        }
        System.out.println(node.data);
    }

    public static void main(String[] args) {
        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();
        dll.insertFront(5);
        dll.insertFront(4);
        dll.insertFront(2);
        dll.insertFront(1);
        dll.insertEnd(6);
        dll.insertEnd(7);
        dll.insertAt(2, 3);
        dll.print(); // 1 -> 2 -> 4 -> 3 -> 5 -> 6 -> 7   
    }
}
