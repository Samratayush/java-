class square8{
	public static void main(Sting[]args)
	{
		int  n=9;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(i==j || i+j==n-1){
					System.out.print("*"+"");
				}
				else{
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
	}
}