//package loops;

public class Prime {
	public static void main(String[] args)
	{
	Prime pp=new Prime();
	pp.find_power(2);

}

	private void find_power(int no) {
		// TODO Auto-generated method stub
		int div=2;
		int count=0;
		int prime_count=0;
		while(div<=no/2)
		{
			if(no%div==0)
			{
				count=count+1;
				break;
			}
			div=div+1;
		}
		if(count==0)
		
			System.out.println(no+"prime");
			prime_count=prime_count+1;
			if(prime_count<=5)
			{
				no=no+1;
				find_power(no);
			}
		
				
	}
	}


