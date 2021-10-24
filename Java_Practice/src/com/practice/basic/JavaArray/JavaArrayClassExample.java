package com.practice.basic.JavaArray;

public class JavaArrayClassExample {

	public static void main(String args[]) {
		int arr[] = new int[5];
		for(int i=0; i<5; i++) {
			arr[i] = i*100;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr[" + i + "] "  + arr[i]);
		}
		arr[0]=10;  
		arr[1]=20;  
		arr[2]=70;  
		arr[3]=40;  
		arr[4]=50;
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr[" + i + "] "  + arr[i]);
		}
		int arr1[] = {33,3,4,5};//declaration, instantiation and initialization 
		for(int i=0; i<arr1.length; i++) {
			System.out.println("arr1[" + i + "] "  + arr1[i]);
		}
		
		arr1 = new int[] {10,20,30,40,50,60};
		
		for(int a : arr1) {
			System.out.println(a);
		}
		
		for(int a : printArray(arr1)) {
			System.out.println(a);
		}
		
		for(int a : printArray(new int[] {10,20,30,40,50})) {
			System.out.println(a);
		}
		
		System.arraycopy(arr, 0, arr1, 1, 5);
		
		for(int a : arr1) {
			System.out.println(a);
		}
		
		int arr2[] = arr1.clone();
		
		for(int a : arr2) {
			System.out.println(a);
		}
	}
	
	public static int[] printArray(int[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.println("a[" + i + "] "  + a[i]);
		}
		return new int[] {60,70,80,90,100};
	}
}
