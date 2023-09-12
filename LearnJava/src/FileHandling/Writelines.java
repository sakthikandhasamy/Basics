package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Writelines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileWriter fw=new FileWriter("//home//sakthipriya//Documents//file4.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write("Sakthi"+"\n");
			bw.write("Priya"+"\n");
			bw.write("saranya"+"\n");
			bw.close();
			System.out.println("success");		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
