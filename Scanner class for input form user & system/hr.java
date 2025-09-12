import java.util.Scanner;
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
	Hr()
	{
		this.id=101;
		this.name="Ram";
		this.salary=6500.00;
		this.commission=500.00;
	}
	Hr(int i,String n, double s,double c)
	{
		this.id=i;
		this.name=n;
		this.salary=s;
		this.commission=c;
		System.out.println("Parameter");
	}
}
class Test
{
	public static void main(String [] a)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a id:");
		int i=sc.nextInt();
		sc.nextLine();
		

		System.out.println("Enter a name :");
		String n=sc.nextLine();

		System.out.println("Enter a Salary:");
		double s=sc.nextDouble();

		System.out.println("Enter a commission:");
		double c=sc.nextDouble();

		
		Hr h1=new Hr();
		h1.display();
		Hr h2=new Hr(i,n,s,c);
		h2.display();
	}
}	
		
 