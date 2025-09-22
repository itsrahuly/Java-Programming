class Student
{
	int fbsid;
	String name;
	double distancetraved;
	static int studentcount;
	static
	{
		studentcount=0;
	}
//constructor
	Student()//non static function
	{
		this.fbsid=0;
		this.name="ram";
		this.distancetraved=2.5;
.
		studentcount++;//static variable
	}
//parameter constructor
	Student(int i,String n,double dt)
	{
		this.fbsid=i;
		this.name=n;
		this.distancetraved=dt;
		studentcount++;
	}
//setter
	void setFbsid(int id)
	{
		this.fbsid=id;
	}
	void setName(String name)
	{
		this.name=name;
	}	
	void setDistance(double di)
	{
		this.distancetraved=di;
	}	
	void setStudentcount(int sc)
	{
		this.studentcount=sc;
	}
//getter
	int getFbsid()
	{
		return fbsid;
	}
	String getName()
	{
		return name;
	}
	double getDistance()
	{
		return distancetraved;
	}
	static int getStudentcount()//static function
	{
		return studentcount;
	}
//display
	void display()
	{
		System.out.println("Fbs Id:"+fbsid);
		System.out.println("Student Name:"+name);
		System.out.println("Distance Traveled:"+distancetraved);
		System.out.println("Student Count:"+studentcount+"\n");
	}
}
//class student ends here
class Test
{
	public static void main(String [] a)//main start
	{
		Student s=new Student();
		s.display();
		Student s1=new Student(1,"sham",1.5);
		s1.display();
		Student s2=new Student(2,"rohan",3);
		s2.display();
		Student.getStudentcount();
	
	}//main end
}
// class Test end here
