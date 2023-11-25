package arrays;

import java.util.Scanner;

public class Arraytry {
	
	void try1()//forward traverse
	{
		int ar[]= {2,4,7,8,9};
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		
	}
	void try2()//backward traverse
	{
		int ar[]= {2,4,7,8,9,8};
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.print(ar[i]+" ");
		}
	}
	void try3()//linear search
	{
		int ar[]= {5,23,12,89,99};
		int key=99;
		int i;
		for(i=0;i<ar.length;i++)
		{
			if(key==ar[i])
			{
				System.out.println(key+ " element is present at "+i+" position");
				break;
			}
			
		}
		if(i==ar.length)
		{
			System.out.println(key+ " element is not present");
		}
	}
	void try4()//first,last,mid element
	{
		int ar[]= {5,8,9,67,89,78};
		System.out.println("First element "+ar[0]);
		System.out.println("Last element "+ar[ar.length-1]);
		if(ar.length%2==0)
		{
			System.out.println("middle element "+ar[ar.length/2]);
			System.out.println("middle element "+ar[ar.length/2-1]);
			
		}
		else
			System.out.println("middle element "+ar[ar.length/2]);
		
	}
	void try5()//finding index of a given no
	{
		int ar[]= {6,8,89,90,99};
		int no;
		int i;
		System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		no=sc.nextInt();
		for(i=0;i<ar.length;i++)
		{
			
			if(no==ar[i])
			{
				System.out.println("Index value of given no is "+i);
				break;
			}
		}
			
		if(i==ar.length)	
		{
			System.out.println("Element not present");
		}
		
	}
	void try6()//Removing given no from array
	{
		int ar[]= {12,34,67,89,90};
		int val=89;
		for(int i=0;i<ar.length;i++)
		{
			if(val!=ar[i])
			{
				System.out.println(ar[i]);
				
			}
			
		}	
	}
	void try7()//placing given no in last index of given array
	{
		int[] arr = {1, 2, 3, 4, 5};
	    int numberToAdd = 6; // The number you want to add
	    
	    // Create a new array with a size one greater than the original array
	    int[] newArr = new int[arr.length + 1];
	    
	    // Copy the elements from the original array to the new array

	    for (int i = 0; i < arr.length; i++)
	    	{
	        newArr[i] = arr[i];
	        }
	    
	    
	    // Add the given number to the last index of the new array
	    newArr[newArr.length - 1] = numberToAdd;
	    
	    // Print the new array
	    for (int i = 0; i < newArr.length; i++) {
	        System.out.print(newArr[i] + " ");
	    }
	}
	void try8()//placing given no in the first index of given array
	{
		int ar[]= {2,3,4,5,6};
		int no=1;
	  int ar1[]=new int[ar.length+1];
	  			ar1[0]=no;
	  for(int i=0;i<ar.length;i++)
	  {
		  	ar1[i+1]=ar[i];
	  }
	  for(int i=0;i<ar1.length;i++)
	  {
		  System.out.println(ar1[i]);
	  }
		
	}
	void try9()
	{
		int ar[]= {1,2,4,65,5,6,7,8};
		int no=9;
		int middleindex=ar.length;
		int newar[]=new int[ar.length+1];
		if(middleindex%2==0)
		{
			middleindex=ar[ar.length/2-1];
			middleindex=ar[ar.length/2];
		
		}
		else 
		{
			middleindex=ar[ar.length/2];
		}
		
		for(int i=0;i<middleindex;i++)
		{
			newar[i]=ar[i];
		}
		newar[middleindex]=no;
		
		for(int i=middleindex;i<ar.length;i++)
		{
			newar[i+1]=ar[i];
		}
		for(int i=0;i<newar.length;i++)
		{
			System.out.println(newar[i]);
		}
		
	}
	
	void try10()//how many times given element is present 
	{
 		int ar[]= {60,20,20,40,50,50,60,60};
		
		for(int i=0;i<ar.length;i++)
		{	
			int count =1;
			if (ar[i]=='*')
				continue;
			for(int j=i+1;j<ar.length;j++)
			{
				
		if (ar[i]==ar[j])
		{
			count++;
			ar[j]='*';
	}
			}
			System.out.println(ar[i]+" element is present "+count+" times");
			}	
	}
	void try11()//Finding biggest no. in given array
	{
		int ar[]= {200,10,20,30,110,11,90};
		int big=0;
		for(int i=0;i<ar.length;i++)
		{
			
			if(ar[i]>big)
			{
			big=ar[i];	
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("Biggest element in given array: "+big);
		}
	void try12()//Finding smallest no. in given array
	{
		int ar[]= {10,20,30,110,100,90};
		int small=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<small)
			{
				small=ar[i];
			}
		}
		System.out.println("Smallest element in given array: "+small);
		
	}
	void try13()//highest & second highest
	{
		int ar[]= {4,6,8,9,1};
		int h=0;
		int sh=0;
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>h)
			{
				sh=h;
				h=ar[i];
				
			}
			else if(ar[i]>sh)
			{
				sh=ar[i];
			}
			
		}
			System.out.println("Highest is : "+h);
			System.out.println("Second Highest  is : "+sh);
			
		
	}
	void try14()
	{
		int ar[]= {4,6,7,9,1};
		int l=Integer.MAX_VALUE;
		int sl=Integer.MIN_VALUE;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<l)
			{
			sl=l;
			l=ar[i];
			}
			else if(ar[i]<sl)
			{
				sl=ar[i];
			}
		}
		System.out.println("lowest"+l);
		System.out.println("second lowest"+sl);
	}
	void try15()////Finding count of duplicate elements in a given array
	{
		int ar[]= {60,20,20,40,50,50,60,60};
		int total=0;
		for(int i=0;i<ar.length;i++)
		{	
			int count =1;
			if (ar[i]=='*')
				continue;
			
			for(int j=i+1;j<ar.length;j++)
			{
				
		if (ar[i]==ar[j])
		{
			ar[j]='*';	
			count++;
		}	
			}
			if(count>1)
			{
				total=total+count;
			}
			System.out.println(ar[i]+" element is present "+count+" times");
			
		}	
		System.out.println("total duplicate elements count: "+total);
		
	}
	void try16()//Finding addition of odd index numbers in a given array
	{
	int ar[]= {1,2,3,4,5,6,7};
	int sum=0;
	for(int i=0;i<ar.length;i++)
	{
		if(i%2!=0)
		{
		sum=sum+ar[i];
		}
	}
	System.out.println("addition of add index: "+sum);
	}
	void try17()//Moving all elements towards left in a given array
	{
		int[] ar = {1, 2, 3, 4, 5};
        int temp=ar[0];

        for(int i=1;i<ar.length;i++)
        {
        	ar[i-1]=ar[i];	
        	
        }
        ar[ar.length-1]=temp;
        for(int i=0;i<ar.length;i++)
        {
        	System.out.println(ar[i]);
        }   	
	}
	void try18()
	{
		int ar[]= {2,6,8,9,10,11,31};
		int temp=ar[0];
		int temp1=ar[1];
		for(int i=2;i<ar.length;i++)
		{
		  ar[i-2]=ar[i]; 
		}
		ar[ar.length-2]=temp1;
		ar[ar.length-1]=temp;
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		
	}
	void try19()
	{
		String s="jave";
		char[] c=s.toCharArray();
		for(int i=0;i<c.length/2;i++)
		{
			char temp=c[i];
			c[i]=c[c.length-i-1];
			
			c[c.length-i-1]=temp;
			
		}
		System.out.println(c);
		
//		for(int i=c.length-1;i>=0;i--)
//		{
//			System.out.print(c[i]);
//		}
	}
	void try20()
	{
		String s="sakthi@123";
		for (int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='a'&& ch<='z')
			{
				ch=(char)(ch-32);
				System.out.print(ch);
			}
			else
				System.out.print(ch);
		}
			
		}
	void try21()//moving all elements right shift to array
	{
		 int[] ar = {1, 2, 3, 4, 5};
		int temp=ar[ar.length-1];
		for(int i=ar.length-1;i>0;i--)
		{
			ar[i]=ar[i-1];
		}
		ar[0]=temp;
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		
		
}
	void try22()//Moving all elements towards right twice in a given array
	{
		int ar[]= {1,2,3,4,5};
		int temp=ar[ar.length-1];
		int temp1=ar[ar.length-2];
		for(int i=ar.length-1;i>1;i--)
		{
			ar[i]=ar[i-2];
		}
		ar[0]=temp;
		ar[1]=temp1;
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}
	void try23()// Copying the given array to another array in reverse order
	{
		int ar[]= {1,2,3,4,5};
		int ar1[]=new int [ar.length];
		for(int i=ar.length-1;i>=0;i--)
		{
			ar1[i]=ar[i];
			System.out.print(ar1[i]+" ");
		}
		
	}
	void try24()//Addition of two integer arrays
	{
		int a[]= {1,2};
		int b[]= {3,4};
		int c[]=new int [a.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i]+b[i];
			System.out.println(c[i]);
		}
		
	}
	void try25()
	{
		int ar[]= {1,2,3,-1,-2,-3};//Finding only negative numbers in given array
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<0)
			{
				System.out.println(ar[i]);
			}
		}
	}
	void try26()//Copying only the negative numbers in given array - to another array
	{
		int ar[]= {1,2,3,-1,-2,-3};
		int newar[]=new int [ar.length];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<0)
			{
				newar[i]=ar[i];
				System.out.println(newar[i]);
			}
		}
	}
	void try27()//Copying only the odd indexed numbers in given array - to another array 
	{
		int ar[]= {1,2,3,4,5};
		int ar1[]=new int [ar.length];
		for(int i=0;i<ar.length;i++)
		{
			if(i%2!=0)
			{
				ar1[i]=ar[i];
				System.out.println(ar1[i]);
			}
		}
	}
	void try28()//Printing values between adjacent two elements in a given array
	{
		int[]ar= {5,10,8,12};
		
		for(int j=0;j<ar.length-1;j++)
		{
			int small=ar[j]<ar[j+1]?ar[j]:ar[j+1];
			int big=ar[j]>ar[j+1]?ar[j]:ar[j+1];
			int no1=small;
			int no2=big;
		for(int i=no1;i<=no2;i++)
		{
			System.out.print(i+" ");
			
		}
		System.out.println();
		}
		
	}
	void try29()//Removing all the duplicate elements in a given array
	{
		int[]ar= {20,30,30,40,50,50,50,60,60,70};
		int count=1;
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i]!=ar[i+1])
			{
				ar[count]=ar[i+1];
				count++;
			}
		}
		for(int j=0;j<count;j++)
		System.out.println(ar[j]+" ");
		
	}
	void try30()
	{
	String s="skthias";
	char name[]=s.toCharArray();
	for(int i=0;i<name.length;i++)
	{
		char ar=name[i];
		boolean repeated=false;
		for(int j=i+1;j<name.length;j++)
		{
			if(ar==name[j]) 
			{
				repeated=true;
			System.out.println("first repeated character is : "+name[j]);
			break;
		}	
	}
		if(repeated==false)
	
		System.out.println("no repeated character");
		break;

	}
	
	}
	void try31()
	{
		String s="anandh";
		char name[]=s.toCharArray();
		for(int i=0;i<name.length;i++)
		{
			char ch=name[i];
			boolean repeated=false;
			if(name[i]=='*')
				continue;
			for(int j=i+1;j<name.length;j++)
			{
				if(name[j]==ch)
				{
					name[j]='*';
					repeated=true;
					break;
				}
			}
			if(repeated==false)
			{
				System.out.println("first non repeated chaaracter is: "+ch);
				break;
			}
		}
	}
	void try32()
	{
		String s="saranya";
		char name[]=s.toCharArray();
		char c=' ';
		int big=0;
		for(int i=0;i<name.length;i++)
		{
			char ch=name[i];
			int count =1;
			if(name[i]=='*')
				
			continue;
			
			
			for(int j=i+1;j<name.length;j++)
			{
				if(ch==name[j])
				{
					name[j]='*';
					count++;
				}
			}
			if(count>big)
			{
				big=count;
				c=ch;
			}
			System.out.println("Occurance of "+ch+ " is " +count);
			
		}
		System.out.println("most frequent character is : "+c);
		System.out.println("it apperars for : "+big+"times ");
		
		
			}
			
  void try33()//Sum of 2 elements in a single array corresponding to 10
  {
	  int ar[]= {1,2,3,8,9,7};
	  int target=10;
	  for(int i=0;i<ar.length;i++)
	  {
		  for(int j=i+1;j<ar.length;j++)
		  {
			  if(ar[i]+ar[j]==target)
			  {
				  System.out.println("The number "+ar[i]+" and "+ar[j]+" add up to "+target);
			  }
		  }
	  }
  }
  void try34()//   Divide all the elements in an array by 3 and store it in the same array
  {
	  int ar[]= {1,3,6,9,10};
	  for(int i=0;i<ar.length;i++)
	  {
		  System.out.println(ar[i]);
	  }
	  for(int i=0;i<ar.length;i++)
	  {
		ar[i] = ar[i]/3;
		  System.out.print(ar[i]+" ");
	  }
  }
  void try35()//split array one to store odd and one to store even
  {
	  int ar[]= {101,800,670,2};
	  int oddar[]=new int[ar.length];
	  int evenar[]=new int[ar.length];
	  for(int i=0;i<ar.length;i++)
	  {
		  oddar[i]=ar[i];
		  evenar[i]=ar[i];
		  if(oddar[i]%2!=0) {
			  System.out.println("odd number in given array : "+oddar[i]);
		
		  }
		  
		  else	
			   
		  {
			  System.out.println("even number in given array : "+evenar[i]);
		  }
	  }
	  
  }

  void try36()//Print odd elements present in even index of an array 
  {
	  int ar[]= {1,3,3,4,5};
	  for(int i=0;i<ar.length;i++)
	  {
		  if(ar[i]%2!=0 && i%2==0)
		  {
			 
			  System.out.println("odd elements present in even index of an array:"+ar[i]+"-> "+i+" ");
		  }
	  }
  }
  void try37()//Print even elements present in odd index of any array
  {
	  int ar[]= {1,3,3,4,5};
	  for(int i=0;i<ar.length;i++)
	  {
		  if(ar[i]%2==0 && i%2!=0)
		  {
			 
			  System.out.println("even elements present in odd index of any array: "+ar[i]+"->"+i+" ");
		  }
	  }  
  }
  
  
  void try38()//wrong pro
  {
	  int [] a= {45,72,72,23,99,45,25,51,72,23,50,67};
	  int [] b= {47,7,7,24,199,145,26,199,77,29,47,45};
	  int []c=new int[a.length+b.length];
	  
	for(int i=0;i<a.length;i++)
	{
		
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
				a[j]='*';
			break;
			
		}
		System.out.print(a[i]+" ");
	}
		
	System.out.println();
	
	for(int i=0;i<b.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(b[i]==b[j])
				b[j]='*';
			
		}
		System.out.print(b[i]+" ");
	}
	System.out.println();
	int j=0;
	int []result=new int[a.length+b.length];
	for(int i=0;i<result.length;i++)
	{
		if(i<a.length)
			result[i]=a[i];
		else
		{
			result[i]=b[j];
		j++;
			
	}
		System.out.print(result[i]+" ");
	}
	  
  }
  void try39()
  {
	  //int no=2;
	  int ar[]= {7,2,3,6,1,0,5};
	  int div=2;
	  int div1=2;
	  int divi=1;
	  int p=0;
	  int count=0;
	 
	  for(int i=0;i<ar.length;i++)
	  {
		  System.out.println("****************");
		  System.out.println("GIVEN NO:"+ar[i]);
		  System.out.println("****************");
		
	  if(ar[i]%div1==0)
	  
		  System.out.println(ar[i]+" even no");
	  
	  
	  else  
		  System.out.println(ar[i]+" odd no");
	  
	  if(ar[i]==1 || ar[i]==0)
	  {
		  System.out.println(ar[i]+" not prime no");
		 System.out.println(ar[i]+" not a composite no");
		 System.out.println(ar[i]+" not a perfect no");
		 continue;

	  } 
	  
	  
	  while(div<=ar[i]/2)
	  {
		  
		   if(ar[i]%div==0) {
		  System.out.println(ar[i]+" not a prime");
		  System.out.println(ar[i]+" composite no");

			count++;
		  }
			div++;
		  
	  }
		  
	  if(count==0)
		  {
			  System.out.println(ar[i]+" prime no");
			  System.out.println(ar[i]+" is not a composite no");
		  }
	   
		 
  
	  while(divi<=ar[i]/2)
	  {
	  if(ar[i]%divi==0)
	  {
		  p=p+divi;
	  }
	  divi++;
	  }
	  if(ar[i]==p)
	  
		  System.out.println(ar[i]+" Perfect No");
	  
	  else
		  System.out.println(ar[i]+" is not a perfect no");
	 
	 	
	  }
	 
  }
  void try40()// Multiply any two elements in an array and check if it corresponds to 20
  {
	  int ar[]= {4,6,8,5,2,10,20,1};
	  int  target=20;
	  for(int i=0;i<ar.length;i++)
	  {
		  for(int j=i+1;j<ar.length;j++)
		  {
			  if(ar[i]*ar[j]==target)
			  {
				  System.out.println("The number "+ar[i]+" and "+ar[j]+" to multiply as "+target);
			  }
		  }
	  }
	  }
  void try41()//Check if any elements in an array are prime numbers
  {
	  int ar[]= {1,2,3,4,5,6};
	  int div=2;
	  
	  for(int i=0;i<ar.length;i++)
	  {
		  int count=0;
		  if(ar[i]==1)
		  {
			  System.out.println(ar[i]+" Is not a prime no");
			  continue;
		  }
		  while(div<=ar[i]/2)
		  {
			  if(ar[i]%div==0)
			  {
				  System.out.println(ar[i]+" Is not a prime no");
				  count++;
				 
			  }
			 
			  div++;
			  
		  }
		  if(count==0)
		  {
			  System.out.println(ar[i]+" Is a prime no");
			  
		  }
	  }
  }
  void try42()// Check if any elements in an array are perfect numbers
  {
	  int ar[]= {1,2,3,4,5,6};
	 
	  
	  for(int i=0;i<ar.length;i++)
	  {
		  int div=1;
		  int p=0;
		  while(div<=ar[i]/2)
		  {
			  if(ar[i]%div==0)
			  {
				  p=p+div;
			  }
			  div++;
		  }
			  if(ar[i]==p)
			  {
				  System.out.println(ar[i]+" is perfect no");
			  }
			  
			  
		  
		  else
			  System.out.println(ar[i]+" is not a perfect no");
		  
			  
		  
	  }
  }
  
