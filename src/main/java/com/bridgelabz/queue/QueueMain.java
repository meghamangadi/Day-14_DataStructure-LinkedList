package com.bridgelabz.queue;

import java.util.Scanner;

public class QueueMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to add element in the Queue");
		
		Queue queue = new Queue();

		switch (sc.nextInt()) {
		case 1:
			queue.enqueu();
			break;
		default:
			System.out.println("Enter correct choice");

	}
		sc.close();
	}
}
