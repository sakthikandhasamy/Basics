package arrays;

import java.util.Scanner;

public class Arraydemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method 
		//System.out.println(args.length);
		Arraydemo ad=new Arraydemo();
		//ad.learning_1();
		//ad.learning_2();
		//ad.learning_3();
		//ad.learning_4();
		//ad.learning_5();
	//ad.learning_6();
	//	ad.learning_7();
	//ad.learning_8();
		//ad.learning_9();
		ad.learning10();
		
	
	}
	void learning10()
	{
		int a[]= {7,3,9,8,7};
		for(int i=a.length-1;i>=0;i--)
			System.out.print(a[i]+" ");
	}
	private void learning_9() { //frequency of each character
		// TODO Auto-generated method stub
		//char[]name= {'v','i','j','a','y'};
		//char[]name= {'n','a','t','a','r','a','j','a','n'};
	//	char[]name= {'a','n','a','n','d','h'};
		String s="sakthipriya";
		char[]name= s.toCharArray();
		int big=0;
		char c=' ';
		//char[]name= {'s','a','k','t','h','i','p','r','i','y','a'};
		for(int j=0;j<name.length;j++)
		{
		//boolean repeated=false;
	//System.out.println(name[j]);
		char ch=name[j];
		
	System.out.println(ch);
		
		int count=1;
		if(ch=='*')
			continue;
		for(int i=j+1;i<name.length;i++)
		{
			//System.out.println(name[i]);
			if(ch==name[i])
				
			{
				name[i]='*';
				count++;
			}
		}
//	if(count>1) 
		
		if(count>big)
		{
			big=count;
			c=ch;
		}
		System.out.println("count of "+ch+" is " +count);
		} 
		
		System.out.println("Most frquent letter is :"+c);
		System.out.println("It apperas for"+big+"times");
		
		
	}
	private void learning_8() { //first no repeated character
		// TODO Auto-generated method stub
		//char[]name= {'v','i','j','a','y'};
		//char[]name= {'n','a','t','a','r','a','j','a','n'};
		char[]name= {'a','n','a','n','d','h'};
		//char[]name= {'s','a','k','t','h','i','p','r','i','y','a'};
		for(int j=0;j<name.length;j++)
		{
		boolean repeated=false;
		char ch=name[j];
		if(ch=='*')
			continue;
		for(int i=j+1;i<name.length;i++)
		{
			if(ch==name[i])
			{
				name[i]='*';
				repeated=true;
				//break;
			}
		}
		if(repeated==false)
		{
			System.out.println("First non repeated character is: "+ch);
			break;
		}
		}
		
		
		
	}
	private void learning_7() { //first no repeated character
		// TODO Auto-generated method stub
		char[]name= {'v','i','j','a','y'};
		//char[]name= {'n','a','t','a','r','a','j','a','n'};
		//char[]name= {'a','n','a','n','d','h'};
		for(int j=0;j<name.length;j++)
		{
		boolean repeated=false;
		char ch=name[j];
		for(int i=j+1;i<name.length;i++)
		{
			if(ch==name[i])
			{
				repeated=true;
				break;
			}
		}
		if(repeated==false)
		{
			System.out.println("First non repeated character is: "+ch);
			break;
		}
		}
		
		
		
	}
	private void learning_6()//first repeated character
	{
		char [] name = {'p','r','a','k','a','s','h'};
		{
		  for (int j=0;j<name.length-1;j++)
		  { 
			  boolean repeated=false;
		   char ch = name[j];//
		  for (int i=j+1;i<name.length;i++)
		  {
		   if (ch==name[i])
		   {
		    System.out.println("First Repeated is "+ch);
		    repeated=true;
		    break;
		   }
		  }
		  if(repeated==false)
				System.out.println("No repeated character present");
			break;
		  
			}
	}
		}
	/*char [] name = {'p','r','a','k','a','s','s'};
	  for (int j=0;j<name.length-1;j++)
	  { 
	   char ch = name[j];//
	  for (int i =j+1;i<name.length;i++)
	  {
	   if (ch==name[i])
	   {
	    System.out.println("First Repeated is "+ch);
	    j =name.length;
	    break;
	   }
	  }*/
			
	private void learning_5() {
		// TODO Auto-generated method stub
		int[]ar= {5,-10,-20,30,-40,50};
		int count=0;
		for(int i=0;i<ar.length;i++)
		{
		
		//if(ar[i]<0 && ar[i]%20==0)//negative number print & divide  by 20
			//System.out.println(ar[i]);
			//if(ar[i]<0)//count of negative no	
			//count++;
			if(ar[i]<0 && i%2==0)//negative no even position
			System.out.println(ar[i]);
		
		}
		//System.out.println(count);
	}
	private void learning_4() {
		// TODO Auto-generated method stub
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		int scores[]= {45,200,69,99,189};
		int h=0, s=0;
		int lowest=Integer.MAX_VALUE;
		int second_lowest=Integer.MIN_VALUE;
		for(int i=0;i<scores.length;i++)//arr[1]
		{
			if(scores[i]>h)
			{
			//	s=h;
				h=scores[i];
			}
			else if(scores[i]>s)
			{
				s=scores[i];
			}
			
			
			if(scores[i]<lowest)
			{
				second_lowest=lowest;
				lowest=scores[i];
			}
			else if(scores[i]<second_lowest)
			{
				second_lowest=scores[i];
			}
		}
		System.out.println("Highest Score is : "+h);
		System.out.println("Second Highest Score is : "+s);
		System.out.println("lowest Score is : "+lowest);
		System.out.println("Second lowest Score is : "+second_lowest);
	}
		
	private void learning_3() {
		// TODO Auto-generated method stub
		int marks[]= {100,97,89,100,99};
		int count=0;
		for(int i=0;i<marks.length;i++)   
		{
			if(marks[i]==100)
				System.out.println(i);
			/*if(marks[i]==100)
				//count++;
			if(marks[i]>96)
				count++;*/
			
		}
		//System.out.println(count);
	}

	private void learning_2() {
		// TODO Auto-generated method stub
	
		int marks[]= {95,97,89,100,99};//array decleration
		int high=0, lowest=100;
		for(int i=0;i<marks.length;i++)
		{
			if(marks[i]>high)
			{
				high=marks[i];
			}
			if(marks[i]<lowest)
			{
				lowest=marks[i];
			}
		}
		System.out.println("Highest Score is"+high);
		System.out.println("Lowest Score is"+lowest);	
	}

	private void learning_1() {
		// TODO Auto-generated method stub
		
		int marks[]=new int[5];//array initialization
		int total=0,high=0,lowest=100;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Mark:");
		
		for(int i=0;i<marks.length;i++)
		{
		//System.out.println(marks.length);
			marks[i]=sc.nextInt();
			if(marks[i]>high)
			{
				high=marks[i];
			}
			if(marks[i]<lowest)
			{
				lowest=marks[i];
			}
	 //System.out.println(marks[i]);
		total=total+marks[i];
		
				
		//marks[i]=sc.nextInt();
		}
		sc.close();
		System.out.println("Total is:"+total);
		System.out.println("Percentage is:"+total/marks.length+"%");
		System.out.println("Highest Score is"+high);
		System.out.println("Lowest Score is"+lowest);
		
		
		
		/*marks[0]=96;
		marks[1]=74;
		marks[2]=56;
		marks[3]=89;
		marks[4]=92;*/
	//	for(int i=0;i<marks.length;i++)
		//{
			//System.out.println(marks[i]);
		//}
	
		
			
	}

}
