class calculator
{
	void calculate(Add a1)
	{
		int result=a1.getFirstno()+a1.getSecondno();
		System.out.println("Addition:"+result);
		
	}
	void calculate(Sub s1)
	{
		int result=s1.getFirstno()-s1.getSecondno();
		System.out.println("Subtration:"+result);

	}
	void calculate(Mul m1)
	{
		int result=m1.getFirstno()*m1.getSecondno();
		System.out.println("Multiplication:"+result);

	}
	void calculate(Div d1)
	{
		int result=d1.getFirstno()/d1.getSecondno();
		System.out.println("Division:"+result);

	}
	void calculate(Mod m)
	{
		int result=m.getFirstno()%m.getSecondno();
		System.out.println("Module:"+result);
	
		
	}
}
class Add
{
	int no1,no2;
	Add()
	{
		this.no1=10;
		this.no2=20;
	}
	Add(int a,int b)
	{
		this.no1=a;
		this.no2=b;
	}
	void setFirstno(int a)
	{
		this.no1=a;
	}
	void setSecondno(int b)
	{
		this.no2=b;
	}
	int getFirstno()
	{
		return this.no1;
	}

	int getSecondno()
	{
		return this.no2;
	}
	void display()
	{
		System.out.println("Firstno:"+no1);
		System.out.println("Secondno:"+no2+"\n");
	}
}
class Sub
{
	int no1,no2;
	Sub()
	{
		this.no1=10;
		this.no2=20;
	}
	Sub(int a,int b)
	{
		this.no1=a;
		this.no2=b;
	}
	void setFirstno(int a)
	{
		this.no1=a;
	}
	void setSecondno(int b)
	{
		this.no2=b;
	}
	int getFirstno()
	{
		return this.no1;
	}

	int getSecondno()
	{
		return this.no2;
	}
	void display()
	{
		System.out.println("Firstno:"+no1);
		System.out.println("Secondno:"+no2+"\n");
	}
}
class Mul
{
	int no1,no2;
	Mul()
	{
		this.no1=10;
		this.no2=20;
	}
	Mul(int a,int b)
	{
		this.no1=a;
		this.no2=b;
	}
	void setFirstno(int a)
	{
		this.no1=a;
	}
	void setSecondno(int b)
	{
		this.no2=b;
	}
	int getFirstno()
	{
		return this.no1;
	}

	int getSecondno()
	{
		return this.no2;
	}
	void display()
	{
		System.out.println("Firstno:"+no1);
		System.out.println("Secondno:"+no2+"\n");
	}
}
class Div
{
	int no1,no2;
	Div()
	{
		this.no1=10;
		this.no2=20;
	}
	Div(int a,int b)
	{
		this.no1=a;
		this.no2=b;
	}
	void setFirstno(int a)
	{
		this.no1=a;
	}
	void setSecondno(int b)
	{
		this.no2=b;
	}
	int getFirstno()
	{
		return this.no1;
	}

	int getSecondno()
	{
		return this.no2;
	}
	void display()
	{
		System.out.println("Firstno:"+no1);
		System.out.println("Secondno:"+no2+"\n");
	}
}
class Mod
{
	int no1,no2;
	Mod()
	{
		this.no1=10;
		this.no2=20;
	}
	Mod(int a,int b)
	{
		this.no1=a;
		this.no2=b;
	}
	void setFirstno(int a)
	{
		this.no1=a;
	}
	void setSecondno(int b)
	{
		this.no2=b;
	}
	int getFirstno()
	{
		return this.no1;
	}

	int getSecondno()
	{
		return this.no2;
	}
	void display()
	{
		System.out.println("Firstno:"+no1);
		System.out.println("Secondno:"+no2+"\n");
	}
}
class Test
{
	public static void main (String [] a)
	{
		calculator c1=new calculator();

		Add a1=new Add();
		c1.calculate(a1);
		a1.display();

		Sub s1=new Sub();
		c1.calculate(s1);
		s1.display();

		Mul m1=new Mul();
		c1.calculate(m1);
		m1.display();
	
		Div d1=new Div();
		c1.calculate(d1);
		d1.display();

		Mod m=new Mod();	
		c1.calculate(m);
		m.display();
	}
}