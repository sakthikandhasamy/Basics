package com.basic.pkg;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1=100;
		int no2=60, small=0;
		if(no1<no2)
			small=no1;
		else
			small=no2;
		int div=2;
		while(div<=small)
		{
			if(no1%div==0 && no2%div==0)
		
		{
		System.out.println(div);
		}
			div++;
		}
		}
		
}
