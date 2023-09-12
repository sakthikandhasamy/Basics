package com.collection.pkg;

import java.util.ArrayList;

public class ArraytoCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		{
			int a[]= {5,91,100,1001,95};
			/*for(int i:a)//forward
			{
				al.add(i);
			}
			System.out.println(al);*/                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
			for(int i=0;i<a.length;i++)//backward
			{
				al.add(0,a[i]);
			}
			System.out.println(al);
			/*for(int i=0;i<al.size();i++)
			{
				System.out.println(al.get(i));
			}*/
		}

	}

}
