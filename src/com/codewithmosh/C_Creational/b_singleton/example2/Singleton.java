package com.codewithmosh.C_Creational.b_singleton.example2;
import java.util.Collections;
import java.util.Arrays;
import java.util.LinkedList;

public class Singleton {
	//lazy
	private static Singleton firstInstance = null;
	
	public String[] scrabbleLetters = {
			"Ah","2h","3h","4h","5h","6h","7h","8h","9h","10h","Jh","Qh","Kh",
			"As","2s","3s","4s","5s","6s","7s","8s","9s","10s","Js","Qs","Ks",
			"Ad","2d","3d","4d","5d","6d","7d","8d","9d","10d","Jd","Qd","Kd ",
			"A","2","3","4","5","6","7","8","9","10","J","Q","K"
		};
	
	private LinkedList<String> letterList = new LinkedList<String>(Arrays.asList(scrabbleLetters));
	
	static boolean firstThread = true;
	
	public static Singleton getInstance() {
		if(firstInstance == null) {
			if (firstThread) {
				firstThread = false;
				Thread.currentThread();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			synchronized(Singleton.class) {
				if (firstInstance == null) {
					//required code to be synchronized
					firstInstance = new Singleton();
					Collections.shuffle(firstInstance.letterList);
				}		
			}
		}	
		return firstInstance;
	}
	
	
	public LinkedList<String> getLetterList(){
		return firstInstance.letterList;
	}
	
	public LinkedList<String> getTiles(int howManyTiles){
		LinkedList<String> tilesToSend = new LinkedList<>();
		for (int i = 0; i < howManyTiles; i++) {

			tilesToSend.add(firstInstance.letterList.remove());
			
		}
		return tilesToSend;
	}
	
}
