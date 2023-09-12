public class Overload
{
int sum (int a,int b)
{
int c=a+b;
System.out.println(c);
return c;
}
double sum(double a,double b)
{
double c=a+b;
System.out.println(c);
return c;
}

public static void main(String args[])
{
Overload o=new Overload();
o.sum(1,2);
o.sum(1.2,2.1);
}
}
