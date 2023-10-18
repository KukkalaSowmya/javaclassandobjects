
  import java.util.Arrays;
class Person2
{
//declaring DataMember
private int id;
private String name;
private float height;
//Encapsulation 
public void setId(int newId)
{
id = newId;
}

public void setName(String newName)
{
name = newName;
}

public void setHeight(float newHeight)
{
height = newHeight;
}

//defining method 
void Person2Details()
{
System.out.println("ID : "+id);
System.out.println("Name : "+name);
System.out.println("Height : "+height);
}
void hobbies(String ...hobbies)
{
  System.out.println(Arrays.toString(hobbies)+ "\n\n");
}
}

class Main
{
public static void main(String ...args)
{
Person p1 = new Person();
p1.setId(101);
p1.setHeight(5.7f);
p1.setName("ram");
p1.personDetails();
p1.hobbies("cricket","chess");
Person p2 = new Person();
p2.setId(102);
p2.setHeight(5.3f);
p2.setName("ramesh");
p2.personDetails();
p2.hobbies("cricket","playing pc game");
Person p3;
p3=new Person();
p3.setId(103);
p3.setName("ravikant");
p3.setHeight(5.4f);

p3.personDetails();
p3.hobbies("listening music","watching movies");


}
}