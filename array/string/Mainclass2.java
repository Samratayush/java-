class Sample
{
	static int x=45;
	static char='J';
	static void play()
	{
		System.out.println("executing play().....");
	}
	static void disp()
	{
		System.out.println("executing disp()")
	}
}
public class Mainclass2
{
	public static void main(String[] args)
	{
	System.out.println(sample.x);
	System.out.println(sample.y);
	Sample.play();
	Sample.disp();
	}
}