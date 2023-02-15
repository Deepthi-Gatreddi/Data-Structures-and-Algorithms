package com.dsa1.array;
//resizing array with the user wanted size
public class ResizeArray {
	public int[] resizeArray(int arr[],int size) {
		int temp[]=new int[size];
		for(int i=0;i<arr.length;i++) {
			temp[i]=arr[i];
		}
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {3,4,5,6,7};
      try {
    	  arr[5]=9;
      }catch(ArrayIndexOutOfBoundsException e) {
    	  System.out.println(e);
      }finally {
      ResizeArray obj=new ResizeArray();
      arr=obj.resizeArray(arr, 6);
      arr[5]=9;
      System.out.println("After increasing the size of Array:");
      System.out.println(arr[5]);
      }
	}

}
