class Array1
{
	public static void main(String[]args)
	{
		int[] arr={14,13,15,12,10,18};
		
		int sum=0;
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				
			sum =sum+arr[i];
			}
		}
		System.out.println("odd sum:"+sum);
	}
}