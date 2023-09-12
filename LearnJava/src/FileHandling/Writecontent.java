package FileHandling;

import java.io.FileWriter;

public class Writecontent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileWriter fw=new FileWriter("//home//sakthipriya//Documents//file3.txt",true);
			String s="Java is supercool language. and oops concept";
			fw.write(s);
			fw.flush();
			fw.close();		
			System.out.println("success");
			}
		catch (Exception e)
		{
			System.out.println(e);
		}

	}

}
