package FileHandling;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

class A extends Thread {
	
	public synchronized void run() {
		try
		{
		
		FileReader fr=new FileReader("//home//sakthipriya//Documents//file5.txt");
		
		BufferedReader br= new BufferedReader(fr);
		while(br.ready())
		{
			System.out.println(br.readLine());			
	   }
		fr.close();
		br.close();
		}
		catch(Exception e)
		{
			System.out.println("check code");
		}
	}
}
class B extends Thread {
	public synchronized void run() {
		try {
			sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try
		{
			FileWriter fw=new FileWriter("//home//sakthipriya//Documents//file5.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write("java is a Object Oriented Programming Language"+"\n"+"java is Supercool language"
			+"\n"+"java is parallel processing"+"\n");
			bw.write("java is parallel processing"+"\n");
			bw.write("java is Robust"+"\n");
			bw.write("java is Secured"+"\n");
			bw.write("java is case sensitive"+"\n");
			bw.write("java is platform independence"+"\n");
			bw.write("java is free for all"+"\n");
			bw.write("java memory managemnt is automated"+"\n");
			bw.write("java slogan write once run anywhrer"+"\n");
			System.out.println("sucess");
			bw.close();	
			fw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
}
}


		public class Filehw {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			A a = new A();
			a.start();
			B b = new B();
			b.start();
			
		}

	}


