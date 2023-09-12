package FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class Readcontent {
void try1()//to count space and no of words
{	
		String s="";
		int count=0;
		try
		{
			FileReader fr=new FileReader("//home//sakthipriya//Documents//newcontent//file1.txt");
			int i=0;
			while((i=fr.read())!=-1)
			{
				//System.out.println((char)i);
				s=s+(char)i;
				if(i==' ')
				{
					count++;
				}
				
			}	
			
			fr.close();
		}
		catch(IOException e)
		{
			System.out.println("check code");
		}
		System.out.print(s);
		System.out.print(count);
	
}

void try2()//to count character
{	
		String s="";
		int count=0;
		try
		{
			FileReader fr=new FileReader("//home//sakthipriya//Documents//newcontent//file1.txt");
			int i=0;
			
			while((i=fr.read())!=-1)
			{
				//System.out.println((char)i);
				s=s+(char)i;
			if((i!=' ') &&(i!='.'))
					
					count++;
				
				
			}	
			
			fr.close();
		}
		catch(IOException e)
		{
			System.out.println("check code");
		}
		System.out.print(s);
		System.out.print(count);
	
}

void try3()//to count vowels
{	
		String s="";
		int count=0;
		try
		{
			FileReader fr=new FileReader("//home//sakthipriya//Documents//newcontent//file1.txt");
			int i=0;
			
			while((i=fr.read())!=-1)
			{
				//System.out.println((char)i);
				s=s+(char)i;
				//char ch=(char)i;
			if((i=='a')||(i=='e')||(i=='i')||(i=='o')||(i=='u')||(i=='A')||(i=='E')||(i=='I')||(i=='O')||(i=='U'))
					
					count++;	
				
			}	
			
			fr.close();
		}
		catch(IOException e)
		{
			System.out.println("check code");
		}
		System.out.print(s);
		System.out.print(count);
	
}
void try4()//to count consonants
{	
		String s="";
		int count=0;
		try
		{
			FileReader fr=new FileReader("//home//sakthipriya//Documents//newcontent//file1.txt");
			int i=0;
			
			while((i=fr.read())!=-1)
			{
				//System.out.println((char)i);
				s=s+(char)i;
				//char ch=(char)i;
			if((i!='a')&&(i!='e')||(i!='i')||(i!='o')||(i!='u'))
					
					count++;		
			}	
			
			fr.close();
		}
		catch(IOException e)
		{
			System.out.println("check code");
		}
		System.out.print(s);
		System.out.print(count);
	
}



	


	


public static void main(String[] args) {
	// TODO Auto-generated method stub
	Readcontent rr=new Readcontent();
	//rr.try1();
	//rr.try2();
	//rr.try3();
	rr.try4();
}
}

