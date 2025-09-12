// Student class
class Student {
    int rollno;
    String name;
    double percentage;

    Student(int rollno, String name, double percentage) {
        this.rollno = rollno;
        this.name = name;
        this.percentage = percentage;
    }
}

// Employee class
class Employee {
    int id;
    String name;
    double annualSalary;

    Employee(int id, String name, double annualSalary) {
        this.id = id;
        this.name = name;
        this.annualSalary = annualSalary;
    }
}

// Bank class with overloaded loan approval methods
class Bank {

    // Loan approval for Student
    public void approveLoan(Student s) {
        System.out.println("Loan check for student: " + s.name);

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

    // Loan approval for Employee
    public void approveLoan(Employee e) {
        System.out.println("Loan check for employee: " + e.name);

        if (e.annualSalary > 12) {
            System.out.println("Approved Loan: $7,00,000");
        } else if (e.annualSalary >= 10) {
            System.out.println("Approved Loan: $6,00,000");
        } else if (e.annualSalary >= 6) {
            System.out.println("Approved Loan: $5,00,000");
        } else if (e.annualSalary >= 4) {
            System.out.println("Approved Loan: $4,00,000");
        } else {
            System.out.println("Loan Not Approved");
        }
    }
}
 class Test {
    public static void main(String[] args) {
        // Create a student
        Student s1 = new Student(101, "Ravi", 75.5);

        // Create an employee
        Employee e1 = new Employee(201, "Anita", 11.5);

        // Create a Bank object
        Bank bank = new Bank();

        // Approve loans
        bank.approveLoan(s1);  // For student
        System.out.println();
        bank.approveLoan(e1);  // For employee
    }
}
