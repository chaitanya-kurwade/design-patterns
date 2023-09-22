package com.codewithmosh.A_Behavioral.g_observer.another_example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		YoutubeChannel channel = new YoutubeChannel();
		
		Subscriber aman = new Subscriber("Aman");
		Subscriber raman = new Subscriber("Raman");
		
		channel.subscribe(aman);
		channel.subscribe(raman);
		channel.newVideoUploaded("Learn design patterns");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("Press 1 to subscribe");
			System.out.println("Press 2 to add new video");
			System.out.println("Press 3 to unsubscribe");
			System.out.println("Press 4 to exit");
			System.out.println("Press 5 to see existing subscribers");

			int c = Integer.parseInt(br.readLine());
			
			if(c==1) {
				// subscribe
				System.out.println("Enter name of subscriber: ");
				String name = br.readLine();
				Subscriber subscriber = new Subscriber(name);
				channel.subscribe(subscriber);
				
			}else if(c==2) {
				//add new video
				System.out.println("Enter title of video: ");
				String title = br.readLine();
				channel.newVideoUploaded(title);
				
			}else if(c==3) {
				System.out.println("Enter name to unsubscribe: ");
				String input = br.readLine();
				
//				channel.unsubscribe(input);
			}else if(c==4){
				//exit
				System.out.println("Thankyou for using our services");
				break;
			}else if(c==5){
				//exit
				System.out.println("Existing subscribers");
//				channel.existingSubscribers();
			}else {
				System.out.println("Wrong input");
			}
		}
		
	}
	
}
