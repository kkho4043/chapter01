package com.javaex.ex05;

public class Ex08 {
	public static void main(String[] args) {
		int[] leftArray = new int[] {10,30,30};
		int[] rightArray = new int[] {5,20,30 ,40};
		
		
		if(leftArray.length == rightArray.length) {
			for(int i = 0;i<leftArray.length;i++) {
				if(leftArray[i] != rightArray[i]) {
					System.out.println(i + " ��° ���� �ٸ��ϴ�.");
				}
			}
		}else {
			System.out.println("�ι迭�� ũ�Ⱑ �ٸ��ϴ�");
		}
	}
}
