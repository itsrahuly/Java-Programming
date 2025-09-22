class Emp
{
	int id;
	String name;
	double salary;
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

}
class Test
{
	public static void main(String []a)
	{
		Emp [] brr=new Emp[5];
		
		
		for(int i=0;i<brr.length;i++)
			System.out.println(brr[i]);
		
		brr[0]=new Emp();
		brr[1]=new Emp(301,"pavan",5000.30);



	}
}