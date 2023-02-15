package com.dsa1.array;

//To remove Even Integers from a given array.
public class RemoveEvenIntegers {
	//to print given array
	public void printArray(int arr[], int len) {
		for (int i = 0; i < len; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
    //returns array by removing the even numbers
	public int[] removeEven(int arr[]) {
		int oddCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2 != 0) {
				oddCount++;
			}
		}
		int temp[] = new int[oddCount];
		int l = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2 != 0) {
				temp[l] = arr[i];
				l++;
			}
		}
		return temp;

	}

	public static void main(String[] args) {
			int arr[]= {4,5,6,3,3,1,4};
			RemoveEvenIntegers obj=new RemoveEvenIntegers();
			obj.printArray(arr, arr.length);
			arr=obj.removeEven(arr);
			obj.printArray(arr, arr.length);
		}
}
