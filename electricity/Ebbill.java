import java.util.Scanner;
public class Ebbill
{
int units;
double amount;
int n;

void calculation()
{

if(units<=500) 
{
if(units<=100) 
 {
    amount=0;
    System.out.println("Your Bill : "+amount);
 }
if(units>=101 && units<=200)
 {
    amount=(0)+(units-100)*2.25;                                   
    System.out.println("Your Bill: "+amount);
 }
 if(units>=201 && units<=400)
 {
    amount=(100*0)+(100*2.25)+(units-200)*4.50;
    System.out.println("Your Bill: "+amount);
 }
 if(units>=401 && units<=500)
 {
    amount=(0)+(100*2.25)+(200*4.50)+(units-400)*6.0;
    System.out.println("Your Bill: "+amount);
 }
}

else if (units>500)
 {
if(units<=100)
 {
    amount=units*0;
    //System.out.println("Your Bill: "+amount);
 }
 if(units>=101 && units<=400)
 {
    amount=(units-100)*4.50;
    //System.out.println("Your Bill: "+amount);
 }
 if(units>=401 && units<=500)
 {
    amount=(300*4.50)+(units-400)*6.0;
   // System.out.println("Amount"+amount);
 }

 if(units>=501 && units<=600)
 {   
    amount=(300*4.50)+(100*6.0)+(units-500)*8.0;
    System.out.println("Your Bill: "+amount);
 }
 if(units>=601 && units<=800)
 {   
    amount=(300*4.50)+(100*6.0)+(100*8.0)+(units-600)*9.0;
    System.out.println("Your Bill: "+amount);
 }
 if(units>=801 && units<=1000)
 {   
    amount=(300*4.50)+(100*6.0)+(100*8.0)+(200*9.0)+(units-800)*10.0;
    System.out.println("Your Bill: "+amount);
 }
 if(units>1000)
 {   
    amount=(300*4.50)+(100*6.0)+(100*8.0)+(200*9.0)+(200*10.0)+(units-1000)*11.0;
    
    System.out.println("Your Bill: "+amount);
 }
}


}

//return amount;


public void display()
{
System.out.println("EB BILL CALCULATION");
System.out.println("*******************");
System.out.print("Enter units: ");
Scanner sc=new Scanner(System.in);
units=sc.nextInt();


}

public static void main(String args[])
{

//units=sc.nextInt();
Ebbill e=new Ebbill();
e.display();
e.calculation();

}



}
