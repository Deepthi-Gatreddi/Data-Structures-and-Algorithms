package com.dsa2.singlelinkedlist;


public class ReverseSLL {
    private Node head;
    private static class Node {
    	private int data;
    	private Node next;
    	public Node(int data) {
    		this.data=data;
    		this.next=null;
    	}
    }
    public void printSLL(Node head) {
 	   Node temp=head;
 	   while(temp!=null) {
 		   System.out.print(temp.data+" ---> ");
 		   temp=temp.next;
 	   }
 	   System.out.print("null");
 	   System.out.println("");;
 	}
 	
    public Node reverseSLL(Node head) {
    	Node current=head;
    	head=head.next;
    	if(head==null) {
    		return null;
    	}
    	current.next=null;
    	Node rsll=current;
    	while(head!=null) {
    		current=head;
    		head=head.next;
    		current.next=rsll;
    		rsll=current;
    	}
    	return rsll;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseSLL rsll=new ReverseSLL();
		rsll.head=new Node(2);
		Node n=new Node(3);
		Node m=new Node(4);
		Node k=new Node(100);
		rsll.head.next=n;
		n.next=m;
		m.next=k;
		rsll.printSLL(rsll.head);
		rsll.head=rsll.reverseSLL(rsll.head);
		rsll.printSLL(rsll.head);
         
	}

}
