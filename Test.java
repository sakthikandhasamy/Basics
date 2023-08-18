package com.basic.pkg;

public class Test {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Y y=new Y();
		System.out.println(y.a);
		System.out.println(X.b);
		y.m();
		X.n();

	}

}
class X {
	int a=1;
	static int b=2;
	void m() {
		System.out.println("I");
		
	}
	static void n()
	{
		System.out.println("J");
	}
}
class Y extends X{

	public Y() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
