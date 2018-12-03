import java.util.ArrayList;
import java.util.Scanner;
public class InventoryManagement{
	public static void main(String[] args){
		int input,count=0,adminNo=0;
		ArrayList<Admin> list = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		while(true){
			System.out.println("Enter 1 to create a new Admin");
			System.out.println("Enter 2 to create a new Customer");
			System.out.println("Enter 3 to exit");
			input = s.nextInt();
			if(input == 1){
				Admin admin = new Admin();
				list.add(admin);
				System.out.println("The Admin is created and the unique number is "+ ++count);
				System.out.println("Enter Items to add in the inventory");
				admin.addItems();
				System.out.println("The Items present in the inventory");
				admin.displayItems();
				continue;
			}
			if(input == 2){
				System.out.println("Enter your Admin unique number");
				adminNo = s.nextInt();
				if(adminNo <= count){
					Customer customer= new Customer();
					customer.buyItems(list.get(adminNo-1));
					list.get(adminNo-1).displayItems();
				}else
					System.out.println("The Admin Doesn't Exists");
				continue;
			}
			if(input == 3)
				System.exit(0);
		}
	}
}
