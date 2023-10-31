package arrays;
	
public class Matrixtwodim {

	void try1()
	{
		int[][]a= {{10,20},{30,40}};
		int[][]b= {{40,30},{20,10}};
		int[][]c=new int[2][2];
		for(int row=0;row<c.length;row++)
		{
			for(int col=0;col<c[row].length;col++)
			{
				c[row][col]=a[row][col]+b[row][col];
				System.out.print(c[row][col]+" ");
			}
			System.out.println();
			
		}
	}
	void try2()
	{
		int[][]marks= {{50,60,45,80,90},{60,78,35,76,87}};
		int total=0,row=0;
		for(row=0;row<marks.length;row++)
		{
			for(int col=0;col<marks[row].length;col++)
			{
				total=total+marks[row][col];
			}
			System.out.println(total);
			row++;
			total=0;
		}
	}
	void try3()
	{
		int[][]a= {{10,20,30},{40,50,60},{70,80,90}};
		int total=0;
		for(int row=0;row<a.length;row++)
		{
			for(int col=0;col<a[row].length;col++)
			{
				//if(row==col)
					if(row+col==2)
					
					total+=a[row][col];
			}
		}
		System.out.println(total);
	}
	void try4()
	{
		int[][] a = new int[4][4];
		  for(int i=0;i<4; i++)
		  {
		    for(int j=0; j<4; j++)
		    {
		      System.out.print(a[i][j]+"  ");
		    }
		    System.out.println();
		  }
		  
		  int no = 1; 
		  int minRow=0, minCol=0, maxCol=3, maxRow=3; 
		  while(no<=16)
		  {
		  
		  for(int col=minCol; col<=maxCol; col++)
		  {
		    a[minRow][col] = no; no++; 
		  }
		  minRow++;
		  // 5 6 7 
		  for(int row=minRow; row<=maxRow; row++)
		  {
		    a[row][maxCol] = no; no++; 
		  }
		  maxCol--; 
		  
		  //8 9 10
		  for(int col=maxCol; col>=minCol; col--)
		  {
		    a[maxRow][col] = no; no++; 
		  }
		  maxRow--; 
		  
		  // 11 12
		  for(int row=maxRow;row>=minRow; row--)
		  {
		    a[row][minCol] = no; no++; 
		  }
		  minCol++; 
		  }
		  
		  for(int i=0;i<4; i++)
		  {
		    for(int j=0; j<4; j++)
		    {
		      System.out.print(a[i][j]+"\t");
		    }
		    System.out.println("\n");
		  }
	}
void try5()
{
		int[][] a = new int[5][5];
		  for(int i=0;i<5; i++)
		  {
		    for(int j=0; j<5; j++)
		    {
		      System.out.print(a[i][j]+"  ");
		    }
		    System.out.println();
		  }
		  
		  int no = 1; 
		  int minRow=0, minCol=0, maxCol=4, maxRow=4; 
		  while(no<=25)
		  {
	     for(int col=maxCol;col>=minCol;col--)
		  {
		 a[minRow][col] = no; 
		    no++; 
		  }
	     minRow++;
	     
	     for(int row=minRow;row<=maxRow;row++)
	     {
	    	 a[row][minCol]=no;
	    	 no++;
	     }
	     minCol++;
	     for(int col=minCol;col<=maxCol;col++)
	     {
	    	 a[maxRow][col]=no;
	    	 no++;
	     }
	     maxRow--;
	     for(int row=maxRow;row>=minRow;row--)
	     {
	    	 a[row][maxCol]=no;
	    	 no++;
	     }
	     maxCol--;
		  }  
	  for(int i=0;i<5; i++)
	  {
	    for(int j=0; j<5; j++)
	    {
	      System.out.print(a[i][j]+"\t");
	    }
	    System.out.println("\n");
	  }
}
void try6()
{
	int[][]a= {{1,2},{3,4}};
	int[][]b= {{1,1},{1,1}};
	int[][]c=new int[2][2];
	
	
	for(int row=0;row<c.length;row++)
	{
		for(int col=0;col<c[row].length;col++)
		{
			for(int k=0;k<c.length;k++)
			{
				c[row][col]+=a[row][k]*b[k][col];
			}
			System.out.print(c[row][col]+" ");
		}
		System.out.println();	
	}
	
	
	
}
	
	

		          
		            
		          
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matrixtwodim mm=new Matrixtwodim();
		//mm.try1();	
		//mm.try2();
		//mm.try3();
		//mm.try4();
		//mm.try5();
		mm.try6();

	}

}