void try43() {//binary search
	int ar[]= {1,2,5,7,9};
	int key=7;
	int min=0;
	int max=ar.length-1;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number: ");
	key=sc.nextInt();
	
while(min<=max)
	{
		int mid=(min+max)/2;
		if(key==ar[mid])
		{
			
			System.out.println("The element "+ar[mid]+" is present at "+mid+" position");
		break;
		}
		
		else if(key<ar[mid])
		{
			max=mid-1;
		}
		else {
			min=mid+1;
		}
			
	}
if(min>max)
{
	System.out.println("the element not present");
}
}
  
  
  
  public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arraytry a=new Arraytry();
		//a.try1();
		//a.try2();
		//a.try3();
	//	a.try4();
		//a.try5();
		//a.try6();
		//a.try7();
		//a.try8();
		//a.try9();
		//a.try10();
		//a.try11();
		//a.try12();
		//a.try13();
		//a.try14();
	//	a.try15();
		//a.try16();
		//a.try17();
		//a.try18();
		//a.try19();
		//a.try20();
		// a.try21();
		//a.try22();
		//a.try23();
		//a.try24();
		//a.try25();
		//a.try26();
		//a.try27();
		//a.try28();
		//a.try29();
		//a.try30();
		//a.try31();
		//a.try32();
		//a.try33();
		//a.try34();
		//a.try35();
		//a.try36();
		//a.try37();
		//a.try38();
	//	a.try39();
		//a.try40();
		//a.try41();
		//a.try42();
		a.try43();
		
	}

}
