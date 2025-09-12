class Source
{
    // Add two Time objects
    Time add(Time t1, Time t2)
    {
        int hr = t1.getHr() + t2.getHr();
        int min = t1.getMin() + t2.getMin();
        int sec = t1.getSec() + t2.getSec();

        // Normalize
        if (sec >= 60) {
            min += sec / 60;
            sec %= 60;
        }
        if (min >= 60) {
            hr += min / 60;
            min %= 60;
        }
        if (hr >= 24) {
            hr %= 24;
        }

        return new Time(hr, min, sec);
    }

    // Add hours
    Time add(Time t1, int hrs)
    {
        int hr = t1.getHr() + hrs;
        int min = t1.getMin();
        int sec = t1.getSec();

        if (hr >= 24) {
            hr %= 24;
        }

        return new Time(hr, min, sec);
    }

    // Add hours, minutes, seconds
    Time add(Time t1, int hrs, int mins, int secs)
    {
        int hr = t1.getHr() + hrs;
        int min = t1.getMin() + mins;
        int sec = t1.getSec() + secs;

        if (sec >= 60) {
            min += sec / 60;
            sec %= 60;
        }
        if (min >= 60) {
            hr += min / 60;
            min %= 60;
        }
        if (hr >= 24) {
            hr %= 24;
        }

        return new Time(hr, min, sec);
    }
}
		

class Time
{
	int hr,min,sec;
	
	Time()
	{
		this.hr=0;
		this.min=00;
		this.sec=000;
	}
	Time(int h,int m,int s)
	{
		this.hr=h;
		this.min=m;
		this.sec=s;
	}
	void setHr(int h)
	{
		this.hr=h;
	}
	void setMin(int m)
	{
		this.min=m;
	}
	void setSec(int s)
	{
		this.sec=s;
	}
	int getHr()
	{
		return this.hr;
	}
	int getMin()
	{
		return this.min;
	}
	int getSec()
	{
		return this.sec;
	}
	void display()
	{
		System.out.println(this.hr+"hr-"+this.min+"min-"+this.sec+"sec");
	}
}

class Test
{
    public static void main(String []a)
    {
        Source s = new Source();

        // Create two Time objects
        Time t1 = new Time();
	
	
        Time t2 = new Time(5, 30, 20);
	s.add(t1,t2);
	t1.display();
	t2.display();
    }
}	