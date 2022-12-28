package com.addressbook;

import java.util.Scanner;

public class Addressmain {

	public static void main(String[] args) {
		System.out.println("Welcome to address book program");
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Enter first name,midlle name,lastname");
		 String fName=sc.next();
		 String mName=sc.next();
		 String lName=sc.next();
		 
		 System.out.println("enter resident address");
		 String resident=sc.next();
		 System.out.println("enter city");
		 String city=sc.next();
		 System.out.println("enter state");
		 String state=sc.next();
		 System.out.println("enter zip");
		 String zip=sc.next();
		 
		 System.out.println("enter valid mobile number");
		 String mobile=sc.next();
		 System.out.println("enter valid mail address");
		 String mail=sc.next();
		 
		//OBJECT OF NAME CLASS
		Name name=new Name();
		name.name(fName,mName,lName);
		  
		//OBJECT OF CLASS ADRESS
		Address address1=new Address();
		address1.address(resident,city, state, zip);
		
		//OBJECT OF CLASS CONTACT
		Contact contact=new Contact();
		contact.contact(mobile, mail);
      
	}

}
