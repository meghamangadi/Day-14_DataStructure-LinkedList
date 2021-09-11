package com.bridgelabz.stack;

import java.util.Scanner;

public class StackMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to add element in the Stack");
		System.out.println("Enter 2 to get top element in the Stack");
		System.out.println("Enter 3 to delete all element in  the Stack");
		Stack stack = new Stack();

		switch (sc.nextInt()) {
		case 1:
			stack.push();
			break;
		case 2:
			stack.peek();
			break;
		case 3:
			stack.pop();
			break;
		default:
			System.out.println("Enter correct choice");

		}
		sc.close();
	}
}