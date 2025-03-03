class Employee
{
	int eid;
	double ctc;
	void work()
	{
		System.out.println(eid+ " is working for "+ctc);
	}
	void meeting()
	{
	    System.out.println(eid+" is in meeting");
	}
}
public class Mainclass22
{
	public static void main(String[] args)
	{
		Employee e1=new Employee();
		e1.eid=101;
		e1.ctc=3.5;
		e1.work();
		e1.meeting();
		Employee e2=new Employee();
		e2.eid=102;
		e2.ctc=4.5;
		e2.work();
		e2.meeting();
	}
}