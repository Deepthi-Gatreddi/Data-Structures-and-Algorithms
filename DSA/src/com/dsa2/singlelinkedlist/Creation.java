package com.dsa2.singlelinkedlist;

public class Creation {
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
	//to print the single linked list
	public void printSLL(Node head) {
	   Node temp=head;
	   while(temp!=null) {
		   System.out.print(temp.data+" ---> ");
		   temp=temp.next;
	   }
	   System.out.print("null");
	   System.out.println("");;
	}
	
	//to find the length of the single linked list
	public int findLength(Node head) {
		Node temp=head;
		int count=0;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		return count;
	}
	//to insert a node at first of the linked list
	public Node insertFirst(Node head,int data) {
		Node temp=new Node(data);
	    temp.next=head;
	    head=temp;
	    printSLL(head);
	    return head;		
	}
	//to insert a node at the end of the linked list
	public Node insertLast(Node head,int data) {
		Node temp=new Node(data);
		Node current=head;
		while(current.next!=null) {
			current=current.next;
		}
		current.next=temp;
	    printSLL(head);
		return head;
	}
	//insert node at a given position assume that the first node position starts from 1
	public Node insertPosition(Node head,int data,int n) {
		Node temp=new Node(data);
		if(head==null) {
			return temp;
		}
		else if(n==1) {
			temp.next=head;
			head=temp;
			return head;
		}
		else {
			Node current=head;
			int i=2;
			while(i!=n) {
			    current=current.next;
				i=i+1;
			}
			temp.next=current.next;
		    current.next=temp;
		}
	    printSLL(head);
		return head;
	}
    //to delete first node of the linked list
	public Node deleteFirst(Node head) {
		if(head==null) {
			return null;
		}
		head=head.next;
		return head;
	}
	
	//to delete last node from the linked list
	public Node deleteLast(Node head) {
		if(head==null) {
			return null;
		}
		Node temp=head;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		temp.next=null;
		return head;
	}
	// to delete a node at a given position
	public Node deletePosition(Node head,int n) {
		if(head==null) {
			return null;
		}
		else if(n==1) {
			return null;
		}
		int i=2;
		Node temp=head;
		while(i!=n) {
			if(temp.next==null) {
				System.out.println("The positon is not valid:");
				return null;
			}
			temp=temp.next;
			i++;
		}
		temp.next=temp.next.next;
		return head;
		
	}
	//to search an element in a linked list.
	public void searchData(Node head,int data) {
		Node current=head;
		while(current!=null) {
			if(current.data==data) {
				System.out.println("The element is found");
				return;
			}
			current=current.next;
		}
	     System.out.println("Element not found");
	     return;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//assigning values to Single Linked list
		Creation sll=new Creation();
		sll.head=new Node(4);
		Node first=new Node(10);
		Node second=new Node(3);
		Node third=new Node(5);
		sll.head.next=first;
		first.next=second;
		second.next=third;
		sll.printSLL(sll.head);
	    System.out.println("The number of nodes in the single linked list: "+sll.findLength(sll.head));
	    sll.head=sll.insertFirst(sll.head, 2);
		sll.head=sll.insertLast(sll.head, 30);
		sll.head=sll.insertPosition(sll.head, 15, 4);
		sll.head=sll.deleteFirst(sll.head);
		sll.printSLL(sll.head);
		sll.head=sll.deleteLast(sll.head);
		sll.printSLL(sll.head);
		sll.head=sll.deletePosition(sll.head, 3);
		sll.printSLL(sll.head);
		sll.searchData(sll.head, 3);
		sll.searchData(sll.head, 8);
	}
}
