class date
{
	int day ,month ,year;
	String dow;

	void setday(int a)
	{
		this.day=a;
	}

	void setmonth(int a)
	{
		this.month=a;
	}
	void setyear(int a)
	{
		this.year=a;
	}
	void setdow(String str)
	{
		this.dow=str;
	}



}//class time end here

class test
{
	public static void main(String []a)
  	
	{
		date d1=new date();
		d1.setday(3);
		d1.setmonth(9);
		d1.setyear(2025);	
		d1.setdow("Hello world");
		
	System.out.println(d1.day+"-"+d1.month+"-"+d1.year);
	System.out.println(d1.dow);

  	}//main end

}//class source end