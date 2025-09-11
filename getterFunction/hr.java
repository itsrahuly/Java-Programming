class Hr
{
	int id;
	String name;
	double salary;
	double commission;
	
	void setId(int id)
	{
		this.id=id;
	}
 	void setName(String name)
	{
 		this.name=name;
	}
 	void setSalary(double salary)
	{
 		this.salary=salary;
	}
	void setCommission(double commission)
	{
		this.commission=commission;
	}
	
	int getId()
	{
		return id;
	}
 	String getName()
	{
		return name;
	}
	double getSalary()
	{
 		return salary;
	}
	double  getComission()
	{
		return commission;
	}
	void display()
	{		
		System.out.println("id:"+this.id);
		System.out.println("name:"+this.name);
		System.out.println("salary:"+this.salary);
		System.out.println("commission:"+this.commission);
	}
}
class Test
{
	public static void main(String [] a)
	{
		Hr h1=new Hr();
		h1.setId(201);
		h1.setName("rohan");
		h1.setSalary(2500.0);
		h1.setCommission(2.3);
		h1.display();
	}
}	
		
 