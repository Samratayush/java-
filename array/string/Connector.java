class Connector
{
	int a;
	char c;
	double b;
	{
		a=53;
	}
	{
		c='A';
	}
	{
		b=5.28;
	}
	public static void main(String[] args)
	{
		System.out.println("program starts");
		Connector obj=new Connector();
		System.out.println(obj.a);
		System.out.println(obj.c);
		System.out.println(obj.b);
		System.out.println("program ends");
	}
}