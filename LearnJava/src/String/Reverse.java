package String;

public class Reverse {
	public static String s3="";
	  public static void main(String[] args) 
	    {
	     // stripLeading();
	    //stripTrailing();
	    //trim(); 
	    //  contains();
	    //removeUnwantedSpace();
	    //splitArray(); 
	    reverse(); 
	      }

	  

	  private static void reverse() {
	    // TODO Auto-generated method stub
	    String s = "Today is Friday";
	    String s2="", s3="";
	    for(int i=s.length()-1; i>=0; i--)
	    {
	      if(s.charAt(i)!=' ')
	        s2 = s2 + s.charAt(i);
	      else
	      {
	        reverseWord(s2);
	        s2 = "";
	      }
	    }
	    s3 =reverseWord(s2);
	    System.out.println(s3);
	    
	  }



	  private static String reverseWord(String name) {
	    // TODO Auto-generated method stub
	    
	    for(int i=name.length()-1; i>=0; i--)
	    {
	      s3 = s3+name.charAt(i);
	    }
	    s3 = s3+" ";
	    return s3;
	  }

	

	

}
