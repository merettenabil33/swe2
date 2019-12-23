import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class StoreOwner extends systemUser implements StoreOwnerAddColloborators, StoreOwnerAddProducts, StoreOwnerAddStores, StoreOwnerBuyProducts {
	systemUser s = new systemUser();
	ArrayList<ProductOfStoreownerEntity> historyDatabase = new ArrayList<ProductOfStoreownerEntity>();

	public StoreOwner() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings({ "resource", "unused" })
	public void wantaddstore() throws Exception {

		Scanner userInput2 = new Scanner(System.in);
		System.out.println("Name of store is:");
		String sname = userInput2.nextLine();
		System.out.println("Type of store is:");
		String stype = userInput2.nextLine();
		System.out.println("location of store is:");
		String slocation = userInput2.nextLine();
		System.out.println("Wait for the admin to accept this may take time");
	}

	@SuppressWarnings({ "resource" })
	public void addnewstore() throws Exception {
		Scanner userInput2 = new Scanner(System.in);
		System.out.println("Name of store is:");
		String sname = userInput2.nextLine();
		System.out.println("Your account name is:");
		String saccount = userInput2.nextLine();
		System.out.println("Type of store is:");
		String stype = userInput2.nextLine();
		System.out.println("location of store is:");
		String slocation = userInput2.nextLine();
		new Store().addstoreinfo(sname, saccount, stype, slocation);
	}

	@SuppressWarnings({ "resource" })
	public void addproducttostoreowner() throws Exception {
		Scanner userInput3 = new Scanner(System.in);
		System.out.println("Name of Store owner is:");
		String storeOwnerName = userInput3.nextLine();
		System.out.println("Name of product is:");
		String Pname = userInput3.nextLine();
		System.out.println("Category of product is:");
		String Pcategory = userInput3.nextLine();
		System.out.println("Price of product is:");
		String Pprice = userInput3.nextLine();
		System.out.println("Name of brand is:");
		String Brandname = userInput3.nextLine();
		System.out.println("Category of brand is:");
		String Brandcategory = userInput3.nextLine();
		System.out.println("Quantity of product is:");
		String Pproductquantity = userInput3.nextLine();
		new ProductOfStoreowner().addstoreproductinfo(storeOwnerName, Pname, Pcategory, Pprice,
				Brandname, Brandcategory, Pproductquantity);
	}

	public void wantToAddCollaborator() throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your Username? ");
		System.out.println("StoreOwner username: ");
		String storeOwnerName = input.nextLine();
		System.out.println("Enter the information of your Collaborator ");
		System.out.println("UserName: ");
		String collaboratorName = input.nextLine();
		System.out.println("Password: ");
		String password = input.nextLine();
		System.out.println("Your Collaborator account is added succesfully!");
		FileUsage.usingBufferedWritter(storeOwnerName + "|" + collaboratorName, "storeOwnerCollaborator.txt");
		FileUsage.usingBufferedWritter(storeOwnerName + "|" + collaboratorName + "|" + password, "Collaborator.txt");
	}

	public void storeownerbuyproduct() throws Exception {
		Scanner userInput3 = new Scanner(System.in);
		System.out.println("Your username is:");
		String Uname = userInput3.nextLine();
		System.out.println("Store owner account's name is:");
		String Sname = userInput3.nextLine();
		System.out.println("name of product is:");
		String Pname = userInput3.nextLine();
		System.out.println("amount of products is:");
		String bamount = userInput3.nextLine();
		System.out.println("name of brand is:");
		String bname = userInput3.nextLine();
		System.out.println("price of product is:");
		String pprice = userInput3.nextLine();
		System.out.println("Shipping address is:");
		String shippingaddress = userInput3.nextLine();
		new BuyedProduct().buyproduct(Uname, Sname, Pname, bamount, bname, pprice, shippingaddress);

	}

	@SuppressWarnings({ "resource", "unused" })
	public int collaboratorEdits() throws Exception {
		Collaborator c = new Collaborator();
		Scanner userInput = new Scanner(System.in);
		int check = 0;
		System.out.println("Please Choose what to do with added data? ");
		System.out.println("To Add changes enter 1: ");
		System.out.println("To Edit changes enter 2: ");
		System.out.println("To Remove changes enter 3: ");
		int approve = userInput.nextInt();
		if (approve == 1) {
			check = 1;
			c.checkChanges(1);
		} else if (approve == 2) {
			System.out.println("Enter the new data: ");
			addproducttostoreowner();
		} else
			c.checkChanges(3);
		return 0;
	}

	public void history() throws Exception {
		BufferedReader reader3 = new BufferedReader(new FileReader(new File("History.txt")));
		String line3;
		while ((line3 = reader3.readLine()) != null) {
			String[] arr = line3.split("\\|");
			historyDatabase.add(new ProductOfStoreownerEntity(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6]));
		}
		int i;
		for (i = 0; i < historyDatabase.size(); ++i) {
		}
		System.out.println("Added Products: " + i);
		System.out.println("Added Data is: ");
		BufferedReader br1 = new BufferedReader(new FileReader(new File("History.txt")));
		String line4 = br1.readLine();
		while (line4 != null) {
			String[] arr = line4.split("\\|");
			System.out.println("Store Owner Name is: " + arr[0]);
			System.out.println("Product Name is: " + arr[1]);
			System.out.println("Product Category is: " + arr[2]);
			System.out.println("Product Price is: " + arr[3]);
			System.out.println("Brand Name is: " + arr[4]);
			System.out.println("Brand Category is: " + arr[5]);
			System.out.println("Product Quantity is: " + arr[6]);
			line4 = br1.readLine();
		}
		collaboratorEdits();
	}
}


