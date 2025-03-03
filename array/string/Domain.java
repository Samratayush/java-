class Domain
{
	char c;
	{
		c='a';
	}
	{
		c='b';
	}
	{
		c='c';
	}
	public static void main(String[] args)
	{
		System.out.println("starts");
		Domain obj=new Domain();
		System.out.println(obj.c);
		System.out.println("ends");
	}
}