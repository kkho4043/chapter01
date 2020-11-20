package com.javaex.ex02;

public class Ex01 {

	public static void main(String[] args) {
	
		int i = 2345;
		double d = 3.14;
		String str = "援용え�떇";
		char c = '아';
		String s = "�븳";
		
		String name = "�솴�씪�쁺";
	
		
		System.out.println("�븞�뀞�븯�꽭�슂.");
		System.out.println(str);
		
		System.out.print("�븞�뀞");
		System.out.print("�븯�꽭�슂!");
		System.out.println("11/11");
		
		System.out.println(2+5);
		System.out.println(i+i);
		
		System.out.println(i+d);
		
		double result = i+d;
		System.out.println(result);
		
		System.out.println(str+str+str);
		System.out.println(str+i);
		System.out.println(str+d);
		
		String result01 = str+d;  
		System.out.println(result01);
		
		//   援용え�떇 �옉 2345
		System.out.println(str +" �옉 "+ i);
		
		// �젣�씠由꾩� �솴�씪�쁺 �엯�땲�떎.
		System.out.println(name); //硫붾え由� 怨듦컙�쓽 �씠由�
		System.out.println("name"); // name 臾몄옄�뿴
		System.out.println("�젣�씠由꾩� name �엯�땲�떎.");
		System.out.println("�젣�씠由꾩� " + name + " �엯�땲�떎.");
		
		// char 
		System.out.println(c);
		System.out.println(c+c);
		System.out.println(c+s);
		
		//�븞�뀞�븯�꽭�슂
		System.out.println("�븞�뀞�븯�꽭�슂");
		
		// �븞�뀞"�븯"�꽭�슂
		System.out.println("�븞�뀞\"�븯\"�꽭�슂" );
		// �븞�뀞\�븯\�꽭�슂
		System.out.println("�븞�뀞\\�븯\\�꽭�슂");
		// �븞�뀞    �븯�꽭�슂
		System.out.println("�븞�뀞\t�븯�꽭�슂");
		
		// 以꾨컮轅�
		System.out.println("�븞�뀞\n�븯\n�꽭�슂");
		
		// 以꾨컮轅� 媛숈� �몴�쁽
		System.out.println("�븞�뀞");
		System.out.println("�븯");
		System.out.println("�꽭�슂");
		
	}

}
