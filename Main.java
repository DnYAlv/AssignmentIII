import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<DataShoe> data = new ArrayList<>();
	static void cls() {
		for(int i = 0 ; i < 30 ; i++) {
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int choose = -1;
		boolean check;
		int no = 1;
		Scanner scan = new Scanner(System.in);
		do {
			check = false;
			cls();
			System.out.println("Shoe Shop");
			System.out.println("=========");
			System.out.println("1. View Shoes");
			System.out.println("2. Add Shoe");
			System.out.println("3. Delete Shoe");
			System.out.println("4. Exit");
			System.out.print(">> ");
			choose = scan.nextInt();
			scan.nextLine();
			if(choose == 1) {
				cls();
				new View(data, no);
				check = true;
			}else if(choose == 2) {
				cls();
				new Add(data, no);
				no++;
				check = true;
			}else if(choose == 3) {
				cls();
				Remove rmv = new Remove(data, no);
				if(rmv.isDeleted)no--;
				check = true;
			}else if(choose == 4) {
				System.out.println("Thank you for using this application!");
				break;
			}
			
		}while(choose < 1 || choose > 4 || check);
		scan.close();
	}

}
