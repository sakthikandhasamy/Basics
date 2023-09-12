package com.collection.pkg;

import java.util.LinkedList;

public class MyLinkedlist {//double linked list

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();//creating
		ll.add(7);//adding
		ll.add("vignesh");
		ll.add("orange");
		System.out.println(ll.contains("orange"));
		System.out.println(ll.contains("black"));
		ll.add("pink");
		ll.add(0.7);
		//System.out.print(ll.size());
		ll.remove("pink");
		ll.add(0,"raja");
		
		
		ll.remove(2);
		ll.add("maha");
		System.out.println(ll.get(4));
		System.out.println(ll.indexOf(7));
		System.out.println(ll.set(1, 3));
		System.out.print(ll.size());
		System.out.println(ll);//printing
	}
}
