package com.dsa2.singlelinkedlist;


//given two non-empty linked lists representing two non negitive integers the digits are
//stored in reverse order and each of their nodes contains a single digit. 
//Add the two numbers and return the sum as a linked list you may assume the two 
//		numbers do not contain any leading zero except the number itself.
public class AddTwoSLL {
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
    public static Node add(Node list1,Node list2) {
    	Node dummy=new Node(0);
    	Node tail=dummy;
    	int carry=0;
    	while(list1!=null || list2!=null) {
    		int x=(list1!=null) ? list1.data:0;
    		int y=(list2!=null) ? list2.data:0;
    		int sum=carry+x+y;
    		carry=sum/10;
    		tail.next=new Node(sum%10);
    		tail=tail.next;
    		if(list1!=null)
    			list1=list1.next;
    		if(list2!=null)
    			list2=list2.next;
    	}
    	if(carry>0) {
    		tail.next=new Node(carry);
    	}
    	return dummy.next;
    }
    public static void main(String[] args) {
    	AddTwoSLL sll1=new AddTwoSLL();
		sll1.head=new Node(4);
		Node first=new Node(3);
		Node second=new Node(2);
		sll1.head.next=first;
		first.next=second;
		AddTwoSLL sll2=new AddTwoSLL();
		sll2.head=new Node(6);
		first=new Node(1);
		sll2.head.next=first;
		System.out.println("1st Linked List");
	    sll1.printSLL(sll1.head);
	    System.out.println("2nd Linked List");
	    sll2.printSLL(sll2.head);
	    sll1.head=sll1.add(sll1.head, sll2.head);
	    System.out.println("After adding the number is :");
	    sll1.printSLL(sll1.head);
	}
}
