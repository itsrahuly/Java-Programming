class Shape{
	String color;

	Shape() {
		super();
		this.color = "white";
	}

	Shape(String color) {
		super();
		this.color = color;
	}

	String getColor() {
		return color;
	}

	void setColor(String color) {
		this.color = color;
	}
	void display() {
		System.out.println("shape is:"+this.color);
	}
	
}
class Circle extends Shape{
	 double radius;

	Circle() {
		super();
		this.radius = 2;

	}

	Circle(double radius) {
		super();
		this.radius = radius;
	}

	double getRadius() {
		return radius;
	}

	void setRadius(double radius) {
		this.radius = radius;
	}
	void display() {
		super.display();
		System.out.println("Radius is:"+this.radius);
	}
	 
}
class Rectangle extends Shape{
	double length, width;

	Rectangle() {
		super();
		this.length = 1;
		this.width = 1;
	}

	Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	double getLength() {
		return length;
	}

	void setLength(double length) {
		this.length = length;
	}

	double getWidth() {
		return width;
	}

	void setWidth(double width) {
		this.width = width;
	}
	void display() {
		super.display();
		System.out.println("length is:"+this.length);
		System.out.println("width is :"+this.width);
	}
	
}
class TestShape {

	public static void main(String[] args) {

		Shape s1=new Shape();
		s1.display();
		Circle c1=new Circle();
		c1.display();
		Rectangle r1=new Rectangle();
		r1.display();
	}

}
