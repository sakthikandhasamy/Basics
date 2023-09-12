package Com.Pkg.PT;

public class PtonWhileM {

	public static void main(String[] args) {
		long starttime=System.currentTimeMillis();

		int x=1;
		while(x<=10000000)
		{
			System.out.println(x);
			x++;
		}
		long endtime=System.currentTimeMillis();
		System.out.println(endtime-starttime +"ms");
		// TODO Auto-generated method stub

	}

}
