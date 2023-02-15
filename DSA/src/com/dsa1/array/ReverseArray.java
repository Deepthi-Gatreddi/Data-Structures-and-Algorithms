package com.dsa1.array;
//to reverse the elements of an array
public class ReverseArray {
	//to print given array
		public void printArray(int arr[], int len) {
			for (int i = 0; i < len; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
		public int[] reverse(int arr[]) {
			int start=0;
			int end=arr.length-1;
			int temp;
			while(start<end) {
				temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				start++;
				end--;
			}
			return arr;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,5,3,48,9,34,6,5,4};
		ReverseArray obj=new ReverseArray();
		obj.printArray(arr, arr.length);
		arr=obj.reverse(arr);
		obj.printArray(arr, arr.length);
	}

}
