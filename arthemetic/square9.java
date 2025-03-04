class square8{
	public static void main(Sting[]args)
	{
		int  n=5;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				//if(i==0 || j==0 || i==n/2 || j==n/2 || i==n-1 || j==n-1)
				//if(i==j || i+j==n-1)
					//if(i==0 || i==4 ||  i==j || i+j==n-1)
						if(i%2==0){
							if(j%2==0) {
							System.out.print(1+" ");}
							else
				{
					System.out.print(0+" ");
				}
						}
				else{
					if(j%2==0)
					System.out.print(0+" ");
				
				else{
					System.out.print(1+" ");
				}
			}
			}
			System.out.println();
		}
	}
}