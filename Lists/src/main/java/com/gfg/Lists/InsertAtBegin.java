package com.gfg.Lists;

public class InsertAtBegin {

	public static void main(String[] args) {
		Node head = null;
		
		head = insertBegin(head, 30);
		head = insertBegin(head, 20);
		head = insertBegin(head, 10);
	}
	
	static Node insertBegin(Node head, int x) {
		Node temp = new Node(x, head);
		temp.next = head;
		return temp;
	}

}
