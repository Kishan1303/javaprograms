class book 
{
	String nm , a , p;
	book(String nm , String a ,String p)
	{
		this.nm =nm ;
		this.a=a;
		this.p=p;
		
	}
	void show()
	{
		System.out.println("Name is :"+nm);
		System.out.println("Author is :"+a);
		System.out.println("Publisher is :"+p);
	}
}
class bookpages extends book
{
	int page;
	bookpages(String nm ,String a , String p , int page)
	{
		super(nm,a,p);
		this.page = page;
	}
	void page()
	{
		super.show();
		System.out.println("Page no :"+page);
	}
}
class bookprice extends bookpages
{
	double price ;
	bookprice(String nm , String a , String p ,int page , int price)
	{
		super(nm,a,p,page);
		this.price=price;
	}
	void showall()
	{
		super.page();
		System.out.println("Price is :"+price);
	}
}
class bookdetail 
{
	public static void main(String args[])
	{
		bookprice bp = new bookprice("KB","kb","kb",500,450);
		bp.showall();
	}
}