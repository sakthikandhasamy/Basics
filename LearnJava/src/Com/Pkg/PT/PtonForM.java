package Com.Pkg.PT;

public class PtonForM {

	public static void main(String[] args) {
		
		long starttime=System.currentTimeMillis();

		int x=10000000;
		for(int i=1;i<=x;i++)
		{
			System.out.println(i);
		}
		long endtime=System.currentTimeMillis();
				System.out.println(endtime-starttime +"ms");
		// TODO Auto-generated method stub

	}

}
