class Mobile
{
	String model;
	double price;
	void call()
	{
		System.out.println(" calling in : "+model);
	}
	void message()
	{
	    System.out.println(" message in : "+price);
	}
}
public class Mainclass33
{
	public static void main(String[] args)
	{
		Mobile m1=new Mobile();
		m1.model="s24 ultra";
		m1.price=1.5;
		m1.call();
		m1.message();
		Mobile m2=new Mobile();
		m2.model="Iphone 16pro Max";
		m2.price=1.7;
		m2.call();
		m2.message();
		Mobile m3=new Mobile();
		m3.model="Google pixel9";
		m3.price=0.8;
		m3.call();
		m3.message();
		
	}
}