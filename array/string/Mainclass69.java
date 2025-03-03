class Demo
{
	int val;
	void test()
	{
		System.out.println("executing test()...");
	}
}
public class Mainclass69
{
	public static void main(String[] args)
	{
		Demo ref=new Demo();
		System.out.println(ref.val);
		ref.test();
	}
}