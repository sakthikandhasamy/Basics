//package com.basic.pkg;

import java.util.Scanner;

public class Incometax {
	
	double income;
	double oldtaxcalc()
	{
		
		double taxrate1=0;
		if(income<=250000)
		{
			taxrate1=0;
		}
		if(income>250000 && income<=500000)
		{
			taxrate1=((income-250000)*5/10);		
		}
		if(income>500000 && income<=1000000)
		{
			taxrate1=0+(250000*5/100)+((income-500000)*20/100);		
		}
		if(income>1000000)
		{
			taxrate1=0+(250000*5/100)+(500000*20/100)+((income-1000000)*30/100);	
		}
		System.out.println("old taxamount: "+taxrate1);
		return taxrate1;
	}
		double previouscalc()	
		{
			 double income=0;
			double taxrate2=0;
			if(income<=250000)
			{
				taxrate2=0;
				
			}
			if(income>250000 && income<=500000)
			{
				taxrate2=((income-250000)*5/100);
				
			}
			if(income>500000 && income<=750000)
			{
				taxrate2=0+(250000*5/100)+((income-500000)*10/100);
					
			}
			if(income>750000 && income<=1000000)
			{
				taxrate2=20+(250000*5/100)+(250000*10/100)+((income-750000)*15/100);
					
			}
			if(income>1000000 && income<=1250000)
			{
				taxrate2=0+(250000*5/100)+(250000*10/100)+(250000*15/100)+((income-1000000)*20/100);
					
			}
			if(income>1250000&& income<=1500000)
			{
				taxrate2=0+(250000*5/100)+(250000*10/100)+(250000*15/100)+(250000*20/100)+((income-1250000)*25/100);
					
			}
			if(income>1500000)
			{
				taxrate2=0+(250000*5/100)+(250000*10/100)+(250000*15/100)+(250000*20/100)+(250000*25/100)+((income-1500000)*30/100);
				
			}	
			System.out.println("Previous taxamount: "+taxrate2);
			return taxrate2;		
	   }
		double revisedcalc()
		{
			 double income=0;
			double taxrate3=0;
			if(income<=300000)
			{
				taxrate3=0;		
			}
			if(income>300000 && income<=600000)
			{
				taxrate3=0+((income-300000)*5/100);	
			}
			if(income>600000 && income<=900000)
			{
				taxrate3=0+(300000*5/100)+((income-600000)*10/100);	
			}
			if(income>900000 && income<=1200000)
			{
				taxrate3=0+(300000*5/100)+(300000*10/100)+((income-900000)*15/100);	
			}
			if(income>1200000 && income<=1500000)
			{
				taxrate3=0+(300000*5/100)+(300000*10/100)+(300000*15/100)+((income-1200000)*20/100);		
			}
			if(income>1500000)
			{
				taxrate3=0+(300000*5/100)+(300000*10/100)+(300000*15/100)+(300000*20/100)+((income-1500000)*30/100);
			}
		
			System.out.println("Revised taxamount: "+taxrate3);
			return taxrate3;
			
		}
		public void leastcalc()
		{
			double taxrate1=oldtaxcalc();
			double taxrate2=previouscalc();
			double taxrate3=revisedcalc();
			
			if(taxrate1<=taxrate2 && taxrate1<=taxrate3)
			{
				System.out.println("Least taxrate: "+taxrate1);
			}
			else if(taxrate2<taxrate1&& taxrate2<taxrate3)
			{
				System.out.println("Least taxrate: "+taxrate2);
			}
			else if(taxrate3<taxrate1 && taxrate3<taxrate2)
			{
				System.out.println("Least taxrate: "+taxrate3);
			}
		}
		
		
	public void display()
{
System.out.println("TAXCALCULATION");
System.out.println("**************");
System.out.print("Enter income: ");
Scanner sc=new Scanner(System.in);
income=sc.nextInt();
}

	public static void main(String[] args) {
		//if(taxrate1axrate2<taxrate3)
		
		Incometax ic=new Incometax();
        ic.display();
		ic.oldtaxcalc();
		//ic.previouscalc();
		//ic.revisedcalc();
		//ic.leastcalc();
	}

}

