package arrays;

public class Arraydemotwo {
	private void learn1()//addition of two arrays
	{
		int[]a= {5,10,15};
		int[]b= {15,10,5};
		int[]c=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i]+b[i];
			System.out.println(c[i]);
		}	
	}
	private void learn2()//addition of three arrays
	{
		int[]a= {5,10,15,20};
		int[]b= {15,10,5};
		int big=a.length>b.length?a.length:b.length;
		int[]result=new int[big];
		int small=a.length<b.length?a.length:b.length;
		for(int i=0;i<big;i++)
		{
			if(i<small)
			
				result[i]=a[i]+b[i];
			
			
			else
				result[i]=a[i];
			System.out.println(result[i]);
			
		}
		
	
	}
			private void learn3()//concat of two array
			{
				int j=0;
				int[]a= {5,10,15};
				int[]b= {20,25,30};
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
			private void learn4()//number present between adjecent elements
			{
				//int[]ar= {5,10,15,20};
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
			
			private void learn5() {
				// TODO Auto-generated method stub
				int[]ar= {20,30,30,40,50,50,50,60,60,70};//remove duplicates
				int unique=1;
				for(int i=0;i<ar.length-1;i++)
				{
					if(ar[i]!=ar[i+1])
					{
						ar[unique]=ar[i+1];
						//System.out.println(ar[unique]+" ");
						unique++;
					}
				}
				for(int i=0;i<unique;i++)
				System.out.println(ar[i]+" ");
				
			}
			private void learn6()//sub array
			{
				//System.out.println("hi");
			int[]a= {20,30};
			int[]b= {20,30};
			//int count=0;
			int j;
			for(j=0;j<b.length;j++)
			{
				boolean present=false;
				for(int i=0;i<a.length;i++)
				{
					if(b[j]==a[i])
					{
						//count++;
						present=true;
					}
						
				}
				if(present==false)
				{
					System.out.println("Not a sub array");
					break;
				}
				
			}
			if(j==b.length)
			{
				System.out.println("subarray");
			}
			}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arraydemotwo ar=new Arraydemotwo();
		{
			//ar.learn1();
			//ar.learn2();
		//9ar.learn3();
			ar.learn4();
			//ar.learn5();
			//ar.learn6();
			//ar.learning_10();
		}
				

	}
}
	
