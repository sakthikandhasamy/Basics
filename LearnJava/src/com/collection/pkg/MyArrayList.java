package com.collection.pkg;

import java.util.ArrayList;

public class MyArrayList {//array

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(7);
		al.add("venkat");
		al.add("apple");
		al.add("blue");
		al.add(0.5);
		al.remove("venkat");
		al.remove(3);
		al.add("sakthi");
		al.add(0,"raja");
		al.add(1,"raja");
	
		System.out.println(al);
	}
	

}
