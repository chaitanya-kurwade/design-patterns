package com.codewithmosh.A_Behavioral.a_momento;


//to call momento_
public class Main {

	public static void main(String[] args) {

		// Momento_pattern --> to revoke or undo or roll-back the states
		var editor = new Editor();
		var history = new History();

		editor.setContent("a");
		history.push(editor.createState());

		editor.setContent("b");
		history.push(editor.createState());

		editor.setContent("c");
		history.push(editor.createState());

		editor.setContent("d");
		editor.restore(history.pop());//it will get "c" not "d"
		editor.restore(history.pop());//and it will print "b" not "c"

		System.out.println(editor.getContent());
	}

}
