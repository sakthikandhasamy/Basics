package com.MT.pkg;

public class Confusion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println(010);//8->octal
		System.out.println(0x13);//19->hexadecimal
		System.out.println(0xA);//10
		System.out.println(0b1000);//8->binary
		System.out.println(0B100);//4*/
		/*for(int i=0;i<=100;i++)
		{
			System.out.print(i+"\t");
			System.out.print(Integer.toBinaryString(i)+"\t");
			System.out.print(Integer.toOctalString(i)+"\t");
			System.out.println(Integer.toHexString(i));*/
			//o->octal
			//ob or Ob->binary
			//ox or oX->hexa
			//decimal
		//}
		String s=new String("java");
		String ss="java";
		System.out.println(s==ss);//compare memory location
		System.out.println(s.equals(ss));//compare two character seq

	}

}
