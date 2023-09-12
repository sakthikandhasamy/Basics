package com.collection.pkg;

import java.util.LinkedHashSet;

public class CollectiontoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("Abc");
		lhs.add(5);
		lhs.add(75.75);
		lhs.add("IJK");
		lhs.add(true);
		lhs.add('Q');
		System.out.println(lhs);
		Object o[]=lhs.toArray();//Hetrogeneous Array->object[]->always as using object 
		//because object is parent for all so object as to accomtate both string,array
		for(Object i:o) {
			System.out.println(i);
		}

	}

}
