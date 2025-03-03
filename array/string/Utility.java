class Utility
{
	int a;
	{
		a=100;
	}
	public static void main(String[] args)
	{
		System.out.println("program starts");
		
		Utility ref= new Utility();
		System.out.println(ref.a);
		System.out.println("program ends");
	}
}