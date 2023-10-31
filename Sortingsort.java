package arrays;

public class Sortingsort {
	void bubblesort()
	{
		int[]ar= {100,90,80,70,67,45,78,56,123,978};//all number in array print //top 3 number//top 5 number
		//first biggest & second biggest
		for(int j=1;j<=ar.length;j++)
		{
		for(int i=0;i<ar.length-j;i++)
		{
			if(ar[i]>ar[i+1])//decrease order //condition change(increase order)
			{
		int temp=ar[i];
		ar[i]=ar[i+1];
		ar[i+1]=temp;
			}
	}
		System.out.println(ar[ar.length-j]);
		}
		
		}
	void bubblesort1()
	{
		int[]ar= {100,90,80,70,67,45,78,56,123,978};
			for (int j=1;j<ar.length;j++)
			{
				for(int i=1;i<ar.length-j;i++)
				{
					if(ar[i]<ar[i+1])//decrease order //condition change(increase order)
					{
					int temp=ar[i];
					ar[i]=ar[i+1];
					ar[i+1]=temp;
				}
				}
					System.out.println(ar[ar.length-j]);
				
				
			}
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sortingsort so=new Sortingsort();
	so.bubblesort();
	System.out.println("******************************");
    so.bubblesort1();
	}

}
