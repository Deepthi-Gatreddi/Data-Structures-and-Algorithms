package com.dsa2.singlelinkedlist;
//To delete a given Node


public class DeleteGivenNode {
	  private Node head;
      public static class Node{
    	  private int data;
    	  private Node next;
    	  public Node(int data) {
    		  this.data=data;
    		  this.next=null;

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
      public Node deleteGivenNode(Node head,int data) {
    	  Node current=head;
    	  Node temp=null;
    	  if(current!=null && current.data==data) {
    		  head=current.next;
    		  return head;
    	  }
    	  while(current!=null && current.data!=data) {
    		  temp=current;
    		  current=current.next;
    	  }
    	  if(current==null) {
    		  System.out.println("Entered Node is not present in  the Single Linked list.");
    	            return head;
    	  }
    	  else {
    	  temp.next=current.next;
    	      System.out.println("The element is deleted succesfully.");
    	     return head;
      }
    	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 DeleteGivenNode sll=new DeleteGivenNode();
	      sll.head=new Node(4);
			Node first=new Node(10);
			Node second=new Node(12);
			Node third=new Node(14);
			sll.head.next=first;
			first.next=second;
			second.next=third;
			sll.printSLL(sll.head);
			sll.head=sll.deleteGivenNode(sll.head,12);
			sll.head=sll.deleteGivenNode(sll.head,30);
			sll.printSLL(sll.head);
        	  
	}

}
