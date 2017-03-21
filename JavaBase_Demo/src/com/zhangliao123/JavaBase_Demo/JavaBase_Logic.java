package com.zhangliao123.JavaBase_Demo;

import java.io.PrintStream;

public class JavaBase_Logic {

	public static void main(String[] args) {

		PrintStream prt = System.out;
/*//三元运算符		
		int i = 5;
		int j = 6;
		String result = i > j ? "i > j " : "i < j";
		prt.println(result);
		
//类型转换符
		
		//char a = 'a';
		long b = 5581545;
		short c;
		c = (short) b;
		prt.println(c);
		
//递增递减运算符
		
		int a1 = 5;
		int b1 = 6;
		int c;
		int c1,c2;
		c = a1++;
		System.out.println("a1++初始值："+ c);
		c1 = b1 + a1;
		System.out.println("c1初始值："+ c1);
		System.out.println("a1++运算后值：" + c);
		
		++a1;
		System.out.println("++a1初始值：" + a1);
		c2 = b1 +a1;
		System.out.println("c2值：" + c2);
		System.out.println("运算后++a1值：" + a1);
		
		
		
//字符串
		
		String address1 = "Anhui";
		String address2  = "Hefei";
		int code = 5;
		String result = address1 + " " + address2 + " " + code + " 号";
		System.out.println("result:" + result);	
		
		int a; int b;
		a = 2; b = a++;
		//a = 2; b = ++a;
		System.out.println(a);
		System.out.println(b);
		
		int f = 703;
		byte b1;
		b1 = (byte)f;
		System.out.println(b1);*/
		
		
	     int a = 10;
	     int b = 20;
	     int c = 25;
	     int d = 25;
	     System.out.println("a + b = " + (a + b) );
	     System.out.println("a - b = " + (a - b) );
	     System.out.println("a * b = " + (a * b) );
	     System.out.println("b / a = " + (b / a) );
	     System.out.println("b % a = " + (b % a) );
	     System.out.println("c % a = " + (c % a) );
	     System.out.println("a++   = " +  (a++) );
	     System.out.println("a--   = " +  (a--) );
	     // 查看  d++ 与 ++d 的不同
	     System.out.println("d++   = " +  (d++) );
	     System.out.println("++d   = " +  (++d) );
	}

}
