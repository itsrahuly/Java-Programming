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
	double getIncetive()
	{
		return this.incetive;
	}
	int getTarget()	
	{
		return this.target;
	}

	void display()
	{
		System.out.println("id:"+this.id);
		System.out.println("name:"+this.name);
		System.out.println("salary:"+this.salary);
		System.out.println("incetive:"+this.incetive);
		System.out.println("target:"+this.target);
	}

	Salesmanger()
	{
		this.id=10;
		this.name="rohit";
		this.salary=25000.0;
		this.incetive=1000.0;
		this.target=10;
	}

	Salesmanger(int i,String n,double s, double in, int t)
	{
		this.id=i;
		this.name=n;
		this.salary=s;
		this.incetive=in;
		this.target=t;
	}
}

class Test
{
	public static void main(String [] a)
	{
		Salesmanger s1=new Salesmanger();
		s1.display();
		Salesmanger s2=new Salesmanger(201,"amar",65421.0,600.0,50);
		s2.display();

	}
}