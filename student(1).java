//Java program to demonstrate student class and its data members
public class student{
  //Declaring data membersalso known as instance variable here
  int id;
  String name;
  public static void main (String args[]){
  //Creating first object of student
    student firststudent=new student();
    //Assigning values to data members
    firststudent.id = 1;
    firststudent.name = "Ram";
    //Creating second object of student
    student secondstudent=new student();

    //Assigning values to data members of second student
    secondstudent.id = 2;
    secondstudent.name = "Sai";
    //Printing data members of first and second student object
    System.out.println("id="+firststudent.id+""+"name"+firststudent.name);
   System.out.println("id="+secondstudent.id+" "+"name="+secondstudent.name);   
  }
}