package com.collection.pkg;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ToRemoveDupInlist {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(7);
		al.add("apple");
		al.add("blue");
		al.add(7);
		al.add(0.5);
		al.add("sakthi");
		al.add(0,"raja");
		al.add("blue");
		al.add("apple");
		al.add("sakthi");
		System.out.println(al);
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.addAll(al);
		System.out.println(lhs);
		

	}

}
