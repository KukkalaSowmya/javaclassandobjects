
  import java.util.Arrays;
class Mobile{
//declaring DataMember
private String brandname;
private int screensize;
private String model;

  //Encapsulation 
  public void setbrandname(string newbrandname)
  {
    brandname = newbrandname;
  }

  public void setscreensize(int newscreensize)
  {
    screensize= newscreensize;
  }

  public void setmodel(String newmodel)
  {
    model= newmodel;
  }

//defining method 
void printDetails() {
System.out.println("Brandname : "+brandname);
System.out.println("screensize : "+screensize);
System.out.println("Model : "+model);
}
  void performance(String ...performance)
  {   
  System.out.print(Arrays.toString(performance)+"\n\n");  
  }
}

class Main
{
public static void main(String ...args)
{
Mobile m1 = new Mobile();
m1.setbrandname = "Samsung";
m1.setscreensize = 6.1;
m1.setmodel = "Galaxy S";
  m1.performance("battery","storage");
  m1.printdetails();
  }
  }