package com.dsa1.array;

public class SecondMaxValue {
    public int secondMax(int arr[]) {
    	int second=Integer.MIN_VALUE;
    	int max=Integer.MIN_VALUE;
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i]>max) {
    			second=max;
    			max=arr[i];
    		}
    		else if(arr[i]>second && arr[i]!=max){
    			second=arr[i];
    		}
    	}
    	return second;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]= {2,3,4,5,6,7,4,310,9};
       SecondMaxValue obj=new SecondMaxValue();
       System.out.println("The Second Maximum element in the array is : "+obj.secondMax(arr));
	}

}
