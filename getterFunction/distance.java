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

}
class Test
{
	public static void main(String []a)
	{
	
		distance d=new distance();
		d.setFeet(2.0);
		d.setInches(25.2);
		d.display();	
	}
}	