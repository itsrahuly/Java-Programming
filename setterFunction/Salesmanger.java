class Salesmanger
{
	int id;
	String name;
	double salary;
	double incetive;
	int target;

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
	
	void setIncetive(double incetive)
	{
		this.incetive=incetive;
	}

	void setTarget(int target)
	{
		this.target=target;
	}
}

class Test
{
	public static void main(String [] a)
	{
		Salesmanger s1=new Salesmanger();
		
		s1.setId(10);
		s1.setName("Rohit");
		s1.setSalary(25000.0);
		s1.setIncetive(1000.0);
		s1.setTarget(10);

		System.out.println("id:"+s1.id);
		System.out.println("name:"+s1.name);
		System.out.println("salary:"+s1.salary);
		System.out.println("incetive:"+s1.incetive);
		System.out.println("target:"+s1.target);
	}
}