class Account
{
	long accountNumber;
	double accountBalance;
	void withdraw(double amt)
	{
		System.out.println("Withdraw from : "+accountNumber);
		accountBalance=accountBalance-amt;
		System.out.println("Available Balance : "+accountBalance);
	}
	void deposit(double amt)
	{
		System.out.println("Deposite to : "+accountNumber);
		accountBalance=accountBalance+amt;
		System.out.println("Available Balance : "+accountBalance);
	}
}
public class Mainclass44{
	{
		public static void main(String[] args)
		{
		 Account a1 =new Account();
		 a1.accountNumber=12345678998745L;
		 a1.accountBalance=10000.0;
		 a1.withdraw(1000.0);
		 a1.deposit(4000.0);
		  Account a2 =new Account();
		 a2.accountNumber=12345678958745L;
		 a2.accountBalance=12000.0;
		 a2.withdraw(2000.0);
		 a2.deposit(6000.0);
		 }
	}