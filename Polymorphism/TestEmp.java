class Emp
{
	int id;
	String name;
	double salary;
	static int count;
	static {
		count=0;
	}
	
	Emp() 
	{
		
		super();
		System.out.println("emp  default constructor call");
		count++;
	}

	Emp(int id, String name, double salary) {
		super();
		System.out.println("emp  parameter constructor call");
		this.id = id;
		this.name = name;
		this.salary = salary;
		count++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	void display()
	{
		System.out.println("Emp Id:"+this.id);
		System.out.println("Emp Name:"+this.name);
		System.out.println("Emp Salary:"+this.salary);

	}
	double calcSal()
	{
		
		return salary;
	}
	
}//class emp end here 
class Hr extends Emp
{
	double commission;
	

	Hr() {
		
		super();
		System.out.println("hr default constructor call");
	}

	Hr(int id, String name, double salary,double commission) {
		
		super(id,name,salary);
		System.out.println("hr parameter constructor call");
		this.commission = commission;
	}

	double getCommission() {
		return commission;
	}

	void setCommission(double commission) {
		this.commission = commission;
	}
	void display()
	{
		super.display();
		System.out.println("Emp commission "+this.commission);
	}
	double calcSal()
	{
		
		return salary+commission;
	}
}//class hr ends here 
class Salesmanger extends Emp
{
	double incetive;
	int target;
	
	Salesmanger() {
		super();
		System.out.println("salesmanger default constructor call");
	}

	Salesmanger(int id, String name, double salary,double incetive, int target) {
		super(id,name,salary);
		System.out.println("salessmanger parameter constructor call");
		this.incetive = incetive;
		this.target = target;
	}

	double getIncetive() {
		return incetive;
	}

	void setIncetive(double incetive) {
		this.incetive = incetive;
	}

	int getTarget() {
		return target;
	}

	void setTarget(int target) {
		this.target = target;
	}
	void display()
	{
		super.display();
		System.out.println("incetive:"+this.incetive);
		System.out.println("target:"+this.target);
	}
	double calcSal()
	{
		return salary+incetive;
	}
	
	
}//class slaesmanger end here
class Admin extends Emp
{
	double adminallows;
	
	Admin() {
		
		super();
		System.out.println("admin default constructor call");
	}

	Admin(int id, String name, double salary,double adminallows) {
		super(id,name,salary);
		System.out.println("admin parameter constructor call");
		this.adminallows = adminallows;
	}

	double getAdminallows() {
		return adminallows;
	}

	void setAdminallows(double adminallows) {
		this.adminallows = adminallows;
	}
	void display()
	{
		super.display();
		System.out.println("adminallows"+this.adminallows);
	}
	double calcSal()
	{
		return salary+adminallows;
	}
}

class TestEmp {

	public static void main(String[] args) {
		Emp e1;
		e1=new Emp(101,"sachin",20002);
		double a=e1.calcSal();
		System.out.println("employe salary"+a);
		e1=new Salesmanger(102,"rahul",65200,5000,20);
		double b=e1.calcSal();
		System.out.println("salesmanger salary"+b);
		e1=new Hr(103,"virat",5000,254.2);
		double c=e1.calcSal();
		System.out.println("Hr salary"+c);

		e1=new Admin(105,"raina",9000,5000);
		double d=e1.calcSal();
		System.out.println("Admin salary"+d);


	}

}
