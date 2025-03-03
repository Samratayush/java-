class Alpha
{
	static int num;
	static{
		num=30;
	}
	static{
		num=60;
	}
	static{
		num=90;
	}
	public static void main(String[] args)
	{
		System.out.println("program starts");
		System.out.println(Alpha.num);
		System.out.println("program ends");
	}
}