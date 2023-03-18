package com.dsa2.singlelinkedlist;


public class DetectLoop {
	 private Node head;
     public static class Node{
   	  private int data;
   	  private Node next;
   	  public Node(int data) {
   		  this.data=data;
   		  this.next=null;

         }
	}
     //don't print the loop because we created a looped structure so it will continuously print the values
     public boolean containLoop(Node head) {
    	 Node fastPtr=head;
    	 Node slowPtr=head;
    	 while(fastPtr!=null && fastPtr.next!=null) {
    		 fastPtr=fastPtr.next.next;
    		 slowPtr=slowPtr.next;
    		 if(slowPtr==fastPtr)
    			 return true;
    	 }
    	 return false;
     }
     

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DetectLoop sll=new DetectLoop();
		  sll.head=new Node(4);
			Node first=new Node(10);
			Node second=new Node(12);
			Node third=new Node(14);
			sll.head.next=first;
			first.next=second;
			second.next=third;
			third.next=second;
			System.out.println("The linked list contains loop is a "+sll.containLoop(sll.head)+" statement");

	}

}
