class Biryani{
	double price;
	Biryani(double price)
	{
		this.price=price;
	}
}
class BiryaniHelper{
	static void displayBiryani(Biryani b)
	{
		System.out.println("price : "+ price);
	}
	static Biryani createBiryani()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter price");
		double price = sc.nextDouble();
		Biryani b = new Biryani(price);
		
		return b;
	}
}
public class Mainclass1{
 public static void main(String[] args)
 {
	Biryani b1=BiryaniHelper.createBiryani();
	BiryaniHelper.displayBiryani(b1);
	
	Biryani b2=BiryaniHelper.createBiryani();
	BiryaniHelper.displayBiryani(b2);
	
	Biryani b3=BiryaniHelper.createBiryani();
	BiryaniHelper.displayBiryani(b3);
	
 }
}