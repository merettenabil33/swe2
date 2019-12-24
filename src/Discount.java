
public class Discount {
	public boolean User_already_exist(String uname) throws Exception {
		boolean FoundUser = false;
		for (int i = 0; i < new BuyedProduct().BuyedProductDatabase.size(); i++) { // user already exists
			if (uname.equals(new BuyedProduct().BuyedProductDatabase.get(i).getUserName())) {
				FoundUser = true;
			}
		}
		return FoundUser;
	}

	public void User_Is_Storeowner(String uname, String pprice, String bamount) throws Exception {
		Integer num1 = Integer.valueOf(bamount);
		boolean Found;
		Found = User_already_exist(uname);
		if (num1 != 2 && Found == true) { // law store owner we bas
			System.out.println("Congratulations 15% off buying as store owner!!");
			double s1;
			Integer price1 = Integer.valueOf(pprice);
			s1 = price1 - (0.15 * Double.valueOf(pprice));
			pprice = (Double.toString(s1));
		} else if (num1 == 2 && Found == true) { // law store owner and buy 2 items
			System.out.println("Congratulations 25% off buying 2 items as store owner!!");
			double s2;
			Integer price2 = Integer.valueOf(pprice);
			s2 = price2 - (0.25 * Double.valueOf(pprice));
			pprice = (Double.toString(s2));
		} else if (Found == false && num1 != 2) { // law store owner we buy first time
			System.out.println("Congratulations 20% off on your first order as store owner!!");
			double s3;
			Integer price3 = Integer.valueOf(pprice);
			s3 = price3 - (0.20 * Double.valueOf(pprice));
			pprice = (Double.toString(s3));
		} else if (Found == false && num1 == 2) { // law store owner we buy first time we buy 2 items
			System.out.println("Congratulations 30% off on your first order as store owner buying 2 items!!");
			double s3;
			Integer price3 = Integer.valueOf(pprice);
			s3 = price3 - (0.30 * Double.valueOf(pprice));
			pprice = (Double.toString(s3));
		}
	}

	public void User_Is_User(String uname, String bamount, String pprice) throws Exception {
		Integer num1 = Integer.valueOf(bamount);
		boolean Found;
		Found = User_already_exist(uname);
		if (num1 == 2 && Found == true) { // law buy 2 items
			System.out.println("Congratulations 10% off as you bought 2 items!!");
			double s;
			Integer price = Integer.valueOf(pprice);
			s = price - (0.10 * Double.valueOf(pprice));
			pprice = (Double.toString(s));
		} else if (Found == false && num1 != 2) { // law buy first time
			System.out.println("Congratulations 5% off as it was your first order!!");
			double s;
			Integer price = Integer.valueOf(pprice);
			s = price - (0.05 * Double.valueOf(pprice));
			pprice = Double.toString(s);
		} else if (num1 == 2 && Found == false) { // law buy 2 items first time
			System.out.println("Congratulations 15% off, buying 2 items as the first order!!");
			double s;
			Integer price = Integer.valueOf(pprice);
			s = price - (0.15 * Double.valueOf(pprice));
			pprice = (Double.toString(s));
		}
	}
}
