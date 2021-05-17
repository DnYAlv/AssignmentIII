import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Add {
	Add(ArrayList<DataShoe> data,int no){
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		String shoeScan, shoeCat;
		String date;
		int endIdx, startIdx, price;
		boolean shoe;
		do {
			System.out.print("Input shoe's name[name ends with shoe, example: \" Fire shoe \"]: ");
			shoeScan = scan.nextLine();
			endIdx = shoeScan.length();
			startIdx = endIdx - 5;
			Pattern pattern = Pattern.compile(" shoe", Pattern.CASE_INSENSITIVE);
		    Matcher matcher = pattern.matcher(shoeScan);
		    shoe = false;
		    while(matcher.find()) {
		    	if(matcher.start() == startIdx && matcher.end() == endIdx) {
		    		shoe = true;
		    	}
		    }
		}while(!shoe || endIdx <= 5);
		
		do {
			System.out.print("Input shoe's category[Sneaker | Running | Boot] (case sensitive): ");
			shoeCat = scan.nextLine();
		}while(!shoeCat.equals("Sneaker") && !shoeCat.equals("Running") && !shoeCat.equals("Boot"));
		
		do {
			System.out.print("Input shoe's release date[dd-mm-yyyy]: ");
			date = scan.nextLine();
		}while(!validateJavaDate(date));
		
		do {
			System.out.print("Input shoe's price[more than or equals to 5000]: ");
			price = scan.nextInt();
			scan.nextLine();
		}while(price < 5000);
		int num1 = rand.nextInt(10);
		int num2 = rand.nextInt(10);
		int num3 = rand.nextInt(10);
		String id = "SH" + num1 + num2 + num3;
		//System.out.println(id);
		data.add(new DataShoe(no,shoeScan,shoeCat, date, price,id));
		System.out.println("Shoe added!");
		System.out.print("Press enter to continue...");
		scan.nextLine();
	}
	
	public static boolean validateJavaDate(String strDate) {
		if (strDate.trim().equals("")){
		    return false;
		}
		else{
		    SimpleDateFormat sdfrmt = new SimpleDateFormat("dd-MM-yyyy");
		    sdfrmt.setLenient(false);
		    try{
		        Date javaDate = sdfrmt.parse(strDate); 
		    }
		    catch (ParseException e){
		        return false;
		    }
		    return true;
		}
	}
}
