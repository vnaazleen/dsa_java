public class MyLinkedList <T>{
	Node head; // Head of list
	
	class Node {
		T data;
		Node next;
		
		// Constructors
		
		Node (T d) {
			data = d;
			next = null;
		}
	}
	
	public MyLinkedList() { // Linked List HeaderNode
		head = new Node(null);
	}
	
	public MyLinkedList(T data) { // Linked List HeaderNode
		head = new Node(data);
	}
	
  // Inserting a node at the end
	public void append(T data) {
		Node new_node = new Node(data);
		
		// If LL is empty then make the new node as head
		if (this.head.data == null) {
			this.head = new_node;
		}
		else {
			// Else traverse till last node & insert the new node
			Node currNode = this.head;
			while (currNode.next != null) {
				currNode = currNode.next;
			}
			currNode.next = new_node;
		}
	}
	
  // Remove a node by value
	public void remove(T key) {
		Node currNode = this.head;
		Node prev = null;
		
		if (currNode != null && currNode.data == key) {
			this.head = currNode.next;
			
			System.out.println(key + " found and deleted");
		}
		
		while (currNode != null && currNode.data != key) {
			prev =currNode;
			currNode = currNode.next;
		}
		
		if (currNode != null) {
			prev.next= currNode.next;
			
			System.out.println(key + " found and deleted"); 
		}
		
		if (currNode == null) {
			System.out.println(key + "not found");
		}
	}
	
  // Remove a node by index
	public void pop(int index) {
		Node currNode = this.head, prev = null;
		
		if (index == 1 && currNode != null) {
			this.head = currNode.next;
			
			System.out.println(index + " position element deleted");
		}
		
		int counter = 0;
		
		while(currNode != null) {
			if (counter == index) {
				prev.next = currNode.next;
				
				System.out.println(index + " position element deleted");
				break;
			} else {
				prev = currNode;
				currNode = currNode.next;
				counter++;
			}
		}
		
		if (currNode == null) {
			System.out.println(index + " position element not found"); 
		}
	}
  
  // Printing a list
	public void print() {
		Node currNode = this.head;
		
		while (currNode != null) {
			System.out.print(currNode.data + " ");
			currNode = currNode.next;
		}
		System.out.println();
	}
	
  // Driver code
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		
		list.append(1);
		list.append(2);
		list.append(3);
		list.append(4);
		list.print();
		list.remove(2);
		list.print();
		list.pop(1);
		list.print();
	}
