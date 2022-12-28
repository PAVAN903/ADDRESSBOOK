package com.addressbook;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		System.out.println("Welcome to address book program");
		   Address address=new Address();
		 
				int n;
				Scanner sc=new Scanner(System.in);
				System.out.print("Enter the number of contacts you want to store: "); 
				n=sc.nextInt();
		
		 address.print(n);
		 address.store(n);

}
}