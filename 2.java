import java.lang.*;
import java.util.*;
class Complex
{
  int real,imaginary;
  Complex(int x,int y)
  {
real=x;
imaginary=y;
  }
  void Display()

  {
  System.out.println(real+"+"+imaginary+"i");
  }

  public static void main(String args[])

  {
             int l,b;
      Scanner s1 = new Scanner(System.in);
        System.out.print("real part =");
        l= s1.nextInt();
        System.out.print("imaginary part =");
        b= s1.nextInt();
Complex c=new Complex(l,b);
c.Display();

  }

}
