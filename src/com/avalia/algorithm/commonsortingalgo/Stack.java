package com.ds;

public class Stack {
	
	char[]  arr = null; 
//	char[] array = null;
	int top = -1;
	/*public Stack(int number) {
		arr = new String[number];
	}*/
	public Stack(int number) {
		arr = new char[number];
	}
	public void push(char c) {
		if (top == arr.length) {
			System.out.println("Stack overflow");
		} else {
			arr[++top] = c;
		}
	}
	public char pop() {
		if (top == -1) {
			System.out.println("Stack underflow");
			return '*';
		} else {
			return arr[top--];
		}
	}
	public int maxSize() {
		return arr.length;
	}
	public int totalElement() {
		return top+1;
	}
	public boolean isEmpty(){
		if(top==-1){
			return true;
		}else{
			return false;
		}
	} 
	
	public boolean isFull (){
		if(top==arr.length-1){
			return true;
		}else{
			return false;
		}
	}
}
