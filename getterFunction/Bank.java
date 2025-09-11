class Bank
{
	int accno;
	String holdername;
	double balance;
	String branch;

	void setAccno(int no)
	{
		this.accno=no;
	}
	void setHoldername(String name)
	{
		this.holdername=name;
	}
	void setBalance(double balance)
	{
		this.balance=balance;
	}
	void setBranch(String branch)
	{
		this.branch=branch;
	}
	int getAccno()
	{
		return accno;
	}
	String getHoldername()
	{
		return holdername;
	}
	double getBalance()
	{
		return balance;
	}
	String getBranch()
	{
		return branch;
	}
	void display()
	{
		System.out.println("Account no:"+this.accno);
		System.out.println("Holder Name:"+this.holdername);
		System.out.println("Balance:"+this.balance);
		System.out.println("Branch:"+this.branch);
		

	}
}

class Test
{
	public static void main (String [] a)
	{
		Bank b1=new Bank();
		b1.setAccno(45785555);
		b1.setHoldername("Rahul");
		b1.setBalance(502100.12);
		b1.setBranch("Latur");
		b1.display();
	}
}	