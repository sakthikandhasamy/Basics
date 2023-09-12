package arrays;

public class Arraytry {
	void try1()//forward traverse
	{
	int a[]= {14,7,9,4,6};
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	}
	void try2()//backward traverse
	{
		int a[]= {14,7,9,4,6};
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	}
	void try3()//linear search
	{
		int a[]= {14,7,9,4,6};
		int key=9;
		for(int i=0;i<a.length;i++)
		{
		if(key==a[i]) {
			System.out.println(a[i]+" key is present");
		}
			else 
				System.out.println(" key is not present");
		}
		}
	void try4()//search and replace
	{
	int a[]= {14,7,9,4,6};
	int key=9;
	int replace=5;
	for(int i=0;i<a.length;i++)
	{
		if(key==a[i])
		{
			a[i]=replace;
		}
		System.out.println(a[i]);
	}
	
	}
	void try5()//linear search
	{
		int a[]= {9,14,7,9,9,4,6};
		int key=9;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
		if(key==a[i]) 
		{
			System.out.println(a[i]+" key is present");
			count++;
		}	
		}
		System.out.println(count);
	}
		
	void try6()//first , last, middle
	{
		int a[]= {14,7,9,4,3,6};
		System.out.println("First element : "+a[0]);
		System.out.println("Last element : "+a[a.length-1]);
		if(a.length%2==0)
		{
			System.out.println("Middle element : "+a[a.length/2]);
		}
		else
			System.out.println("Middle element : "+a[a.length/2]);
			System.out.println("First element : "+a[a.length/2-1]);
	}
	void try7() 
	{
		String s="sakthi";
		char c[]=new char[(s.length())];
		for(int i=0;i<s.length();i++)
		{
			c[i]=s.charAt(i);
		
			
			System.out.print(c[i]);
			
		}
		
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arraytry a=new Arraytry();
		//a.try1();
		//a.try2();
		//a.try3();
		//a.try4();
		//a.try5();
		//a.try6();
		a.try7();
	}

}
