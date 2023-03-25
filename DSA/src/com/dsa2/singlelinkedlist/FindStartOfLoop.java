package com.dsa2.singlelinkedlist;

import com.dsa2.singlelinkedlist.DetectLoop.Node;

public class FindStartOfLoop {
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
     public Node containLoop(Node head) {
    	 Node fastPtr=head;
    	 Node slowPtr=head;
    	 while(fastPtr!=null && fastPtr.next!=null) {
    		 fastPtr=fastPtr.next.next;
    		 slowPtr=slowPtr.next;
    		 if(slowPtr==fastPtr)
    			 return getStartingNode(slowPtr);
    	 }
    	 return null;
     }
     private Node getStartingNode(Node slowPtr) {
    	 Node temp=head;
    	 while(temp!=slowPtr) {
    		 temp=temp.next;
    		 slowPtr=slowPtr.next;
    	 }
    	 return temp;
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindStartOfLoop sll=new FindStartOfLoop();
		  sll.head=new Node(4);
			Node first=new Node(10);
			Node second=new Node(12);
			Node third=new Node(14);
			sll.head.next=first;
			first.next=second;
			second.next=third;
			third.next=second;
			Node loop=sll.containLoop(sll.head);
			System.out.println(loop.data);
		
	}

}
