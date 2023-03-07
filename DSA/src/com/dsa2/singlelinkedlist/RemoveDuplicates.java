package com.dsa2.singlelinkedlist;


// to remove the consecutive duplicate values from the SLL 
public class RemoveDuplicates {
	     //Structure of sll
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
          //to remove the duplicates
           public Node removeDuplicates(Node head) {
        	   if(head==null) {
        		   return head;
        	   }
        	   Node current=head;
        	   while(current!=null && current.next!=null) {
        		   if(current.data==current.next.data) {
        			   current.next=current.next.next;
        		   }
        		   else {
        			   current=current.next;
        		   }
        	   }
        	   return head;
        	   
           }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 RemoveDuplicates sll=new RemoveDuplicates();
	        sll.head=new Node(4);
			Node first=new Node(10);
			Node second=new Node(4);
			Node third=new Node(5);
			sll.head.next=first;
			first.next=second;
			second.next=third;
			 
			Node a=new Node(5);
			Node b=new Node(5);
			Node c=new Node(10);
			Node d=new Node(8);
			third.next=a;
			a.next=b;
			b.next=c;
			c.next=d;

			//4 --> 10 --> 4 --> 5 --> null
			sll.printSLL(sll.head);
            sll.head=sll.removeDuplicates(sll.head);
            sll.printSLL(sll.head);

	}

}
