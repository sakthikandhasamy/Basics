package Com.Pkg.PT;

public class PtonSb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
long starttime=System.currentTimeMillis();
StringBuilder sb=new StringBuilder("java");
for(int i=1;i<=1000000;i++)
{
	sb.append("program");
}
long endtime=System.currentTimeMillis();
System.out.println(endtime-starttime+"ms");
	}

}