package com.bridgelabz.linkedlist;

import java.util.Scanner;

public class LinkedListMain {

	public static void main(String[] args) {
		System.out.println("Welcome to linkedList DataStructure Program");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1 to add the data at the start");
		System.out.println("Enter 2 to add the data at the end");
		System.out.println("Enter 3 to insert data at the Middle");
		System.out.println("Enter 4 to delete first element");
		switch (scanner.nextInt()) {
		case 1:
			Operations.addeElementAtStart();
			break;
		case 2:
			Operations.addElementAtEnd();
			break;
		case 3:
			Operations.insertInBetween();
			break;
		case 4:
			Operations.deleteFirstNode();
			break;

		}
	}

}
