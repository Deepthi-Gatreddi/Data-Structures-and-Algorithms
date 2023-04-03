package com.dsa2.singlelinkedlist;


//Insert a Node in a sorted single linked list
public class InsertNodeInSLL {
	  private Node head;
      private static class Node{
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
      
      public Node insertInSSLL(Node head,int data) {
    		 Node newnode=new Node(data);
    	  if(head==null) {
    		  return newnode;
    		  
    	  }
    	  else {
    		  Node current =head;
    		  while(current!=null && current.next.data<newnode.data) {
    			  current=current.next;
    	  }
    	  newnode.next=current.next;
    	  current.next=newnode;
    	  }
    	  return head;
      }



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 InsertNodeInSLL sll=new InsertNodeInSLL();
	      sll.head=new Node(4);
			Node first=new Node(10);
			Node second=new Node(12);
			Node third=new Node(14);
			sll.head.next=first;
			first.next=second;
			second.next=third;
			sll.printSLL(sll.head);
			sll.head=sll.insertInSSLL(sll.head, 11);
			sll.printSLL(sll.head);
			
}
}
