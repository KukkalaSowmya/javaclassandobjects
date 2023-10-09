//Java program to demostrate constuctor
public class constructordemo{
  //data member or attribute
  int x;
  //create a constructor for the constructordemo class
  public constructordemo(){
    //set the initial value for the class attribute x
    x = 5;
  }
  public static void main(String[] args){
    //create an object of class constructordemo (this will call the constructor)
    constructordemo myObj = new constructordemo();
    //print the value of x
    System.out.println("x = "+myObj.x);
  }
}