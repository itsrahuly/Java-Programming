class Student
{
	int roll;
	String name;
	double marks;

	void setRoll(int roll)
	{
		this.roll=roll;
	}
	void setName(String name)
	{
		this.name=name;
	}
	void setMarks(double marks)
	{
		this.marks=marks;
	}
	int getRoll()
	{
		return this.roll;
	}
	String getName()
	{
		return this.name;
	}
	double getMarks()
	{
		return this.marks;
	}
	void display()	
	{
		System.out.println("id:"+this.roll);
		System.out.println("name:"+this.name);
		System.out.println("marks:"+this.marks);
	}
	Student()
	{
		this.roll=101;
		this.name="sachin";
		this.marks=85.60;
	}
	Student(int r,String n, double m)
	{
		this.roll=r;
		this.name=n;
		this.marks=m;
	}
}

class Test
{
	public static void main(String [] a)
	{
		Student s1=new Student();
		s1.display();
		Student s2=new Student(201,"rahul",80.0);
		s2.display();
	}
}