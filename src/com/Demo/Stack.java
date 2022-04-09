package com.Demo;

public class Stack<K> {
	private final LinkedList linkedList;
	 public Stack() {
	 linkedList=new LinkedList();
	 }
	 public void isEmpty(){
	  linkedList.isEmpty();
	  }
	  public void getSize(){
	  linkedList.getSize();
	  }
	 public void push(K data) {
		 linkedList.add(data);
	 }
	 public void printStack() {
		 linkedList.printList();
	 }
	 public Node peek() {
		return linkedList.head;
	 }
	 public void pop()
	 {
		 linkedList.deleteFirst();
	 }
}

