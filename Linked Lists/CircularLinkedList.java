public class CircularLinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        public Node() {
            data = 0;
            next = null;
        }

        public Node(int d) {
            data = d;
            next = null;
        }
    }

    public void printList() {
               
        // printing list
        System.out.print(this.head.data + " -> ");

        Node currNode = this.head.next;
        while(currNode != this.head) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        
        System.out.println("...");
    }


    public int length() {
        if (this.head == null) {
            return 0;
        }

        int len = 1;
        Node currNode = this.head.next;

        while (currNode != this.head) {
            len++;
            currNode = currNode.next;
        }

        return len;
    }

    private boolean isEmpty() {
        return this.length() == 0;
    }

    public void insertFront(int data) {
        if (this.head == null) {
            this.head = new Node(data);
            this.head.next = this.head;

            return;
        }

        Node newNode = new Node(data);
        newNode.next = this.head;
        Node currNode = this.head.next;

        while (currNode.next != this.head) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
        this.head = newNode;
    }

    public void insertEnd(int data) {
        if (this.head == null) {
            this.head = new Node(data);
            this.head.next = this.head;

            return;
        }

        Node newNode = new Node(data);
        Node currNode = this.head.next;

        while (currNode.next != this.head) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
        newNode.next = this.head;
    } 

    public void insertKey(int index, int data) {
        
        /* check for invalid index */
        int length = this.length();
        if (index > length || index < 0) {
            throw new IndexOutOfBoundsException();
        }

        if (length == 0) {
            this.insertFront(data);
            return;
        }

        if(index == length) {
            this.insertEnd(data);
            return;
        }

        Node newNode = new Node(data);
        Node currNode = this.head.next;
        int pos = 1;

        if (pos < index - 1) {
            currNode = currNode.next;
            pos++;
        }

        newNode.next = currNode.next;
        currNode.next = newNode;
    }

    public int deleteFront() {
        // list is empty
        if (isEmpty()) {
            throw new NullPointerException();
        }

        // only one node in list
        if (this.length() == 1) {
            int delValue = this.head.data;
            this.head = null;

            return delValue;
        }

        Node currNode = this.head.next;
        while (currNode.next != this.head) {
            currNode = currNode.next;
        }

        int delValue = currNode.next.data;
        currNode.next = currNode.next.next;
        this.head = currNode.next;

        return delValue;
    }

    public int deleteEnd() {
        // list is empty
        if (isEmpty()) {
            throw new NullPointerException();
        }

        // only one node in list
        if (this.length() == 1) {
            int delValue = this.head.data;
            this.head = null;

            return delValue;
        }

        Node currNode = this.head.next;
        while (currNode.next.next != this.head) {
            currNode = currNode.next;
        }

        int delValue = currNode.next.next.data;
        currNode.next.next = null;
        currNode.next = this.head;

        return delValue;
    }

    public int deleteAt(int index) {

        /* check for invalid index */
        int length = this.length();
        if (index > length || index < 0) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            return this.deleteFront();
        }

        if (index == length) {
            return this.deleteEnd();
        }

        int pos = 0;
        Node currNode = this.head;

        while (pos < index - 1) {
            currNode = currNode.next;
            pos++;
        }

        int delValue = currNode.next.data;
        currNode.next = currNode.next.next;

        return delValue;        
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        cll.insertEnd(5);
        cll.printList();

        cll.insertFront(4);
        cll.printList();


        cll.insertEnd(6);
        cll.printList();

        cll.insertFront(2);
        cll.printList();

        cll.insertEnd(7);
        cll.printList();

        cll.insertFront(1);
        cll.printList();

        cll.insertKey(2, 3);
        cll.printList();

        cll.deleteAt(4);
        cll.printList();

        cll.deleteFront();
        cll.printList();

        cll.deleteEnd();
        cll.printList();

        /*

        5 -> ...
        4 -> 5 -> ...
        4 -> 5 -> 6 -> ...
        2 -> 4 -> 5 -> 6 -> ...
        2 -> 4 -> 5 -> 6 -> 7 -> ...
        1 -> 2 -> 4 -> 5 -> 6 -> 7 -> ...
        1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> ...
        1 -> 2 -> 3 -> 4 -> 6 -> 7 -> ...
        2 -> 3 -> 4 -> 6 -> 7 -> ...
        2 -> 3 -> 4 -> 6 -> ... 

        */
    }
}
