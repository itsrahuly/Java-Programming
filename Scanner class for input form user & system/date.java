import java.util.Scanner;
class Date
{
	int day ,month ,year;
	String dow;

	void setDay(int a)
	{
		this.day=a;
	}

	void setMonth(int a)
	{
		this.month=a;
	}
	void setYear(int a)
	{
		this.year=a;
	}
	void setDow(String str)
	{
		this.dow=str;
	}

	int getDay()
	{
		return this.day;

	}

	int getMonth()
	{
		return this.month;
	}
	int getYear()
	{	
		return this.year;
	}
	String getDow()
	{
		return this.dow;
	}

	void display()
	{
			System.out.println(this.getDay()+"/"+this.getMonth()+"/"+this.getYear()+"-"+this.getDow());
	}
	Date()
	{
		this.day=8;
		this.month=9;
		this.year=2025;
		this.dow="mon";
		System.out.println("Default call:");
	}
	Date(int d,int m, int y, String s)
	{
		this.day=d;
		this.month=m;
		this.year=y;
		this.dow=s;
		System.out.println("parameter call:");

	}	
		
}//class time end here

class Test
{
	public static void main(String []a)
  	
	{
		Scanner sc=new Scanner(System.in);
				
		System.out.println("Enter a date:");
		int d=sc.nextInt();
		

		System.out.println("Enter a month :");
		int m=sc.nextInt();

		System.out.println("Enter a year:");
		int y=sc.nextInt();
		sc.nextLine();

		System.out.println("Enter a date of week:");
		String dow=sc.nextLine();
		

		Date d1;
		d1=new Date();
		d1.display();

		Date d2;
		d2=new Date(d,m,y,dow );
		d2.display();
		
	
  	}//main end

}//class source end