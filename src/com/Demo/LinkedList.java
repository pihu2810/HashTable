package com.Demo;



public class LinkedList<K> 
{
	 Node<K> head;
	   Node<K> tail;
	   int size=0;
	   
 public LinkedList() {
		   this.head=null;
		   }
	   
 public boolean isEmpty() {
			 if(this.size==0) {
				 return true;
			 }
			 return false;
			 }
 public int getSize(){
	    System.out.println("The Size of the LinkedList = " +size);
		return size;
 }
	   
 public void add(K data) {
		Node<K> node=new Node<>(data);
		node.setData(data);
		node.setNext(head);
		head=node;
		size++;
	}
	   public void insertAtLast(K data) {
			 Node<K> n1,t;
			 n1=new Node<>(data);
			 n1.setData(data);
			 n1.setNext(null);
			 t=head;
			 if(head==null)
			 {
				 head=n1;
		    }else {
		    	while(t.getNext()!=null) {
		    		t=t.getNext();
		    	}
		    	t.setNext(n1);
		    	tail=n1;
		    	size++;
		    	 }
		 }
	   public void insertAtPosition(int index,K data)
	   {
	  	
	  	Node<K> n=new Node<>(data);
	  	 n.setData(data);
	  	 n.setNext(null);
	  	 if(index==1) {
	  		 add(data);
	  	 }else if(index==size+1 && index>size+1) {
	  		 insertAtLast(data);
	  	 }else  {
	  		Node t=head;
	  		  for(int i=0;i<index-1;i++) {
	  			 t=t.getNext();
	  		  }
	  			 n.setNext(t.getNext());
	  			 t.setNext(n);
	  			 size++;
	  			 
	  		 }
	  	 }
	   public void deleteFirst() {
			 if(head==null) {
				 System.out.println("Empty");
			 }else {
				 head=head.getNext();
				 size--;
			 }
		 }
		 public void deleteLast() {
			 if(head==null) {
				 System.out.println("Empty");
			 }else if(size==1) {
				 head=null;
				 size--;
				}else {
					Node t;
					t=head;
					for(int i=1; i<size-1 ;i++) 
						t=t.getNext();
						t.setNext(null);
						size--;
					}
			 }
		 public void deleteAtPosition(int index) {
			 if(head==null) {
				 System.out.println("List is Empty");
			 }else if(index<1 || index>size) {
				 System.out.println("Invalid index");
			 }else if(index==1) {
				 deleteFirst();
			 }else if(index==size) {
				 deleteLast();
			 }else {
				 Node t,n;
				 t=head;
				 for(int i=1;i<index-1;i++) {
					 t=t.getNext();
				 }
				 n=t.getNext();
				 t.setNext(n.getNext());
				 size--;
			 }
		 }
		 public void search(K value) {
				Node<K> intial=head;
				
				if(head==null) {
					System.out.println("list is empty");
				}else {
					while(head.getNext()!=null) {
						if(head.getData()==value) {
							System.out.println(value + " is present in linked list");
							break;
						}
						head=head.getNext();
					}
				
	}
	}
		 	
		 
	   public  void printList() {
		   if(head==null) {
			   System.out.println("isEmpty");
		   }
		   else {	 Node<K> curr=head;
			 while(curr !=null) {
				 System.out.println(curr.getData());
				 curr=curr.getNext();
			 }
		}
}
}
