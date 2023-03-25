package com.dsa2.singlelinkedlist;


public class GetNthNode {
	private Node head;
	//node structure
	private static class Node{
		private int data;
		private Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public Node getNthNodeFromLast(int n) {
		if(head==null)
			return null;
		if(n<=0) {
			throw new IllegalArgumentException("Invalid Input");
		}
		Node mainPtr=head;
		Node refPtr=head;
		int count=0;
		while(count<n) {
			if(refPtr==null) {
				throw new IllegalArgumentException("number is greater than the number of nodes in list");
			}
			refPtr=refPtr.next;
			count++;
		}
		while(refPtr!=null) {
			refPtr=refPtr.next;
			mainPtr=mainPtr.next;
		}
		return mainPtr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 GetNthNode sll=new GetNthNode();
	      sll.head=new Node(4);
			Node first=new Node(10);
			Node second=new Node(3);
			Node third=new Node(5);
			sll.head.next=first;
			first.next=second;
			second.next=third;
			Node nth=sll.getNthNodeFromLast(3);
			System.out.println("The Nth node is: "+nth.data);

	}

}
