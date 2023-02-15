package com.dsa1.array;

public class MinimumValue {
	//to print given array
		static void printArray(int arr[], int len) {
			for (int i = 0; i < len; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	 //to find minimum element
		static int minEle(int arr[]) {
			int min=arr[0];
			for(int i=1;i<arr.length;i++) {
				if(arr[i]<min)
					min=arr[i];
			}
			return min;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,4,6,4,3,1};
		MinimumValue.printArray(arr, arr.length);
		System.out.println("The Minimum Element in the above array is : "+MinimumValue.minEle(arr));

	}

}
