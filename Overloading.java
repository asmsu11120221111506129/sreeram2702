class Overload 
{
	void area (double h, double b)
	{
		double z = (h*b)/2;
		System.out.println("The Area of the triangle is " +z);
	}
void area (int l,int b)
{
System.out.println("The Area of the rectangle is "+(l*b));
}
void area (int a)
{
System.out.println("The Area of the square is "+(a*a));
}
}
public class Overloading
{
public static void main(String args[])
{
Overload obj = new Overload();
obj.area(10);
obj.area(10,20);
obj.area(2.5,4.5);
}
}


