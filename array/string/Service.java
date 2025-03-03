class Service{
	int x;
	double y;
	boolean z;
	
	{
		x=25;
	}
	{
		y=6.47;
	}
	{
		z=false;
	}
	public static void main(String[] args)
	{
		System.out.println("starts");
		Service se=new Service();
		System.out.println(se.x);
		System.out.println(se.y);
		System.out.println(se.z);
		System.out.println("ends");
	}
}