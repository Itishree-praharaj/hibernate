package com.jsp.hibernatedemo;

import java.util.Scanner;

public class AccountLogin {
public static void main(String[] args) {
	
	
	Scanner scn = new Scanner(System.in);
	System.out.println("enter accountnum");
   long accountnum= scn.nextLong();
	
	System.out.println("enter pincode");
	int pincode= scn.nextInt();
	
     AccountDao dao = new AccountDao();
     Account a = dao.findByAccountnumAndPincode(accountnum, pincode);
		 
		
		if(a!=null) {
			System.out.println("welcome");
		}else {
			System.out.println("invalid creadientials");
	}
}
}
