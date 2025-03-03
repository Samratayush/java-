class Program4
{
 public static void main(String[]args)
 {
	 String str="Developer";
	 System.out.println(str.indexOf('l'));
	 System.out.println(str.indexOf('p'));
	 System.out.println(str.indexOf('q'));
	 
	 int occ=str.indexOf('e');
	 while(occ!=-1)
	 {
		 System.out.println(occ);
		 occ=str.indexOf('e',occ+1);
	 }
	 
 }
}
