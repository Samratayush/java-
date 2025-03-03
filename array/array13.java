class Array1
{
	public static void main(String[]args)
	{
		int[] arr={50,62,12,33,91,99};
		int large=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i] >large)
			{
				large=arr[i];
			}
		}
		System.out.println("Largest value:"+large);
	}
}