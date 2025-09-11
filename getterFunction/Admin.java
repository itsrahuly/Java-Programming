class Admin
{
	int id;
	String name;
	double salary;
	double adminallows;
	
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
	void setAdminallows(double adminallows)
	{
		this.adminallows=adminallows;
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
	double getAdminall()
	{
		return adminallows;
	}
	void display()
	{
		System.out.println("id:"+this.id);
		System.out.println("name:"+this.name);
		System.out.println("salary:"+this.salary);
		System.out.println("adminall:"+this.adminallows);		
	}
	Admin()
	{
		this.id=201;
		this.name="firstbit admin";
		this.salary=6000.02;
		this.adminallows=150.30;
		System.out.println("Default call:");
	}
	Admin(int id,String a, String s,double aa)
	{
		this.id=id;
		this.name=a;
		this.salary=s;
		this.adminallows=aa;
		System.out.println("para call:");
	}

	
		
}
class Test
{
	public static void main(String []a)
 {
	Admin a1=new Admin();
	a1.display();
	Admin a2=new Admin(101,"fbs",500.0,300.00)
	a2.display();
 }

}	