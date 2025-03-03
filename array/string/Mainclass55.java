class Email
{
	String from;
	String to;
	void sendEmail()
	{
		System.out.println("Sending Email To : "+to);
	}
	void readEmail()
	{
		System.out.println("Reading Email from : "+from);
	}
}
public static Mainclass55
{
	public static void main(String[] args)
	{
Email e1=new Email();
e1.from="pawan@yahoo.com";
e1.to="keshva@gmail.com";
e1.sendEmail();
e1.readEmail();

Email e2=new Email();
e2.from="abhisek@rediff.com";
e2.to="soumya@gmail.com";
e2.sendEmail();
e2.readEmail();

	}
}
