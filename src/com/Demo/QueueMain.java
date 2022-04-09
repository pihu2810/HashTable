package com.Demo;

public class QueueMain 
{
	public static void main(String [] args) {
		 Queue<Integer> queue=new Queue<>();
		 queue.enQueue(12);
		 queue.enQueue(88);
		 queue.enQueue(97);
		 queue.enQueue(5);
		 queue.deQueue();
		 queue.printQueue();
		 
		 Queue<Character> queue1=new Queue<>();
		 queue1.enQueue('A');
		 queue1.enQueue('C');
		 queue1.enQueue('V');
		 queue1.enQueue('h');
		 queue1.deQueue();
		 queue1.printQueue();
		}
}
