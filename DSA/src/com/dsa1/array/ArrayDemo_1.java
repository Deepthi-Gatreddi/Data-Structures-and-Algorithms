package com.dsa1.array;
// it is just to know how to create array and how to insert elements to it and how to print the elements of an array
public class ArrayDemo_1 {
         public void printArray(int arr[],int len) {
        	 for(int i=0;i<len;i++) {
        		 System.out.print(arr[i]+" ");
        	 }
        	 System.out.println();
         }
         public void arraydemo() {
        	int myArray[]=new int[5];
     		myArray[1]=3;
     		myArray[4]=5;
     		myArray[4]=6;
     		printArray(myArray,myArray.length);
     		int arr[]= {3,4,5,0,2};
     		printArray(arr,arr.length);
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDemo_1 memory=new ArrayDemo_1();
		memory.arraydemo();
	}

}
