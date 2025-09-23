
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
}
class AsalesManger extends Salesmanger
{
	String Area;

	AsalesManger() {
		super();
	}

	
	AsalesManger(String area,int id, String name, double salary,double incetive, int target) {
		super(id,name,salary,incetive,target);
		Area = area;
	}


	String getArea() {
		return Area;
	}

	void setArea(String area) 
	{
		Area = area;
	}
	void display()
	{
		System.out.println("area allocated "+this.Area);
	}
}
	
 //class admin end here 
class TestEmp 
{

	public static void main(String[] args)
	{
		Emp e1=new Emp();
		e1.display();
		Emp e2=new Emp(101,"sachin",5000);
		e2.display();
		Hr h1=new Hr();
		h1.display();
		Hr h2=new Hr(101,"sachin",5000,254.2);
		h2.display();
		Salesmanger s1=new Salesmanger();
		s1.display();
		Salesmanger s2=new Salesmanger(101,"sachin",5000,5000,20);
		s2.display();
		Admin a1=new Admin();
		a1.display();
		Admin a2=new Admin();
		a2.display();
		AsalesManger ar2=new AsalesManger("mumbai",101,"sachin",5000,5000,20);
		ar2.display();

	}

}
