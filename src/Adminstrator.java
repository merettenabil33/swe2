import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Adminstrator extends systemUser implements Admin {
	public Adminstrator() throws Exception {
		super();
	}

	@SuppressWarnings("resource")
	public void addproducttosystem() throws Exception {
		Scanner userInput2 = new Scanner(System.in);
		System.out.println("name of products is:");
		String Pname = userInput2.nextLine();
		System.out.println("category of products is:");
		String Pcategory = userInput2.nextLine();
		System.out.println("price of products is:");
		String Pprice = userInput2.nextLine();
		System.out.println("offer on products is:");
		String Poffer = userInput2.nextLine();
		new product().addproductinfo(Pname, Pcategory, Pprice, Poffer);
	}

	boolean check = true;

	@SuppressWarnings("resource")
	public boolean AcceptStore() {
		System.out.println("Do you want to add this store to storeOwner enter 1 if no enter 2");
		Scanner request = new Scanner(System.in);
		int admin_choice = request.nextInt();
		if (admin_choice == 1) {
			return check;
		}
		check = false;
		return check;
	}

	@SuppressWarnings("resource")
	public void addBrandtosystem() throws Exception {
		Scanner userInput2 = new Scanner(System.in);
		System.out.println("name of Brands is:");
		String name = userInput2.nextLine();
		System.out.println("category of Brands is:");
		String category = userInput2.nextLine();
		new Brand().addBrandinfo(name, category);
	}

	@SuppressWarnings("resource")
	public void addnewstatistics() throws IOException {

		ArrayList<UserEntity> numUsers = new ArrayList<UserEntity>();
		BufferedReader reader1 = new BufferedReader(new FileReader(new File("UserAccounts.txt")));
		String line1;
		while ((line1 = reader1.readLine()) != null) {
			String[] arr = line1.split("\\|");
			numUsers.add(new UserEntity(arr[0], arr[1]));
		}
		int j;
		for (j = 0; j < numUsers.size(); ++j) {
		}
		System.out.println("Number of users register: " + j);

		ArrayList<UserEntity> numStoreOwners = new ArrayList<UserEntity>();
		BufferedReader reader2 = new BufferedReader(new FileReader(new File("StoreOwnerAccounts.txt")));
		String line2;
		while ((line2 = reader2.readLine()) != null) {
			String[] arr1 = line2.split("\\|");
			numStoreOwners.add(new UserEntity(arr1[0], arr1[1]));
		}
		int k;
		for (k = 0; k < numStoreOwners.size(); ++k) {
		}
		System.out.println("Number of storeOwners register: " + k);

		ArrayList<ProductEntity> products = new ArrayList<ProductEntity>();
		BufferedReader reader3 = new BufferedReader(new FileReader(new File("Products.txt")));
		String line3;
		while ((line3 = reader3.readLine()) != null) {
			String[] arr = line3.split("\\|");
			products.add(new ProductEntity(arr[0], arr[1], arr[2], arr[3]));
		}
		int i;
		for (i = 0; i < products.size(); ++i) {
		}
		System.out.println("Number of products: " + i);
		System.out.println("Products & Offers ]::::");
		BufferedReader br1 = new BufferedReader(new FileReader(new File("Products.txt")));
		String line4 = br1.readLine();
		while (line4 != null) {
			String[] arr = line4.split("\\|");
			System.out.println(arr[0] + " " + arr[3]);
			line4 = br1.readLine();
		}
	}

}