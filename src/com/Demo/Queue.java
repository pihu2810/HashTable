package com.Demo;



public class Queue<K> 
{
	private final LinkedList linkedList;
	public Queue() {
		linkedList=new LinkedList();
	}
	public void enQueue(K data) {
		linkedList.add(data);
	}
	public void printQueue() {
		linkedList.printList();
	}
	public void deQueue() {
		linkedList.deleteFirst();
	}
	
}
