package com.dsa1.array;
//Move zeroes to the end of the array
public class Zeroes {
	//to print given array
		public void printArray(int arr[], int len) {
			for (int i = 0; i < len; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	 //to move zeroes end of the array
	  public int[] endZeroes(int arr[]) {
		  int j=0; // to represent zeroes
		  for(int i=0;i<arr.length;i++) {
			  if(arr[i]!=0 && arr[j]==0) {
				  arr[j]=arr[i];
				  arr[i]=0;
			  }
			  if(arr[j]!=0)
				  j++;
		  }
		  return arr;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,3,0,5,6,0,5,1,2};
		Zeroes obj=new Zeroes();
		obj.printArray(arr, arr.length);
		arr=obj.endZeroes(arr);
		System.out.println("After moving Zeroes to end of the array");
		obj.printArray(arr, arr.length);

	}

}
