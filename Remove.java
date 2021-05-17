import java.util.ArrayList;
import java.util.Scanner;

public class Remove {
	Scanner scan = new Scanner(System.in);
	boolean isDeleted = false;
	Remove(ArrayList<DataShoe> data, int no){
		no -= 1;
		int choose = -1;
		boolean isValid;
		if(no <= 0) {
			System.out.println("No shoes available..");
			System.out.print("Press enter to return...");
			scan.nextLine();
			return;
		}
		
		for (DataShoe dataShoe : data) {
			System.out.println(dataShoe.no + " " + dataShoe.shoeName + "-" + dataShoe.shoeID);
			System.out.println("======================");
			System.out.println("Category: " + dataShoe.shoeCategory);
			System.out.println("Release date: " + dataShoe.date);
			System.out.println("Price: " + dataShoe.price);
			System.out.println();
		}
		
		do {
			isValid = false;
			System.out.print("Choose shoe's number to delete[1.." + no + "]: ");
			try {
				choose = scan.nextInt();
				scan.nextLine();
			}catch(Exception e) {
				scan.nextLine();
				System.out.print("Input must be numeric!!");
				scan.nextLine();
				isValid = true;
			}
			
		}while(choose < 1 || choose > no || isValid);
		
		for (DataShoe userData : data) {
			if(choose == userData.no) {
				data.remove(userData.no-1);
				System.out.print("Shoe removed!!");
				no--;
				scan.nextLine();
				isDeleted = true;
				break;
			}
		}
		
		for (DataShoe userData : data) {
			if(userData.no > choose) {
				userData.no -= 1;
			}
		}
		
	}
}
