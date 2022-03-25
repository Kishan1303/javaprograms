class student 
{
	int m1 , m2 , m3 ,tot;
	student(int m1 , int m2 , int m3)
	{
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	void show()
	{
		tot = m1+m2+m3;
		System.out.println("Total is :"+tot);
		System.out.println("Persantage is :"+tot/3);
	}
}
class stdno extends student
{
	int rollno ; 
	stdno(int m1 , int m2 ,int m3 , int rollno)
	{
		super(m1,m2,m3);
		this.rollno = rollno;
	}
	void std()
	{
		System.out.println("Roll no :"+rollno);
	}
}
class res 
{
	public static void main(String args[])
	{
		stdno s = new stdno(56,89,89,10);
		s.show();
		s.std();
	}
}