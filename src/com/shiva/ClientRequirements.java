package com.shiva;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ClientRequirements {
	static Scanner input = new Scanner(System.in);
	static int option,data;

	public static void welcomeuser() {
		System.out.println(" Welcome to ------- LockedMe-App---------------\n");
		System.out.println(" Application name : LockedMe-app");
		System.out.println(" Developer Details : Develeloped by shiva");
	}

	public static void menuDetails() throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		BusinessLogicMain obj = new BusinessLogicMain();
		int option;
		do {
		System.out.println("Enter your choice which you want to select: \n");
		System.out.println("\t1. Retrieve current filenames in ascending order \n");
		System.out.println("\t2. Business-level operation menu \n");
		System.out.println("\t3. Exit from the application \n");
		
		option=sc.nextInt();
		switch(option) {
		case 1:
			obj.showFiles();
			break;
		case 2:
			int ch;
		do {
			System.out.println("Enter your choice for Business level operation");
			System.out.println("\t1. Add a file and its content to a directory");
			System.out.println("\t2. Delete a file from a directory");
			System.out.println("\t3. Searching a file and showing its content");
			System.out.println("\t4. Exit from menu");
			
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				obj.addFile();
				break;
			case 2:
				obj.deleteFile();
				break;
			case 3:
				obj.searchFile();
				break;
			case 4:
				System.out.println("Exited from the Business Level operation...");
				System.out.println("---------------------------------\n");
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
		}while(ch!=4);
		break;
		case 3:
			System.out.println("Exiting from the application...");
			break;
		default:
			System.out.println("Invalid choice");
		}
		
		//System.out.println("Press 0 to continue");
		}while(option!=3);
		
	}
}
