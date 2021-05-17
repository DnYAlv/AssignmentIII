import java.util.ArrayList;
import java.util.Scanner;

public class View {
	Scanner scan = new Scanner(System.in);
	View(ArrayList<DataShoe> data, int no){
		no -= 1;
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
		
		System.out.print("Press enter to continue...");
		scan.nextLine();
	}
}
