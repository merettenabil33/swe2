import java.util.ArrayList;

import FileUsage.BuyedProductEntity;
import FileUsage.buyedProductsFileRead;
import FileUsage.fileWrite;

@SuppressWarnings("unused")
public class BuyedProduct {
	private String username;
	private String storename;
	private String productname;
	protected String amount;
	private String bname;
	private String pprice;
	private String shippingaddress;
	ArrayList<BuyedProductEntity> BuyedProductDatabase = new ArrayList<BuyedProductEntity>();

	public BuyedProduct(String uname,String storename, String Pname, String bamount, String bname, String price, String address)
			throws Exception {
		this.username = uname;
		this.storename=storename;
		this.productname = Pname;
		this.amount = bamount;
		this.bname = bname;
		this.pprice = price;
		this.shippingaddress = address;

		BuyedProductDatabase = buyedProductsFileRead.buyed_productReadFromFile(BuyedProductDatabase);
	}

	public BuyedProduct() throws Exception {

		BuyedProductDatabase = buyedProductsFileRead.buyed_productReadFromFile(BuyedProductDatabase);
	}

	public void buyproduct(String uname, String storename ,String pname, String bamount, String bname, String pprice,
		String shippingaddress) throws Exception {
		boolean FoundingStoreowner;
		boolean AmountValid;
		boolean ProductIsValid;
		boolean FoundingUser;
		boolean FoundingStore;
		AmountValid=new check_product_validation().Is_Amount_Valid(bamount);
		FoundingStore=new check_user_input().check_store(storename);
		FoundingUser=new check_user_input().check_user_account(uname);
		FoundingStoreowner=new check_user_input().check_storeowner_account(uname);
		ProductIsValid=new check_product_validation().Is_Product_Valid(storename,bname,pname,pprice);
		if (FoundingUser== false && FoundingStoreowner==false) {
			System.out.println("The  accout name  is wrong");
		}
		if (AmountValid == false) {
			System.out.println("The amount is not available");
		}
		if (ProductIsValid == false) {
			System.out.println("You have entered something wrong the storeowner account or the product or the brand ");
		}
		if (AmountValid == true && ProductIsValid == true &&
				  (FoundingUser == true || FoundingStoreowner==true)) {
		
            boolean Found=new Discount().User_already_exist(uname);
			if (FoundingStoreowner == true) { // store owner case
				pprice=new Discount().User_Is_Storeowner(uname, pprice, bamount);
			}
			if (FoundingUser == true) { // law user
				pprice=new Discount().User_Is_User(uname, bamount, pprice);
			}
			if (Found == true) { // law is not the first time
				System.out.println("You previously have bought a product, You miss our 5% off on first order!! ");
			}
			fileWrite.usingBufferedWritter(uname + "|" + storename  + "|" + pname + "|" + bamount + "|" + bname + "|" + pprice + "|" + shippingaddress,
					"BuyedProduct.txt");
			new numberOfBoughtProducts().numberof_addedProducts();
			System.out.println("Product is added to card");
		}
	}

}