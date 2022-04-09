package com.Demo;

public class Node<K> {
	private	K data;
	private	 Node<K> next;
		public Node(K data) {
			super();
			this.data = data;
			this.next = null;
		}
	  public K getData() {
			return data;
		}
		public void setData(K data) {
			this.data = data;
		}
		public Node<K> getNext() {
			return next;
		}
		public void setNext(Node<K> next) {
			this.next = next;
		}

	}

