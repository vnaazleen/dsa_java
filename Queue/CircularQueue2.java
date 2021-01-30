//package ds;

import java.util.Scanner;

public class CircularQueue2 {
    int q[];
    int front, rear;
    int size;

    CircularQueue() {
        front = rear = -1;
        size = 100;
        q = new int[size];
    }

    void enQueue(int e) {
        if(!isFull()) {
            rear = (rear + 1) % size;
            q[rear] = e;
            
            /** Queue is empty */
            if (front == -1) {
                front = 0;
            }
        } else {
            System.out.println("Queue is full");
        }
    }

    void deQueue() {
        if(!isEmpty()) {
            System.out.println(q[front] + " is dequeued!");

            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }
        } else {
            System.out.println("Queue is empty");
        }
    }

    private boolean isEmpty() {
        return front == -1;
    }

    private boolean isFull() {
        return (rear + 1) % size == front;
    }

    private void print() {
		if (front == -1) {
			System.out.println("Queue is Empty!");
			return;
		}
		
		if (rear >= front) {
			for (int i = front; i <= rear; i++) {
				System.out.print(q[i] + " ");
			}
		} else {
				
			for (int i = front; i < size; i++) {
				System.out.print(q[i] + " ");
			}	
		
			for (int i = 0; i <= rear; i++) {
				System.out.print(q[i] + " ");
			}
		}
		
        System.out.println();
    }

    public void display() {
        System.out.println("*****************Circular Queue operations*****************");
        System.out.println("1.Enqueue\n2.Dequeue\n3.Print\n4.Exit");
        System.out.println("Enter your choice: ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CircularQueue2 cq = new CircularQueue2();

        while (true) {
            cq.display();
            int ch = input.nextInt();

            switch (ch) {
                case 1: 
                System.out.print("Enter value: ");
                cq.enQueue(input.nextInt());
                break;

                case 2: cq.deQueue();
                break;

                case 3: cq.print();
                break;

                case 4: 
                return;

                default: System.out.println("Enter one of the below choices(only)");
            }
        }


        /**
         * 
         * Sample output:
*****************Circular Queue operations*****************
1.Enqueue
2.Dequeue
3.Print
4.Exit
Enter your choice: 
1
Enter value: 3
*****************Circular Queue operations*****************
1.Enqueue
2.Dequeue
3.Print
4.Exit
Enter your choice: 
1
Enter value: 4
*****************Circular Queue operations*****************
1.Enqueue
2.Dequeue
3.Print
4.Exit
Enter your choice:
1
Enter value: 5
*****************Circular Queue operations*****************
1.Enqueue
2.Dequeue
3.Print
4.Exit
Enter your choice:
1
Enter value: 6
*****************Circular Queue operations*****************
1.Enqueue
2.Dequeue
3.Print
4.Exit
Enter your choice: 
3
3 4 5 6 
*****************Circular Queue operations*****************
1.Enqueue
2.Dequeue
3.Print
4.Exit
Enter your choice:
2
3 is dequeued!
*****************Circular Queue operations*****************
1.Enqueue
2.Dequeue
3.Print
4.Exit
Enter your choice:
3
4 5 6
         */
    }
}
