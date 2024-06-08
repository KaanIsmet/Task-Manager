package main;

import java.util.Scanner;
import taskManager.*;


public class Main {

	public static void main(String[] args) {
		print();
		TaskManager taskManager = new TaskManager();
		int option = input();
		do {
			switch (option) {
				case 1:
					taskManager.readTasks();
					break;
				case 2:
					taskManager.addTask();
					break;
				case 3:
					taskManager.modifyTask();
					break;
				case 4:
					taskManager.changePriority();
					break;
				case 5:
					taskManager.deleteTask();
					break;
				case 6:
					taskManager.checkmarkTask();
					break;
				case 7:
					System.exit(0);

			}
		} while (true);



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
				   "6. Checkmark Tasks\n" +
				   "7. Exit the program");
	}

	public static int input() {

		Scanner input = new Scanner(System.in);
		int result = input.nextInt();
		input.close();
		return result;
	}




}
