package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력하세요");
		System.out.print("단: ");
		
		//단입력
		int dan = sc.nextInt();
		
		int i = 1; //초기값
		
		while( i<=9  ) {   // 조건식           i<10;  경계값 주의할것
			System.out.println(dan + "*" + i + "=" + dan*i);
						
			i++; //증감식
		}
		
		
		sc.close();
		
	}

}
