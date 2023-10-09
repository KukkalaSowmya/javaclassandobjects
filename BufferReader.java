//Java program to take input in constructor using BufferedReader class

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class BufferReader
  {
    //Instance variables
    String x;
    String y;
//BufferedReader object creation requires an InputStreamReader object as an argument/parameter
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    BufferReader() throws IOException {
      System.out.println("Enter value for x");
      // readline() method of BufferedReader is used for String input
      x = br.readLine();
      System.out.println("Enter the value for y");
      y = br.readLine(); 
    }
    //Instance method
    public void display() {
      System.out.println(x+" "+y);
    }
    public static void main(String ...args)throws IOException {
      BufferReader myObj1=new BufferReader();
      myObj1.display();
      BufferReader myObj2=new BufferReader();
      myObj2.display();
    }
  }