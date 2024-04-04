package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		print();
		int option = input();
		System.out.println("You've chosen " + option);

	}

	public static void print() {
		System.out.println("Hello welcome to your task manager\n" +
				   "Choose which option you want to proceed\n" +
				   "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
				   "1. Read Tasks\n" +
				   "2. Add Tasks\n" +
				   "3. Modify Tasks\n" +
				   "4. Change Task Priority\n" +
				   "5. Delete Tasks\n" +
				   "6. Checkmark Tasks");
	}

	public static int input() {

		Scanner input = new Scanner(System.in);
		int result = input.nextInt();
		return result;
	}




}
