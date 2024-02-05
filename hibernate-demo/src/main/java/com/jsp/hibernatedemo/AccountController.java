package com.jsp.hibernatedemo;

		import java.util.Scanner;

		public class AccountController {

			public static void main(String[] args) {
				
				
				boolean b = true;
				AccountDao dao = new AccountDao();
				
				while(b) {
					System.out.println("1.save the account");
					System.out.println("2.view account by id");
					System.out.println("3.delete account by id");
					System.out.println("4.update account by name");
					System.out.println("5.update account by mobilenumber");
					System.out.println("6.update account by accountnumber");
					System.out.println("7.exit");
					
					Scanner scn = new Scanner(System.in);
					System.out.println("enter the option");
					int n = scn.nextInt();
					
					switch(n) {
					case 1:{
						System.out.println("enter id");
						int aid = scn.nextInt();
						
						System.out.println("enter name");
						String name = scn.next();
						
						System.out.println("enter mobilenumber");
						long mobilenumber = scn.nextLong();
						
						System.out.println("enter accountnumber");
						long accountnumber = scn.nextLong();
						
						System.out.println("enter pincode");
						int pincode = scn.nextInt();
						
						Account a = new Account();
						a.setId(aid);
						a.setName(name);
						a.setMobilenum(mobilenumber);
						a.setAccountnum(accountnumber);
						a.setPincode(pincode);
						
						dao.saveaccount(a);
						System.out.println("data inserted");
					}break;
					case 2:{
						System.out.println("enter id");
						int sid  = scn.nextInt();
						
						Account a = dao.findById(sid);
						if(a!=null) {
							System.out.println(a.getId());
							System.out.println(a.getMobilenum());
							System.out.println(a.getName());
							System.out.println(a.getAccountnum());
							System.out.println(a.getPincode());
							
						}
						else {
							System.out.println("invalid details");
						}
						
					}break;
					case 3:{
						System.out.println("enter id");
						int sid = scn.nextInt();

						dao.deleteById(sid);
						System.out.println("data deleted");
					}
					break;
					case 4:{
						System.out.println("enter id to update");
						int sid = scn.nextInt();
						dao.updateByName(sid);				
						System.out.println("data updated");
					}
					break;
					case 5:{
						System.out.println("enter id to update");
						int sid = scn.nextInt();
						dao.updateByMobilenumber(sid);				
						System.out.println("data updated");
					}
					break;
					case 6:{
						System.out.println("enter id to update");
						int sid = scn.nextInt();
						dao.updateByaccountnumber(sid);				
						System.out.println("data updated");
					}
					break;
					case 7:{
						b=false;
					}
					default : {
						System.out.println("invalid option");
					}
					}
				}
			}

		}

