package com.Demo;

public class StackMain 
{
	public static void main(String[] args) {
		  Stack<Integer> stack=new Stack<>();
		  stack.push(37);
		  stack.push(68);
		  stack.push(19);
		  stack.push(25);
		  stack.push(75);
		  stack.peek();
		  stack.pop();
		  stack.isEmpty();
		  stack.getSize();
		  stack.printStack();
		  
		  Stack<Float> stack1=new Stack<>();
		  stack1.push(37.3f);
		  stack1.push(68.5f);
		  stack1.push(19.2f);
		  stack1.push(25.7f);
		  stack1.push(75.2f);
		  stack1.peek();
		  stack1.pop();
		  stack1.isEmpty();
		  stack1.getSize();
		  stack1.printStack();
	  }
}
