package com.dsa1.array;
//finding a missing number in an array where the elements are in a range of 1-n
//here we use the formula sum of n natural numbers
public class FindMissNum {
    public int missingNum(int arr[]) {
    	int n=arr.length+1;
    	n=(n*(n+1))/2;
    	for(int i=0;i<n;i++) {
    		n=n-arr[i];
    	}
    	return n;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,4,1,8,6,3,7};
		FindMissNum obj=new FindMissNum();
		System.out.println("The missing number in the given array is : "+obj.missingNum(arr));
	}

}
