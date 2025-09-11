class Car
{
	int model;
	int year;
	double price;
	String brand;
	
	void setModel(int model)
	{
		this.model=model;
	}
	
	void setYear(int year)
	{
		this.year=year;
	}
	
	void setPrice(double price)
	{
		this.price=price;	
	}
	
	void setBrand(String brand)
	{
		this.brand=brand;
	}
	int getModel()
	{
		return this.model;
	}
	int getYear()
	{
		return this.year;
	}
	double getPrice()
	{
		return this.price;
	}
	String getBrand()
	{
		return this.brand;
	}

	void display()
	{
	
		System.out.println("Model:"+this.model);
		System.out.println("Year:"+this.year);
		System.out.println("Price:"+this.price);
		System.out.println("Brand:"+this.brand);
	}
}
class Test
{
	public static void main(String []a)
	{
		Car d1=new Car();
		d1.setModel(12345);
		d1.setYear(2012);
		d1.setPrice(5000.00);
		d1.setBrand("motor");
		d1.display();
	}
}	
