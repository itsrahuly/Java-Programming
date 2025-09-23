class Person{
	String name;
	int age;
	
	Person() {
		this.name = "sachin";
		this.age = 54;
	}

	Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}
	void display() {
		System.out.println("Name is:"+this.name);
		System.out.println("Age is:"+this.age);
	}
}
class Studen extends Person{
	String course;
	

	Studen() {
		super();
		this.course = "java full stack";
	}


	Studen(String course,String name, int age) {
		super(name,age);
		this.course = course;
	}


	String getCourse() {
		return course;
	}


	void setCourse(String course) {
		this.course = course;
	}
	
	void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("course"+this.course);
	}
	
	
}
class Teacher extends Person{
	double salary;
	

	Teacher() {
		super();
		this.salary = 453.20;
	}


	Teacher(double salary,String name, int age) {
		super(name,age);
		this.salary = salary;
	}
	
	void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Salary is "+this.salary);
	}
}

class TestPerson {

	public static void main(String[] args) {
		Person p1=new Person();
		p1.display();
		Studen s1=new Studen();
		s1.display();
		Teacher t1=new Teacher();
		t1.display();

	}

}
