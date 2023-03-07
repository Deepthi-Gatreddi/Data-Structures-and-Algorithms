package com.dsa2.singlelinkedlist;

public class RemoveLoop {
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
     public void removeLoop(Node head) {
    	 Node fastPtr=head;
    	 Node slowPtr=head;
    	 while(fastPtr!=null && fastPtr.next!=null) {
    		 fastPtr=fastPtr.next.next;
    		 slowPtr=slowPtr.next;
    		 if(slowPtr==fastPtr)
    			 removingLoop(slowPtr);
    	 }
     }
     //to print the sll
     public void printSLL(Node head) {
   	   Node temp=head;
   	   while(temp!=null) {
   		   System.out.print(temp.data+" ---> ");
   		   temp=temp.next;
   	   }
   	   System.out.print("null");
   	   System.out.println("");;
   	}
     private void removingLoop(Node slowPtr) {
    	 Node temp=head;
    	 while(temp.next!=slowPtr.next) {
    		 temp=temp.next;
    		 slowPtr=slowPtr.next;
    	 }
    	 slowPtr.next=null;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveLoop sll=new RemoveLoop();
		sll.head=new Node(4);
		Node first=new Node(10);
		Node second=new Node(12);
		Node third=new Node(14);
		sll.head.next=first;
		first.next=second;
		second.next=third;
		third.next=second;
		sll.removeLoop(sll.head);
		sll.printSLL(sll.head);
		
	}

}
