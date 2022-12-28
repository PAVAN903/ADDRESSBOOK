package com.addressbook;

import java.util.Scanner;

public class Address extends Name {
	
	
		static String [] fName=new String[50];
		static String [] mName=new String[50];
		static String [] lName=new String[50];
		static String [] resident=new String[50];
		static String [] city=new String[50];
		static String [] state=new String[50];
		static String [] zip=new String[50];
		static String [] mobile=new String[50];
		static String [] mail=new String[50];
		
		
		public static void print(int n) {
			System.out.println("welcome to address book program");
			System.out.println();
			Scanner sc=new Scanner(System.in);
			
		
			for (int i=1;i<=n;i++) {
               System.out.println("privide "+i+" contact person information");
               
               System.out.println("enter firstname,middle name,last name");
               fName[i]=sc.next();
               mName[i]=sc.next();
               lName[i]=sc.next();
               
               System.out.println("enter resident");
               resident[i]=sc.next();
               System.out.println("enter city");
               city[i]=sc.next();
               System.out.println("enter state");
               state[i]=sc.next();
               System.out.println("enter zip");
               zip[i]=sc.next();
               
               System.out.println("enter mobile number ");
               mobile[i]=sc.next();
               System.out.println("enter mail");
               mail[i]=sc.next();
               }
		}
			public static void store(int n) {
				for(int i=1;i<=n;i++) {
					System.out.println(i+"contact person information");
					
					Name name=new Name();
					name.name(fName[i],mName[i],lName[i]);
					
					Contactaddress address=new Contactaddress();
					address.address(resident[i],city[i],state[i],zip[i]);
					
					Contact contact=new Contact();
					contact.contact(mobile[i],mail[i]);
					}
				
			}
			}
		      


