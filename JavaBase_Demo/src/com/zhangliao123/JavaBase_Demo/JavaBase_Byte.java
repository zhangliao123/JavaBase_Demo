package com.zhangliao123.JavaBase_Demo;

import java.io.PrintStream;

public class JavaBase_Byte {

	public static void main(String[] args) {
		
		PrintStream prt = System.out;
		
		int a = 3;
		int b = 0x55;
		
		prt.println(a^b);
		prt.println(a|b);
		prt.println(a&b);
		prt.println(~a);
		prt.println(a<<2);
		prt.println(a>>>1);
		prt.println(a^=2);
		

	}

}
