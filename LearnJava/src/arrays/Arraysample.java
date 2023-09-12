package arrays;

public class Arraysample {

	public static void main(String[] args) {
		Arraysample aa=new Arraysample();
			aa.method_1();
			//aa.method_2();
			//aa.method_3();
			//aa.method4();
	}

		private void method_1() 
		{
			// TODO Auto-generated method stub
			
		
//char[]name={'s','a','k','t','s','i'};//first repeated character
String s="sakshi";
char[]name=s.toCharArray();
			
//char[]name={'s','a','k','t','h','i'};//first repeated character
{
for(int j=0;j<name.length;j++)
{
	char ch=name[j];
	boolean repeated=false;
	
for(int i=j+1;i<name.length;i++)
{
		if(ch==name[i])
		{
			repeated=true;
			System.out.println("first repeated character is "+ch);
			break;
		}
}


		if(repeated==false)
		
			System.out.println("no repeated chracter");
			break;
}
}
		}

private void method_2()//first non repeated character
		{
	//	char name[]= {'n','a','t','r','a','j','a','n'};
			char name[]= {'a','n','a','n','d','h'};//this program is wrong for anandh so we try another way
			{
		for(int j=0;j<name.length;j++)
		{
			char ch=name[j];
			boolean repeated =false;
		for(int i=j+1;i<name.length;i++)
		{
			if(ch==name[i])
			{
				repeated=true;
			break;
			}
		}
			if(repeated==false) {
				
				System.out.println("First non repeated character is: "+ch);
				break;
			}
			
			
}
		}
			}
		
private void method_3()
{
	char name[]= {'a','n','a','n','d','h'};
	{
for(int j=0;j<name.length;j++)
{
	char ch=name[j];
	boolean repeated =false;
	//System.out.println(ch);
	if(ch=='*')
		continue;
for(int i=j+1;i<name.length;i++)
{
	if(ch==name[i])
	{
		//System.out.println(name[i]);
		repeated=true;
		name[i]='*';	
		break;
	}
}
	if(repeated==false) {
		
		System.out.println("First non repeated character is: "+ch);
		break;
	}
	
	
}
}
	}


void method4()
{
	String s="sakthipriya";
	char name[]=s.toCharArray();
	int big=0;
	char c=' ';
	
	for(int j=0;j<name.length;j++)
	{
		char ch=name[j];
		int count=1;
		if(ch=='*')
			continue;
		for(int i=j+1;i<name.length;i++)
		{
			if(ch==name[i])
			{
				name[i]='*';
				count++;
			}
		}
	
		if(count>big)
		{
			big=count;
			c=ch;
		}
		System.out.println("count of "+ch+ "is " +count);
		
	}
	System.out.println("most frequent character is : "+c);
	System.out.println("it apperars for : "+big+"times ");
	
	
}

}

		

		



