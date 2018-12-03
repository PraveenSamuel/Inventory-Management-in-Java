import java.util.Scanner;
class Customer{
	private String pName;
	private int pCount;
	private Scanner s = new Scanner(System.in);
	public void buyItems(Admin admin){
		System.out.println("Enter the product name to buy");
		pName = s.next();
		System.out.println("Enter the product count to buy");
		pCount = s.nextInt();
		admin.checkItems(this.cGetProductName(),this.cGetProductCount());
	}
	public String cGetProductName(){
		return this.pName;
	}
	public int cGetProductCount(){
		return this.pCount;
	}
}
