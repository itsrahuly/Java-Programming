class Emp
{
	int id;
	String name;
	double salary;
	
	void setid(int id)
	{
		this.id=id;
	}
	
	void setname(String name)
	{
		this.name=name;
	}
	
	void setsalary(double salary)	
	{
		this.salary=salary;	
	}
	
	int getId()
	{
		return this.id;
	}
	String getName()
	{
		return this.name;
	}
	double getSalary()
	{
		return this.salary;
	}
	void display()
	{
	
		System.out.println(this.id+"-"+this.name+"-"+this.salary);
	}
	Emp()
	{
		this.id=101;
		this.name="ram";
		this.salary=25000.0;	
		System.out.println("Default:");
	}
	Emp(int i,String n,double s)
	{
		this.id=i;
		this.name=n;
		this.salary=s;	
		System.out.println("Parameter");
	}


}
class Test
{
	public static void main(String []a)
	{
		Emp e1=new Emp();
		e1.display();
		Emp e2=new Emp(201,"shayam",4500.0);
		e2.display();

	}
}