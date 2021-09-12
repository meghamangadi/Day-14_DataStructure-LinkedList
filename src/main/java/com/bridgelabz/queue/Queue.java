package com.bridgelabz.queue;

import com.bridgelabz.linkedlist.Node;

public class Queue {
	Node front;
	Node rare;
	Node top;

	public void addQueue(int data) {
		Node newnode = new Node(data);
		if (front == null) {
			front = newnode;
			rare = newnode;
			top = front;
		} else {
			Node tempNode = rare;
			this.rare = newnode;
			tempNode.next = rare;
		}
	}

	public void enqueu() {
		Queue queue = new Queue();
		queue.addQueue(56);
		queue.addQueue(30);
		queue.addQueue(70);
		queue.display();

	}

	public void dequeue() {
		Queue.pop();
	}

	public static void pop() {
		Queue queue = new Queue();
		System.out.println(" Before Pop:");
		queue.enqueu();
		queue.poptillend();
		System.out.println();
		System.out.println(" After Pop:");
		queue.display();
	}

	public void poptillend() {
		Node temp = top;
		while (temp != null) {
			Node tempNode = this.front;
			this.front = tempNode.next;
			temp = temp.next;
		}
	}

	
	public void display(){
        if (front == null) {
            System.out.println("Queue list is Empty");
            return;
        } else {
            System.out.print("The Queue elements are ");
            Node tempNode = front;
            while (tempNode != null) {
                if(tempNode.next !=null) {
                    System.out.print(tempNode.data + " -> ");
                    tempNode = tempNode.next;
                }
                else {
                    System.out.print(tempNode.data);
                    tempNode=tempNode.next;
                }
            }
        }
	}
}
