
  class Mobile2
{
String brandname;
float screensize;
int model;
public void printDetails()
{
System.out.println("the brandname is "+brandname);
System.out.println("the screensize is "+screensize);
System.out.println("the model is "+model);
}
}
class mobile 
{
public static void main(String args[])
{
mobile1 mob1=new mobile1();
mob1.brandname="poco";
mob1.screensize=6.69f;
mob1.model=2427;
mob1.printDetails();
}
}
