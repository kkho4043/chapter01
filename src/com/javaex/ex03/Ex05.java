package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		int pay; //급여 -->위에 선언한 이유 고민해볼것
		int unit = 10000;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("근무시간: ");
		
		int time = sc.nextInt();
		
		if(time>8) {
			//pay = 8*10000+(time-8)*12000;
			pay = 8*10000+(time-8)*((int)(10000*1.5));
			
			//pay = 8*unit+(time-8)*((int)(unit*1.5));
			
		}else {
			pay = time*10000;
			
			//pay = time*unit;
		}
		
		System.out.println("임금은" + pay + "입니다.");
		
		sc.close();
		
	}

}
