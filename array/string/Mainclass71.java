class Alpha
{
	int x;
	double y;
	char z;
	Alpha()
	{
		System.out.println("Alpha() Constructor");
		x=100;
		y=21.56;
		x='J';
	}
}
public class Mainclass71
{
	public static void main(String[] args)
	{
		Alpha a1=new Alpha();
		System.out.println(a1.x);
		System.out.println(a1.y);
		System.out.println(a1.z);
	}
}