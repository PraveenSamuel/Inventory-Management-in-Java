import java.util.Scanner;
import java.util.ArrayList;
class Admin{
	private String pName;
	private int pCount,itemsCount;
	private Scanner s = new Scanner(System.in);
	private Database db[];
	private ArrayList<Database> list=new ArrayList<Database>();
	public void addItems(){
		System.out.println("Enter the number of items to store in the inventory");
		itemsCount = s.nextInt();
		db = new Database[itemsCount];
		for(int i=0;i<itemsCount;i++){
			System.out.println("Enter the product name to add it in inventory");
			pName = s.next();
			System.out.println("Enter the product count");
			pCount = s.nextInt();
			db[i] = new Database(pName,pCount);
	 		list.add(db[i]);
		}
	}
	public void checkItems(String pName,int pCount){
		for(int i=0;i<list.size();i++){
			if(list.get(i).getProductName().equals(pName))
			{
				db[i].setProductCount(list.get(i).getProductCount() - pCount);
			}
		}
	}
	public void displayItems(){
		System.out.println("The number of items available in the inventory");
		for(Database d: list){
			System.out.println(d.getProductName());
			System.out.println(d.getProductCount());
		}
	}
}
