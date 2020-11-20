package com.javaex.ex05;

public class Ex03 {
	public static void main(String[] args) {
		int[] intArray = new int[5];
		
		for(int i = 0; i <5;i++) {
			intArray[i] =  (int)(Math.random()*45)+1;
		}
		
		for(int i = 0; i < intArray.length;i++) {
			System.out.println(intArray[i]);
		}
	}
}
