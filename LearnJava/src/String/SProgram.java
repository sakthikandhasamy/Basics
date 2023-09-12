package String;

public class SProgram {
	void tolowercase()
	{
		String s="ABCD1234";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				System.out.print((char)(ch+32));
			}
			else
				System.out.print(ch);
		}
	}
	void touppercase()
	{
		String s="abcd1234";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='a'&&ch<='z')
			{
				System.out.print((char)(ch-32));
			}
			else
				System.out.print(ch);
		}
	}
	void onetoone()
	{
		String s="sakthi";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(i%2==0)
			{
			if(ch>='a'&&ch<='z')
			
				System.out.print((char)(ch-32));
			}
			else
				System.out.print(ch);
		
		}
	}
	void firstlastmid()
	{
		String s="sakthi";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(i==0||i==s.length()-1||i==s.length()/2)
			{
				if(ch>='a'&&ch<='z')
					
					System.out.print((char)(ch-32));
				}
				else
					System.out.print(ch);
			}
	
	}
	void uppflm()
	{
		String s="sakthi priya kandhasamy";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(i==0)
			{
				if(ch>='a'&&ch<='z')
					System.out.print((char)(ch-32));
			}
			else if(ch==' ') {
				System.out.print(ch);
				i++;
				ch=s.charAt(i);
			if(ch>='a'&&ch<='z')
				System.out.print((char)(ch-32)); }
			else
				System.out.print(ch);
			}
		}
	void lfmupp()
	{
		String s = "sakthi priya kandhasamy";
	    for(int i=0;i< s.length();i++)   {
	    char ch = s.charAt(i);
	    if(i==0 ||i==s.length()-1)   {
	      if(ch>='a' && ch<='z')
	        System.out.print((char)(ch-32));}
	    else if(ch==' ') {
	      System.out.print(ch);
	      i++; 
	      ch = s.charAt(i);
	      if(ch>='a' && ch<='z')
	        System.out.print((char)(ch-32));}    
	    else
	    {
	      int j = i+1; 
	      if(j<s.length() && s.charAt(j)==' ')
	      {
	        if(ch>='a' && ch<='z')
	          System.out.print((char)(ch-32));
	      }
	      else
	        System.out.print(ch);
	      
	    }}
		}
	void stripleading()
	{
		String s="   How are you";
		boolean first =false;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' '&&first==false)
			{
				continue;
			}
			else 
			{
			first=true;
			System.out.print(s.charAt(i));
			}
		}
	} 
	void striptrailing()
	{
		String s="how are you   ";
		int last=s.length()-1;//or 0
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)!=0)
			{
				last=i;
				break;
			}
		}
		for(int i=0;i<=last;i++)
		{
			System.out.print(s.charAt(i));
		}
	}
	void trim()
	{
		String s = "     How Are you    "; 
	    int start = 0, end = s.length()-1; 
	    boolean first = false, last = false; 
	    for(int i=0; i<s.length();i++)
	    {
	      if(s.charAt(i)==' ' && first == false)
	      {
	       start++;
	      }
	      else
	      {
	        first = true; 
	 
	      }
	      if(s.charAt(end)==' ' && last == false)
	      {
	        end--; 
	      }
	      else {
	        last = true; 
	        //end  = i; 
	      }
	      if(first==true && last == true)
	      {
	        for(int j=start; j<=end;j++)
	          System.out.print(s.charAt(j));
	        break; 
	      }
	    }
	}
	void contains() {
	String s1 = "Today is Thursday"; 
    String s2= "day"; 
    for(int i=0; i<s1.length(); i++) 
    { 
      if(s2.charAt(0)==s1.charAt(i)) 
         { 
             int count=0; 
             for(int j=0; j<s2.length(); j++) 
               { 
                 if(s2.charAt(j)==s1.charAt(i)) 
                     { 
                       count++; 
                       i++; 
                      } 
                } 
                 if(count == s2.length()) 
                    { 
                       System.out.println("Yes Contains"); 
                       break; 
                    } 
                else 
                    System.out.println("Doesn't contains"); 
                    break; 
            } 
    } 


}
	void removeunwanted()
	{
		/*String s="How      are     you";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				System.out.print(s.charAt(i));
			}
			else
			{
				System.out.print(s.charAt(i));

				for(int j=i;j<s.length();j++)
				{
					if(s.charAt(j)==' ') 
					{
				continue;
				}
					else {
						i=j-1;
						break;
					}
					
				}
			}
		}*/
		String s="how       are      you";
		boolean space=false;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				System.out.print(s.charAt(i));
				space=false;
			}
			else if(space==false)
			{
				System.out.print(s.charAt(i));
				space=true;
			}
		}
		
	}
	void splaitarray()
	{
		int [] ar= {18,10,3,19,7,22,14,3};
		int key=15;
		for(int i=0,j=0;i<ar.length;i++)
		{
			if(ar[i]<key)
			{
				int temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
				j++;	
			}
		}
			for(int  i=0;i<ar.length;i++)
			{
				System.out.print(ar[i]+" ");
			}
		
	}
	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SProgram ss=new SProgram();
	//ss.tolowercase();
		//ss.touppercase();
		//ss.onetoone();
		//ss.firstlastmid();
		//ss.uppflm();
		//ss.lfmupp();
		//ss.stripleading();
		//ss.striptrailing();
		//ss.trim();
		//ss.contains();
		ss.removeunwanted();	
		//ss.splaitarray();
	}
	
}
