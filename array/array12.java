class Array1
{
	public static void main(String[]args)
	{
		double[] arr={7.5,7.0,8.8,6.9};
		double sum=0;
		for (int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		double avg=sum/arr.length;
		System.out.println("Average :"+avg);
	}
}