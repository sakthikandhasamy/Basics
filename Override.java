public class Override
{
public static void main(String args[])
{
SBI sbi=new SBI();
sbi.display();
sbi.accountopen();
}
}



class RBI
{
void display()
{
System.out.println("Welcome to  RBI bank");
}
void accountopen()
{
System.out.println("Fill the form");
}
}



class SBI extends RBI
{
void display()
{
System.out.println("Welcome to  SBI bank");
}
}
