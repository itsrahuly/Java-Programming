class distance
{
	double feet;
	double inches;
	
	void setFeet(double feet)
	{
		this.feet=feet;
	}
	void setInches(double inches)
	{
		this.inches=inches;
	}

	double getFeet()
	{
		return feet;
	}
	double getInches()	
	{
		return inches;
	}
	
	void display()
	{
		System.out.println("feet:"+this.feet);
		System.out.println("inches:"+this.inches);
	}
	distance()
	{
		System.out.println("Default:");
		this.feet=2.0;
		this.inches=25.2;
	}
	distance(double f,double i)
	{
		System.out.println("parameter:");
		this.feet=f;
		this.inches=i;
	}
	

}
class Test
{
	public static void main(String []a)
	{
	
		distance d=new distance();
		d.display();
		distance d1=new distance(3.0,30.2);
		d1.display();	
	}
}	