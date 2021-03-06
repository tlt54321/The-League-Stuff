package StackPractice;

import java.util.Stack;

public class StackPractice {

	public static void main(String[] args) {
		new ReverseString("Reverse this");
		new ReverseString(12345);
	}

	StackPractice() {
		Stack<String> myStack = new Stack<String>();
		myStack.push("Hello");
		myStack.push("Hi");
		myStack.push("Muffin");
		int size = myStack.size();
		for (int i = 0; i < size; i++)
			System.out.println(myStack.pop());
	}

}

class ReverseString {
	ReverseString(String s) {
		Stack<Character> characters = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			characters.push(s.charAt(i));
		}
		int size = characters.size();
		String full = "";
		for (int i = 0; i < size; i++) {
			full += characters.pop();
		}
		System.out.println(full);
	}
	ReverseString(int e) {
		String s = "" + e;
		Stack<Character> characters = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			characters.push(s.charAt(i));
		}
		int size = characters.size();
		String full = "";
		for (int i = 0; i < size; i++) {
			full += characters.pop();
		}
		System.out.println(full);
	}

}