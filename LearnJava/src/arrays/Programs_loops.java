package loops;

import java.util.Scanner;

public class Programs_loops {
	void try1()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.print(1+" ");
		}
	}
	void try2() {
		for(int i=1;i<=5;i++)
		{
			System.out.print(i+" ");
		}
	}
	void try3()
	{

		for(int i=1;i<=9;i+=2)
		{
			System.out.print(i+" ");
		}
	}
	void try4()
	{
		for(int i=3;i<=15;i+=3)
		{
			System.out.print(i+" ");
		}
		
		
	}
	void try5()//Multiples of 3 and 5 
	{
		for(int i=1;i<=30;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.print(i+" ");
			}
		}
	}
	void try6()//Multiples of 3 or 5 
	{
		for(int i=1;i<=30;i++)
		{
			if(i%3==0 || i%5==0)
			{
				System.out.print(i+" ");
			}
		}
	}
	void try7()//Divisors of given number
	{
		int no=100;
		int div=2;
		while(div<=no/2)
		{
			if(no%div==0)
			{
				System.out.println(div+" ");
			}
			div++;
		}
		
	}
	void try8()//Count of Divisors of given number
	{
		int no=100;
		int div=2;
		int count=0;
		while(div<=no/2)
		{
			if(no%div==0)
			{
				System.out.println(div+" ");
				count++;
			}
			div++;
		}
		System.out.println("Total count: "+count+" ");
	}
	void try9()// Prime Number
	{
		int no=7;
		int div=2;
		boolean prime=false;
		while(div<=no/2)
		{
			if(no%div==0)
			{
				System.out.println(no+" is not a prime no");
				prime=true;
				break;	
			}
			
			div++;
			
		}
		if(prime==false)
		{
			System.out.println(no+" is  a prime no");
			
		}
	}
	void try10() // Reverse Printing a number
	{
		int no=1234;
		while(no>0)
		{
		System.out.print(no%10);
		no=no/10;
		}
	}
	void try11()//count of digits
	{
		int no=12347;
		int count=0;
		while(no>0)
		{
			int no1=no%10;
			count++;
			no=no/10;
		
		}
		
		System.out.print("count of digit: "+count);
	}
	void try12()//Sum of Digits
	{
	int no=1234;
	int sum=0;
	while(no>0)
	{
		int sn=no%10;
		sum=sum+sn;
		no=no/10;
	}
	System.out.println("sum of digit: "+sum);
	}
	void try13()// Reverse the number
	{
		int no=121;
		int result=0;
		while(no>0)
		{
			int rem=no%10;
			result=(result*10)+rem;
			no=no/10;
		}
		System.out.println("the reverse number: "+result);
	}
	void try14()//Palindrome
	{
		int no=121;
		int no2=no;
		int result=0;
		while(no>0)
		{
			int rem=no%10;
			result=(result*10)+rem;
			no=no/10;
		}
		if(no2==result)
		{
		System.out.println(" given number "+no2+" is a palindrome");
		}
		else
			System.out.println(" given number "+no2+" is  not a palindrome");
	}
	void try16()// Neon Number 
	{
		System.out.print("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
				
		int square=(no*no);
		int sum=0;
		while(square>0)
		{
			int result=square%10;
			sum=sum+result;
			square=square/10;
		}
		if(no==sum)
		{
			System.out.println(no+" is a neon number");
		}
		else
		{
			System.out.println(no+" is not  a neon number");
		}
		
		
	}
	void try19()//Factorial
	{
		int f=1;
		for(int i=1;i<=5;i++)
		{
			f=f*i;
		
		System.out.print(f+" ");
		}
	}
	void try20()//Greatest Common Divisor
	{
		int no1=100;
		int no2=90;
		int gcd=0;
		int div=2;
		int small=no1<no2?no1:no2;
		while(div<=small)
		{
			if(no1%div==0 && no2%div==0)
			{
				gcd=div;
			}
			div++;
		}
		if(gcd!=0)
		{
			System.out.println("GCD is: "+gcd);
		}
		else
			System.out.println("NO common divisors is found");
	}
	void try21()//L.C.M 
	{
		int no1=3;
		int no2=9;
		int count=0;
		int big=no1<no2?no1:no2;
	
		while(count<6)
		{
			if(big%no1==0 && big%no2==0)
			{
				System.out.println("L.C.M is: "+big);
				count++;
			}
			big++;
		}
		
	}
	void try22()//2 power 5
	{
		int power=5;
		int box=1;
		int base=2;
		while(power>0)
		{
			box=box*base;
			power=power-1;
			
		}
		System.out.println("2 power 5 is: "+ box);
	}
	void try25()// Fibonacci Series
	{
	int first=0;
	int second=1;
	int count=0;
	while(count<=10)
	{
	System.out.println(first );
	int third=first+second;
	first=second;
	second=third;
	count++;
	}
	}
	void try26()//Swapping two numbers
	{
		int x=1;
		int y=20;
		System.out.println("Orginal value of x:" +x);
		System.out.println("Orginal value of Y:"+y);
		int temp=0;
		temp=x;
		x=y;
		y=temp;
		System.out.println("After swapping value of X: "+x);
		System.out.println("After swapping value of Y: "+y);
		System.out.println();
		System.out.print("Another method");
		System.out.print("\n**************");
		System.out.println();
		int a=10;
		int b=20;
		System.out.println("Orginal value of a:" +a);
		System.out.println("Orginal value of b:"+b);
		int c=a+b;
		a=c-a;
		b=c-b;
		System.out.println("After swapping value of a: "+a);
		System.out.println("After swapping value of b: "+b);
		
	}
	
	
	void try27()// Swapping without using third variable
	{
		int x=10;
		int y=20;
		System.out.println("Orginal value of x:" +x);
		System.out.println("Orginal value of Y:"+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swapping value of X: "+x);
		System.out.println("After swapping value of Y: "+y);
	}
	void try28()// Swapping without third variable
	{
		int first=0;
		int second=1;
		while(first<=13) {
		System.out.println(first);
		first=first+second;
		second=first-second;
		}
	}
	void try31() // Sum of Digits until it becomes single digit
	{
		int no=2354;
		int sum=0;
		while(no>9 ) {
			sum=0;
		while(no>0)
		{
			int a=no%10;
			sum=sum+a;
			no=no/10;	
		}
		no=sum;
		}
		System.out.println("The single digit sum is: "+sum);
		
	}
	void try32()//Printing 5! 4! 3! 2! 1! 
	{
		int fact=1;
		for(int j=5;j>=1;j--) 
		{
		for(int i=1;i<=j;i++)
		{
			fact=fact*i;
		}
		System.out.println(j+" ! is: "+fact);
		fact=1;
		}
	}
	void try33()
	{
		
		int no=1;
		while(no<=4)
		{
		for(int i=10;i>=7;i--)
		{	
			System.out.println(no+" * "+i+" = "+no*i);
			no++;
		
		}
		
		}
		
	}
	
	void try34()
	{
		int no1=1;
		int no2=11;
		System.out.println(no1);
		System.out.println(no1*no2);
		System.out.println(no2*no2);	
	}
	void try35() {
		int no=1;
		while(no<=4)
		{
			System.out.println(no*no*no);
			no+=1;
		}
	}
	void try36()
	{
		int no=1;
		while(no<=10)
		{
			System.out.println(no*no);
			no=no+1;
		}
	}
	void try37()// Printing 1 4 27 256
	{
		  int n = 4; // Number of powers to print

	        for (int i = 1; i <= n; i++) {
	            int result = 1;
	            
	            // Calculate i^i without using Math.pow()
	            for (int j = 1; j <= i; j++) {
	                result =result* i;
	            }
	            
	            System.out.print(result + " ");
	        }
	}
	void try39()
	{
		int no=132;
		int no1=no;
		int add=0;
		int mul=1;
		while(no>0)
		{
			int rem=no%10;
			add=add+rem;
			mul=mul*rem;
			no=no/10;
				
		}
		
		if(add==mul)
		
			System.out.println(no1 +" is  a spy number");
		else
			System.out.println(no1 +" is not  a spy number");
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programs_loops pp=new Programs_loops();
		//pp.try1();
		//pp.try2();
		//pp.try3();
		//pp.try4();
		//pp.try5();
		//pp.try6();
		//pp.try7();
//		pp.try8();
//		pp.try9();
//		pp.try10();
//		pp.try11();
		//pp.try12();
		//pp.try13();
		//pp.try14();
		//pp.try16();
		//pp.try19();
		//pp.try20();
		//pp.try21();
		//pp.try22();
		//pp.try25();
		//pp.try26();
		//pp.try27();
		//pp.try28();
		//pp.try31();
		//pp.try32();
		//pp.try33();
		//pp.try34();
		//pp.try35();
		//pp.try36();
		//pp.try37();
		pp.try39();
	}

}
