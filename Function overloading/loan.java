class Loan
{
	void approveloan(Student s)
	{
	if (s.percentage > 80) {
            System.out.println("Approved Loan: $2,00,000");
        } else if (s.percentage >= 60) {
            System.out.println("Approved Loan: $1,00,000");
        } else if (s.percentage >= 40) {
            System.out.println("Approved Loan: $50,000");
        } else {
            System.out.println("Loan Not Approved");
        }

}
	void approveloan(Employe e)
	{
	if (e.annualsalary > 12) {
            System.out.println("Approved Loan: $7,00,000");
        } else if (e.annualsalary >= 10) {
            System.out.println("Approved Loan: $6,00,000");
        } else if (e.annualsalary >= 6) {
            System.out.println("Approved Loan: $5,00,000");
        } else if (e.annualsalary >= 4) {
            System.out.println("Approved Loan: $4,00,000");
        } else {
            System.out.println("Loan Not Approved");
        }

	}
}
class Student
{
	
    int rollno;
    String name;
    double percentage;
	
	Student()
	{
		this.rollno=1;
		this.name="ram";
		this.percentage=80.20;
	}
	Student(int r,String n,double p)
	{
		this.rollno=r;
		this.name=n;
		this.percentage=p;
	}
	void setRoll(int r)
	{
		this.rollno=r;
	}
	void setName(String n)
	{
		this.name=n;
	}
	void setPercentage(double p)
	{
		this.percentage=p;
	}
	int getRoll()
	{
		return this.rollno;
	}
	String getName()
	{
		return this.name;
	}
	double getPercentage()
	{
		return this.percentage;
	}
	void display()
	{
		System.out.println("rollno:"+this.rollno);
		System.out.println("name:"+this.name);
		System.out.println("percentage:"+this.percentage);
	}
}
class Employe
{
 	int id;
   	String name;
    	double annualsalary;
	Employe()
	{
		this.id=2;
		this.name="shyam";
		this.annualsalary=55550.0;
	}
	Employe(int i,String n,double a)
	{
		this.id=i;
		this.name=n;
		this.annualsalary=a;
	}
	void setid(int i)
	{
		this.id=i;
	}
	void setName(String n)
	{
		this.name=n;
	}
	void setSalary(double p)
	{
		this.annualsalary=p;
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
		return this.annualsalary;

	}
	void display()
	{
		System.out.println("int:"+this.id);
		System.out.println("name:"+this.name);
		System.out.println("annualsalary:"+this.annualsalary);
	}
}
class Test
{
	public static void main(String [] a)
	{
		Loan l1=new Loan();
		//l1.display();

		Student s1=new Student();
		s1.display();
		l1.approveloan(s1);
		
		Employe e1=new Employe();
		e1.display();
		l1.approveloan(e1);
	}
}
