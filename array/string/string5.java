class Program1
{
	public static void main(String[]args)
	{
		String str ="Engineering";
		
		System.out.println(str.contains("job"));
		System.out.println(str.contains("gin"));
		
		System.out.println(str.startsWith("eng"));
		System.out.println(str.startsWith("Engin"));
		
		System.out.println(str.endsWith("r ing"));
		System.out.println(str.endsWith("ing"));
		
	}
}