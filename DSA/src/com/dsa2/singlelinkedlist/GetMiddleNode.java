package com.dsa2.singlelinkedlist;


public class GetMiddleNode {
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
	public Node getMiddleNode(Node head) {
		if(head==null) {
			return null;
		}
		Node slowPtr=head;
		Node fastPtr=head;
		while(fastPtr!=null && fastPtr.next!=null) {
			slowPtr=slowPtr.next;
			fastPtr=fastPtr.next.next;
		}
		return slowPtr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      GetMiddleNode sll=new GetMiddleNode();
      sll.head=new Node(4);
		Node first=new Node(10);
		Node second=new Node(3);
		Node third=new Node(5);
		sll.head.next=first;
		first.next=second;
		second.next=third;
		//4 --> 10 --> 3 --> 5 --> null
		Node middle=sll.getMiddleNode(sll.head);
		System.out.println("the middle node data is: "+middle.data);
		Node a=new Node(13);
		Node b=new Node(5);
		Node c=new Node(10);
		Node d=new Node(8);
		third.next=a;
		a.next=b;
		b.next=c;
		c.next=d;
		//4 --> 10 --> 3 --> 5 --> 13 --> 5 --> 10 --> 8 --> null
		middle=sll.getMiddleNode(sll.head);
		System.out.println("the middle node data is: "+middle.data);
	}

}
