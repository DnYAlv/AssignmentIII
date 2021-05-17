import java.util.Date;

public class DataShoe {
	String shoeName;
	String shoeCategory;
	String shoeID;
	int price,no;
	String date;
	
	DataShoe(int no, String shoeName, String shoeCategory, String date, int price, String shoeID){
		this.no = no;
		this.shoeName = shoeName;
		this.shoeCategory = shoeCategory;
		this.date = date;
		this.price = price;
		this.shoeID = shoeID;
	}
}
