package com.codewithmosh.A_Behavioral.i_chain_of_responsibility.atm_handler;

import java.util.Scanner;

public class Main {
	
	
	private AtmHandler a1;
	public Main() {
		this.a1 = new TwoThousandNotesHandler();
		AtmHandler a2 = new FiveHundredNotesHandler();
		AtmHandler a3 = new TwoHundredNotesHandler();
		AtmHandler a4 = new OneHundredNotesHandler();
		
		a1.setNext(a2);
		a2.setNext(a3);
		a3.setNext(a4);
	}
	

	public static void main(String[] args) {

			Main main = new Main();
				int amount = 0;
				System.out.println("Enter amount to withdraw");
				Scanner input = new Scanner(System.in);
				amount = input.nextInt();
				input.close();
				try {
					if(amount % 100 != 0) {
//						System.out.println("The "+amount+" should be in multiple of 100s." );
						throw new NumberFormatException();
					}else {
						System.out.println("ghrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
						Thread.sleep(5000);
						/////here
						main.a1.doWithdraw(new Currency(amount));
					}
				} catch (Exception e) {
					
					System.out.println("The "+amount+" should be in multiple of 100s." );
					System.out.println(e);
				}
				
			}
}
