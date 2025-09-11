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

}
class Test
{
	public static void main(String []a)
	{
		pstudent p=new pstudent();
		p.setCname("firstbit");
		p.setDistance(1.5);
		p.setDestination("hr");
		p.display();
	}
}	