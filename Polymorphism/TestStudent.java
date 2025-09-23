class Student{
		int fbsId;
		String name;
		double distance;

		Student() {
			this.fbsId = 101;
			this.name = "not give name";
			this.distance = 0;
			
		}
		Student(int fbsId, String c_name, double distance) {
			
			this.fbsId = fbsId;
			this.name = c_name;
			this.distance = distance;
		}

		public int getFbsId() {
			return fbsId;
		}
		public void setFbsId(int fbsId) {
			this.fbsId = fbsId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getDistance() {
			return distance;
		}
		public void setDistance(double distance) {
			this.distance = distance;
		}
		void display()
		{
		
			System.out.println("fbs id:"+this.fbsId);
			System.out.println("name:"+this.name);
			System.out.println("distance:"+this.distance);
			
		}
}
		

class Placestudent extends Student{
	String companyName;
	String desgn;
	
	Placestudent() {
		super();
		this.companyName = "kuni tari ghya" ;
		this.desgn = "work at student";
	}

	Placestudent(int fbsId, String name, double distance,String companyName, String desgn) {
		super(fbsId,name,distance);
		this.companyName = companyName;
		this.desgn = desgn;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDesgn() {
		return desgn;
	}

	public void setDesgn(String desgn) {
		this.desgn = desgn;
	}
	void display()
	{
		super.display();
		System.out.println("company name:"+this.companyName);
		System.out.println("designation:"+this.desgn);
	}
	
	
}
class TestStudent {

	public static void main(String[] args) {
		
		Student s2=new Student(102,"sachin",300);
		s2.display();
		s2=new Placestudent(103,"rahul",500,"bcci","batsman");
		s2.display();

	}

}
