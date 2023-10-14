abstract class Shape
{
	abstract void calArea();
	void printArea()
	{
		System.out.println("Shape area");

	}
}

class Rectangle extends Shape
{
        void calArea()
        {
                System.out.println("calArea of Rectangle");
        }
}

class Square extends Shape
{
        void calArea()
        {
                System.out.println("calArea of Square");
        }
}

class Circle extends Shape
{
	void calArea()
	{
		System.out.println("calArea of Circle");
	}
}

class PolymorphismDemo
{
	public static void main(String args[])
	{
		Shape shp[] = new Shape[3];
		shp[0] = new Rectangle();
		shp[1] = new Square();
		shp[2] = new Circle();

		for (int i = 0; i < shp.length; i++)
		{
			shp[i].calArea();
		}
	}
}
