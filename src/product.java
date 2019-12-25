import java.io.IOException;
import java.util.ArrayList;

public class product {
	protected String name;
	String category;
	String price;
	String offer;

	ArrayList<ProductEntity> prodctDatabase = new ArrayList<ProductEntity>();

	public product(String Pname, String Pcategory, String Pprice, String Poffer) throws Exception {
		this.name = Pname;
		this.category = Pcategory;
		this.price = Pprice;
		this.offer = Poffer;

		prodctDatabase = FileUsage.productReadFromFile(prodctDatabase);
	}

	public product() throws Exception {
		prodctDatabase = FileUsage.productReadFromFile(prodctDatabase);
	}


	public void addproductinfo(String pname, String pcategory, String pprice, String poffer) throws IOException {
		for (int i = 0; i < prodctDatabase.size(); ++i) {
			if (prodctDatabase.get(i).getName().equals(pname)) {
				System.out.print("this product is found \n");
				return;
			}

		}

		FileUsage.usingBufferedWritter(pname + "|" + pcategory + "|" + pprice + "|" + poffer, "Products.txt");
		System.out.println("Product is added to system");
	}
}

