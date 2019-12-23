import java.util.Scanner;

public class Collaborator {
	StoreOwner sO = new StoreOwner();
	StoreOwnerAddProducts add = new StoreOwner();
	systemUser s = new systemUser();

	public Collaborator() throws Exception {
		super();
	}

	@SuppressWarnings("resource")
	public void useAsStoreOwner() throws Exception {

		Scanner userInput3 = new Scanner(System.in);
		System.out.println("name of Storeowner is:");
		String StoreOwnerName = userInput3.nextLine();
		System.out.println("name of products is:");
		String Pname = userInput3.nextLine();
		System.out.println("category of products is:");
		String Pcategory = userInput3.nextLine();
		System.out.println("price of products is:");
		String Pprice = userInput3.nextLine();
		System.out.println("name of brand is:");
		String Brandname = userInput3.nextLine();
		System.out.println("category of brand is:");
		String Brandcategory = userInput3.nextLine();
		System.out.println("Quantity of products is:");
		String Pproductquantity = userInput3.nextLine();

		FileUsage.usingBufferedWritter(StoreOwnerName + "|" + Pname + "|" + Pcategory + "|" + Pprice + "|" + Brandname
				+ "|" + Brandcategory + "|" + Pproductquantity, "History.txt");

		System.out.println("Changes Sent to the Store Owner...");
	}

	public void checkChanges(int check) throws Exception {
		if (check == 1) {
			System.out.println("StoreOwner Accepted Adding..");
			System.out.println("Please re-enter data:");
			Scanner userInput3 = new Scanner(System.in);
			System.out.println("name of Storeowner is:");
			String StoreOwnerName = userInput3.nextLine();
			System.out.println("name of products is:");
			String Pname = userInput3.nextLine();
			System.out.println("category of products is:");
			String Pcategory = userInput3.nextLine();
			System.out.println("price of products is:");
			String Pprice = userInput3.nextLine();
			System.out.println("name of brand is:");
			String Brandname = userInput3.nextLine();
			System.out.println("category of brand is:");
			String Brandcategory = userInput3.nextLine();
			System.out.println("Quantity of products is:");
			String Pproductquantity = userInput3.nextLine();

			FileUsage.usingBufferedWritter(StoreOwnerName + "|" + Pname + "|" + Pcategory + "|" + Pprice + "|"
					+ Brandname + "|" + Brandcategory + "|" + Pproductquantity, "ProductsOfStoreOwner.txt");

		} else if (check == 3)
			System.out.println("Sorry! StoreOwner Declined your changes...");
	}

	public void CollaboratoerLogin() throws Exception {

		s.login(4);
	}

}

