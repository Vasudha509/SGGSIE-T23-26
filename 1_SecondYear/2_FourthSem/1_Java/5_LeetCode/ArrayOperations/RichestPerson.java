// Java program to find the richest person form the given array.

import java.util.Scanner;

class RichestPerson {
	public static void main(String[] args) {
		RichestPerson objPerson = new RichestPerson();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of the customer : ");
		int countCustomer = sc.nextInt();
		
		System.out.print("Enter the number of accounts for the customer : ");
		int countBank = sc.nextInt();
		
		// creating an array of accounts to store customer and bank account.
		int[][] accounts = new int[countCustomer][countBank];
		
		// taking data for the customer account.
		System.out.println("Enter the balance of customer : ");
		for (int i = 0; i < countCustomer; i++) {
		      for (int j = 0; j < countBank; j++) {
		          accounts[i][j] = sc.nextInt();
		      }
		}
		
		System.out.println("Wealth of richest person : " + objPerson.maximumWealth(accounts));	
	}
	
	// Function to find richest person from the given array
	int maximumWealth(int[][] accounts) {
		int accountBalance = 0;
		int richestPerson = 0;
		
		for (int i = 0; i < accounts.length; i++) {
			accountBalance = 0;
			for (int j = 0; j < accounts[i].length; j++) {
				accountBalance += accounts[i][j];
			}
			
			if (accountBalance > richestPerson)
				richestPerson = accountBalance;
		}
		
		return richestPerson;
	}
}
