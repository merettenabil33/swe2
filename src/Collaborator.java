import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import FileUsage.FileWrite;

public class Collaborator {
	StoreOwnerAddProducts add = new StoreOwner();
	SystemUserLogin sl = new SystemUser();

	public Collaborator() throws Exception {
		super();
	}

	@SuppressWarnings("resource")
	public void useAsStoreOwner(int x) throws Exception {
		if (x == 0) {
			Scanner userInput3 = new Scanner(System.in);
			System.out.println("Your userName is :");
			String collaboratorName = userInput3.nextLine();
			System.out.println("Storeowner account is:");
			String StoreOwnerName = userInput3.nextLine();
			System.out.println("Name of Store is:");
			String StoreName = userInput3.nextLine();
			System.out.println("Name of products is:");
			String Pname = userInput3.nextLine();
			System.out.println("Category of products is:");
			String Pcategory = userInput3.nextLine();
			System.out.println("Price of products is:");
			String Pprice = userInput3.nextLine();
			System.out.println("Name of brand is:");
			String Brandname = userInput3.nextLine();
			System.out.println("Category of brand is:");
			String Brandcategory = userInput3.nextLine();
			System.out.println("Quantity of products is:");
			String Pproductquantity = userInput3.nextLine();

			FileWrite
					.usingBufferedWritter(
							collaboratorName + "|" + StoreOwnerName + "|" + StoreName + "|" + Pname + "|" + Pcategory
									+ "|" + Pprice + "|" + Brandname + "|" + Brandcategory + "|" + Pproductquantity,
							"History.txt");

			System.out.println("Changes Sent to the Store Owner...");

		} else if (x == 1) {
			FileReader fr = new FileReader("History.txt");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("ProductsOfStoreowner.txt", true);
			String s;

			while ((s = br.readLine()) != null) { // read a line
				fw.write(s); // write to output file
				fw.flush();

				PrintWriter writer = new PrintWriter("History.txt");
				writer.print("");
				writer.close();
			}
		}
	}

	public void CollaboratoerLogin() throws Exception {

		sl.login(4);
	}

}
