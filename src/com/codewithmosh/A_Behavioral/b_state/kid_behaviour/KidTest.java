package com.codewithmosh.A_Behavioral.b_state.kid_behaviour;

public class KidTest {

	public static void main(String[] args) {
		
		Kid kid = new Kid(1);
		
		kid.play();
		kid.eat();
		
		kid.setAge(3);
		kid.play();
		kid.eat();
		
	}
	
}
