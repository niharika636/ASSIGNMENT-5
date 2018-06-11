import java.lang.*;
import java.util.*;
class Rectangle
{
  float length;

  float breadth;

  Rectangle()

  {

    length=0;

    breadth=0;

  }
  float CalculateArea(float l,float b)

  {
  length=l;
breadth=b;
    float rectArea=length*breadth;

    return rectArea;

  }

  public static void main(String args[])

  {

    Rectangle r=new Rectangle();
             float l,b;
      Scanner s1 = new Scanner(System.in);
        System.out.println("Enter length of Rectangle:");
        l= s1.nextFloat();
        System.out.println("Enter width of Rectangle");
        b= s1.nextFloat();

    System.out.println("Area of rectangle="+r.CalculateArea(l,b));

  }

}
