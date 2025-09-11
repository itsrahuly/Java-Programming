class pstudent
{
	String c_name;
	double distance;
	String destination;

	void setCname(String cname)
	{
		this.c_name=cname;
	}
	void setDistance (double distance)
	{
		this.distance=distance;
	}
	void setDestination (String destination)
	{
		this.destination=destination;
	}
	
	String getCname()
	{
		return c_name;
	}
	double getDistance()
	{
		return distance;
	}
	String getDestination()
	{
		return destination;
	}
	void display()
	{
	
		System.out.println("company name:"+this.c_name);
		System.out.println("Distance:"+this.distance);
		System.out.println("Destination:"+this.destination);
		
	}
	pstudent()
	{
		this.c_name="firstbit";
		this.distance=1.5;
		this.destination="hr";
	}
	pstudent(String c, double di,String de)
	{
		this.c_name=c;
		this.distance=di;
		this.destination=de;
	}
}
class Test
{
	public static void main(String []a)
	{
		pstudent p=new pstudent();
		p.display();
		pstudent p1=new pstudent("fbs",1.0,"it");
		p1.display();
	}
}	