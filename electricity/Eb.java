public class Ebbill {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  Ebbill eb=new Ebbill();
  eb.eb_amount(630);
 
 }

 private void eb_amount(int unit) {
  // TODO Auto-generated method stub
  double bill_pay=0;
  
  if(unit<=500)
  
  {
  if(unit<=100)
  {
   bill_pay=unit*0;
   
  }
  else if(unit<=200)
  {
   bill_pay=(100*0)+((unit-100)*2.25);
  }
  else if(unit<=400)
  {
   bill_pay=(100*0)+(100*2.25)+((unit-200)*4.50);
  }
  else if(unit<=500)
  {
   bill_pay=(100*0)+(100*2.25)+(200*4.50)+((unit-400)*6.00);
  }
  }
 
  else
  {
  
  if(unit<=100)
  {
   bill_pay=unit*0;
  }
  if(unit<=400)
  {
   bill_pay=(100*0)+((unit-300)*4.50);
   
  }
  if(unit<=500)
  {
   bill_pay=(100*0)+(300*4.50)+((unit-400)*6.00);
  }
  if(unit<=600)
  {
   bill_pay=(100*0)+(300*4.50)+(100*6.00)+((unit-500)*8.00);
  }
  if(unit<=800)
  {
   bill_pay=(100*0)+(300*4.50)+(100*6.00)+(200*8.00)+((unit-700)*9.00);
  }
  if(unit<=1000)
  {
   bill_pay=(100*0)+(300*4.50)+(100*6.00)+(200*8.00)+(200*9.00)+((unit-900)*10.00);
  }
  if(unit>1000)
  {
   bill_pay=(100*0)+(300*4.50)+(100*6.00)+(200*8.00)+(200*9.00)+(200*10.00)+((unit-1000)*11.00);
  } 
   
   
  } 
   System.out.println("Bill Amount:"+bill_pay+" "+"Rs");
  

 }

}

