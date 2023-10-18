 import java.util.Arrays;
class Person
{
//declaring DataMember
int id;
String name;
float height;

//defining method 
void personDetails()
{
System.out.println("ID : "+id);
System.out.println("Name : "+name);
System.out.println("Height : "+height);
}
void hobbies(String ...hobbies)
{
  System.out.print(Arrays.toString(hobbies)+"\n\n");  
}

}
