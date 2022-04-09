package com.Demo;


public class LinledListMain 
{
	public static void main(String[] args) {
		  LinkedList<Integer> list=new LinkedList<>();
	      list.add(23);
	      list.add(45);
	      list.add(19);
	      list.add(89);
	      list.insertAtLast(57);
	      list.insertAtPosition(2,11);
	      list.deleteFirst();
	      list.deleteLast();
	      list.deleteAtPosition(2);
	      list.search(19);
	      list.getSize();
	      list.printList();
	      
	      LinkedList<String> list1=new LinkedList<>();
	      list1.add("Number");
	      list1.add("Batch");
	      list1.add("Bridgelabz");
	      list1.add("the");
	      list1.add("to");
	      list1.add("welcome");
	      list1.insertAtLast("189"); 
	     list1.insertAtPosition(5,"of");
	     list1.deleteFirst();
	      list1.deleteLast();
	      list1.deleteAtPosition(1);
	     list1.search("Bridgelabz");
	      list1.getSize();
	      list1.printList();
		}
}
