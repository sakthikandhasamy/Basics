package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class Readlines {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lcount=0;
		String s="";
	
		try
		{
		
		FileReader fr=new FileReader("//home//sakthipriya//Documents//newcontent//file2.txt");
		
		BufferedReader br= new BufferedReader(fr);
		while(br.ready())
			s=s+br.readLine()+"\n";
		lcount=lcount+1;
			
		{
			//System.out.println(br.readLine());			
	}
		fr.close();
		br.close();
		}
		catch(Exception e)
		{
			System.out.println("check code");
		}
		System.out.println(s);
		System.out.println(lcount);
}
}
