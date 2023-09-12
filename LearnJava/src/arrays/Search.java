package arrays;

public class Search {
	void learn1()
	{
		int ar[]= {7,17,25,38,69};
		int key=100;
		int min=0;
		int max=ar.length-1;
		while(min<=max)
		{
			int mid=(min+max)/2;
			if(key==ar[mid])
			{
			System.out.println(" Middle Number "+ar[mid]+" Key is present at "+mid+" position");
			break;
		
			}
		else if(key<ar[mid])
		{
			max=mid-1;
		}
		else if(key>ar[mid])
		{
			min=mid+1;
		}
		}
		
		if(min>max)
		{
			System.out.println("key is not present");
		}
		
	}	
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Search s=new Search();
		s.learn1();
	}

}
