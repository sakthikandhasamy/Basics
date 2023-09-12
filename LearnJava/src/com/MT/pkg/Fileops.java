package com.MT.pkg;

import java.io.File;

public class Fileops {

	public static void main(String[] args) {
		//File f=new File("//home//sakthipriya//Documents//newsakthi");
		File f=new File("//home//sakthipriya//Documents");
		// TODO Auto-generated method stub
		//f.mkdir();
		File fi[] = f.listFiles();
		for(File i:fi)
		{
			System.out.println(i);
		//	System.out.println(i.isFile());
			//System.out.println(i.isDirectory());
			//System.out.println(i.canWrite());
			//System.out.println(i.canRead());
			//System.out.println(i.canExecute());
		}

	}

}
