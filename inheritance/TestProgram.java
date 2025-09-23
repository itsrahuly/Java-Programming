class Employee {
    int empId;
    String empName;
    double salary;

    Employee() {
		super();
	}

	Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }
	

    int getEmpId() {
		return empId;
	}

	void setEmpId(int empId) {
		this.empId = empId;
	}

	String getEmpName() {
		return empName;
	}

	void setEmpName(String empName) {
		this.empName = empName;
	}

	double getSalary() {
		return salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}

	void display() {
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary        : " + salary);
    }
}

class Developer extends Employee {
    String programmingLanguage;
    String projectName;
    

    Developer() {
		super();
	}

	Developer(int empId, String empName, double salary, String programmingLanguage, String projectName) {
        super(empId, empName, salary);
        this.programmingLanguage = programmingLanguage;
        this.projectName = projectName;
    }

    String getProgrammingLanguage() {
		return programmingLanguage;
	}

	void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}

	String getProjectName() {
		return projectName;
	}

	void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	void display() {
        super.display();  // show Employee details
        System.out.println("Language      : " + programmingLanguage);
        System.out.println("Project       : " + projectName);
    }
}

class TestProgram {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Rahul", 50000);
        e1.display();

        System.out.println("----------------");

        Developer d1 = new Developer(102, "Venkat", 70000, "Java", "Insurance Portal");
        d1.display();
    }
}


