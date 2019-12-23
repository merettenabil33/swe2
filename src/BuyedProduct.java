import java.util.ArrayList;

public class BuyedProduct {
	private String username;
	private String storeownername;
	private String productname;
	protected String amount;
	private String bname;
	private String pprice;
	private String shippingaddress;
	ArrayList<BuyedProductEntity> BuyedProductDatabase = new ArrayList<BuyedProductEntity>();

	public BuyedProduct(String uname,String storeownername, String Pname, String bamount, String bname, String price, String address)
			throws Exception {
		this.username = uname;
		this.storeownername=storeownername;
		this.productname = Pname;
		this.amount = bamount;
		this.bname = bname;
		this.pprice = price;
		this.shippingaddress = address;

		BuyedProductDatabase = FileUsage.buyed_productReadFromFile(BuyedProductDatabase);
	}

	public BuyedProduct() throws Exception {

		BuyedProductDatabase = FileUsage.buyed_productReadFromFile(BuyedProductDatabase);
	}

	public void buyproduct(String uname, String storeownername ,String pname, String bamount, String bname, String pprice,
		String shippingaddress) throws Exception {
		boolean FoundinSystem2 = false;
		boolean FoundinSystem3 = false;
		boolean FoundinSystem4 = false;
		boolean FoundinSystem5 = false;
		boolean Found = false;
		Integer num1 = 0;
		Integer num2 = 0;
		Integer num3 = 0;
		String remain;
		for (int i = 0; i < new ProductOfStoreowner().ProductOfStoreownerDatabase.size(); i++) {
			num1 = Integer.valueOf(bamount);
			num2 = Integer.valueOf(new ProductOfStoreowner().ProductOfStoreownerDatabase.get(i).getProductQuantity());
			if (num1 <= num2) {
				FoundinSystem3 = true;
			}
		}
		
		for (int i = 0; i < 1000000; i++) {
			if (uname.equals(new systemUser().userDatabase.get(i).getUsername())) {
				FoundinSystem2 = true;
				break;
			} else if (uname.equals(new systemUser().StoreODatabase.get(i).getUsername()) && 
					storeownername !=(new ProductOfStoreowner().ProductOfStoreownerDatabase.get(i).getStoreOwnerName())) {
				FoundinSystem5 = true;
				break;
			}
		}

		for (int i = 0; i < new ProductOfStoreowner().ProductOfStoreownerDatabase.size(); i++) {
			if (storeownername.equals(new ProductOfStoreowner().ProductOfStoreownerDatabase.get(i).getStoreOwnerName()) &&
					pname.equals(new ProductOfStoreowner().ProductOfStoreownerDatabase.get(i).getName())  
					&& bname.equals(new ProductOfStoreowner().ProductOfStoreownerDatabase.get(i).getBrandName())
					&& pprice.equals(new ProductOfStoreowner().ProductOfStoreownerDatabase.get(i).getPrice())) {
				FoundinSystem4 = true;
			}
		}
		if (FoundinSystem2 == false) {
			System.out.println("The user accout name  is not available");
		}
		if (FoundinSystem5 == false) {
			System.out.println("The store owner accout name is not available");
		}
		if (FoundinSystem3 == false) {
			System.out.println("The amount is not available");
		}
		if (FoundinSystem4 == false) {
			System.out.println("The product or band is not available");
		}
		if (FoundinSystem3 == true && FoundinSystem4 == true && (FoundinSystem2 == true || FoundinSystem5 == true)) {
			for (int i = 0; i < BuyedProductDatabase.size(); i++) { // user already exists
				if (uname.equals(BuyedProductDatabase.get(i).getUserName())) {
					Found = true;
				}
			}

			if (FoundinSystem5 == true) { // store owner case
				if (num1 != 2 && Found == true) { // law store owner we bas
					System.out.println("the price of bought product is  15% off");
					double s1;
					Integer price1 = Integer.valueOf(pprice);
					s1 = price1 - (0.15 * Double.valueOf(pprice));
					pprice = (Double.toString(s1));
				} else if (num1 == 2 && Found == true) { // law store owner and buy 2 items
					System.out.println("the price of bought product is  25% off");
					double s2;
					Integer price2 = Integer.valueOf(pprice);
					s2 = price2 - (0.25 * Double.valueOf(pprice));
					pprice = (Double.toString(s2));
				} else if (Found == false && num1 != 2) { // law store owner we buy first time
					System.out.println("the price of bought product is  20% off");
					double s3;
					Integer price3 = Integer.valueOf(pprice);
					s3 = price3 - (0.20 * Double.valueOf(pprice));
					pprice = (Double.toString(s3));
				} else if (Found == false && num1 == 2) { // law store owner we buy first time we buy 2 items
					System.out.println("the price of bought product is  30% off");
					double s3;
					Integer price3 = Integer.valueOf(pprice);
					s3 = price3 - (0.30 * Double.valueOf(pprice));
					pprice = (Double.toString(s3));
				}
			

			}
			if (FoundinSystem2 == true) { // law user
				if (num1 == 2 && Found == true) { // law buy 2 items
					System.out.println("the price of bought product if user buy 2 items of it will be 10% off");
					double s;
					Integer price = Integer.valueOf(pprice);
					s = price - (0.10 * Double.valueOf(pprice));
					pprice = (Double.toString(s));
				} else if (Found == false && num1 != 2) { // law buy first time
					System.out.println(
							"the price of bought product if it is the first time for user to buy product 5% off");
					// pprice=0.05*Integer.parseInt(pprice);
					double s;
					Integer price = Integer.valueOf(pprice);
					s = price - (0.05 * Double.valueOf(pprice));
					pprice = Double.toString(s);
					// return;
				} else if (num1 == 2 && Found == false) { // law buy 2 items first time
					System.out.println("the price of bought product 15% off");
					double s;
					Integer price = Integer.valueOf(pprice);
					s = price - (0.15 * Double.valueOf(pprice));
					pprice = (Double.toString(s));
					// return;
				}
			}
			if (Found == true) { // law is not the first time
				System.out.println("You previously have bought a product ");
			}
			FileUsage.usingBufferedWritter(uname + "|" + storeownername  + "|" + pname + "|" + bamount + "|" + bname + "|" + pprice + "|" + shippingaddress,
					"BuyedProduct.txt");
			new numberOfBoughtProducts().numberof_addedProducts();
			System.out.println("Product is added to card");
		}
	}

}

