package com.dsa2.singlelinkedlist;

public class MergeTwoSortedSLL {
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
    public static Node merge(Node list1,Node list2) {
    	 Node dummy=new Node(0);
    	 Node tail=dummy;
    	 while(list1!=null && list2!=null) {
    		 if(list1.data<=list2.data) {
    			 tail.next=list1;
    			 list1=list1.next;
    		 }else {
    			 tail.next=list2;
    			 list2=list2.next;
    		 }
    		 tail=tail.next;
    	 }
    	 if(list1==null) {
    		 tail.next=list2;
    	 }else {
    		 tail.next =list1;
    	 }
    	 return dummy.next;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeTwoSortedSLL sll1=new MergeTwoSortedSLL();
		sll1.head=new Node(4);
		Node first=new Node(10);
		Node second=new Node(12);
		Node third=new Node(14);
		sll1.head.next=first;
		first.next=second;
		second.next=third;
		MergeTwoSortedSLL sll2=new MergeTwoSortedSLL();
		sll2.head=new Node(3);
		first=new Node(8);
		second=new Node(12);
		third=new Node(16);
		sll2.head.next=first;
		first.next=second;
		second.next=third;
		System.out.println("1st Linked List");
	    sll1.printSLL(sll1.head);
	    System.out.println("2nd Linked List");
	    sll2.printSLL(sll2.head);
	    sll1.head=sll1.merge(sll1.head, sll2.head);
	    System.out.println("Merged sorted linked list");
	    sll1.printSLL(sll1.head);
	}

}
