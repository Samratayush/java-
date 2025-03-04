class sudo1
{
	public static void main (String[]args)
	{
		int n=28;
		int a=1;
		int sum=0;
		
		while(a<=n/2)
		{
         if(n%a==0)			
		   {
			sum=sum+a;
		   }   
		    a++;									
		}
		if(sum==n){
			System.out.println(n+"is a perfect number");
		}
		else{
			System.out.println(n+"is not perfect number");
		}
		
	}
}