package com.codewithmosh.A_Behavioral.b_state.kid_behaviour;

public class Kid {
	private int age;
	
	private KidState kidState;
	
	public Kid(int age) {
		this.setAge(age);
	}
	
	
	public void eat() {
		kidState.eat();
		System.out.println();
	}
	
	public void play() {
		kidState.play();
	}
	
	public void setAge(int age) {
		
		System.out.println("Kid's age is: "+age);
		if (age == 1) {
			kidState = new OneYearKid();
		}else if (age == 2) {
			kidState = new TwoYearKid();
		}else if (age == 3) {
			kidState = new ThreeYearKid();
		}else if (age == 4) {
			kidState = new FourYearKid();
		}else {
			kidState = new OneYearKid();
		}
	}
}
