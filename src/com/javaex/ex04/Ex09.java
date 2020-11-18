package com.javaex.ex04;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean action = true;
		
		while(action) {
		
			System.out.println("숫자를 입력해주세요");
			int no = sc.nextInt();
			
			if(no==0) {
				System.out.println("종료");
				action=false;
				//break;
			}else if(no%3==0) {
				System.out.println("3의 배수입니다.");
			}else {
				System.out.println("3의 배수가 아닙니다.");
			}
			
		}
		
		sc.close();
	}

}
