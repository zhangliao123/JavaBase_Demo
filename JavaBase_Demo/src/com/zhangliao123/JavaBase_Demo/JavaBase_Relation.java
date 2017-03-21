package com.zhangliao123.JavaBase_Demo;

import java.io.PrintStream;

public class JavaBase_Relation {

	public static void main(String[] args) {
		
		PrintStream prt = System.out;
/*//数值及字符比较		
		int a = 5;
		int b = 3;
		
		char a1 = 'a';
		char b1 = 'b';
		
		String a2 = "Hefei";
		String b2 = "Anhui";
		
		System.out.println(a > b);
		System.out.println(a1 > b1);
		//System.out.println(a2 > b2);
*/		
		
		int a = 5;
		int b = 6;
		
		prt.println("a==b:"+(a==b));
		prt.println("a!=b:"+(a!=b));
		prt.println("a>=b:"+(a>=b));
		prt.println("a<=b:"+(a<=b));
		prt.println("a>b:"+(a>b));
		prt.println("a<b:"+(a<b));

	}

}
