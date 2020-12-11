package oop2;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account16[] accounts = new Account16[10];
		for(int i=0; i<10; i++) {
			accounts[i] = new Account16(i, 100);
		}
		Scanner sc = new Scanner(System.in);
		int id = -1;
		while(true) {
			do {
				System.out.println("Input an id");
				id = sc.nextInt();
			} while (id<0 || id>9);
			
			int option = -1;
			while(option!=4) {
				System.out.println("Main menu\r\n"
						+ "1: check balance\r\n"
						+ "2: withdraw\r\n"
						+ "3: deposit\r\n"
						+ "4: exit\r\n"
						+ "Enter a choice:\r\n"
						+ "");
				option = sc.nextInt();
				if(option == 1) {
					System.out.println("You have "
							+ accounts[id].getBalance());
				} else if(option==2) {
					System.out.println("Amount to withdraw?");
					double amount = sc.nextDouble();
					accounts[id].withdraw(amount);
				} else if(option==3) {
					System.out.println("Amount to deposit?");
					double amount = sc.nextDouble();
					accounts[id].deposit(amount);
				}
			}
		}
	}

}
