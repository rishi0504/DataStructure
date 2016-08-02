package com.ds;

public class StackExample {

	public static void main(String[] args) {
		// ===============================================
		// Reversing string by space seperated
		// ===============================================
		/*
		 * String r = "Hello my name is rishabh tiwari"; String[] s =
		 * r.split(" "); Stack stack = new Stack(s.length); for(int
		 * i=0;i<s.length;i++){ stack.push(s[i]+" "); }
		 * 
		 * StringBuffer sb = new StringBuffer(""); while (stack.top!=-1) {
		 * sb.append(stack.pop()); } System.out.println(sb);
		 */
		// ===============================================
		// Reversing string
		// ===============================================
		/*
		 * System.out.println(stack.pop()); stack.push(10);
		 * System.out.println(stack.pop()); System.out.println(stack.maxSize());
		 * System.out.println(stack.totalElement());
		 * System.out.println(stack.isFull());
		 * System.out.println(stack.isEmpty());
		 */
		// reversing a word using stack

		/*
		 * int index = 0; while (index != s.length()) { stack.push("" +
		 * s.charAt(index)); index++; }
		 * 
		 * StringBuffer sb = new StringBuffer(""); while (stack.top!=-1) {
		 * sb.append(stack.pop()); } System.out.println(sb);
		 */
		// ===============================================
		// Checking for brackets
		// ===============================================
		String s = "[{()}}]";
		char arr[] = s.toCharArray();
		Stack stack = new Stack(arr.length);
		boolean breakCondition = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '[' || arr[i] == '{' || arr[i] == '(') {
				stack.push(arr[i]);
			} else if (arr[i] == ']' || arr[i] == '}' || arr[i] == ')') {
				if(stack.top!=-1){
					
				}
				char c = stack.pop();
				
				switch (c) {

				case ']':
					if (c != '[') {
						breakCondition = true;
					}
					break;
				case '}':
					if (c != '{') {
						breakCondition = true;
					}
				case ')':
					if (c != '(') {
						breakCondition = true;
					}

				}
				if(breakCondition){
					System.out.println("Condition break");
					break;
				}

			}
		}
		if(!breakCondition){
			System.out.println("Condition fine");
		}

	}
}
