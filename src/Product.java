import java.io.IOException;
import java.util.ArrayList;

import FileUsage.ProductEntity;
import FileUsage.FileWrite;
import FileUsage.ProductsFileRead;

public class Product {
	protected String name;
	String category;
	String price;
	String offer;

	ArrayList<ProductEntity> prodctDatabase = new ArrayList<ProductEntity>();

	public Product(String Pname, String Pcategory, String Pprice, String Poffer) throws Exception {
		this.name = Pname;
		this.category = Pcategory;
		this.price = Pprice;
		this.offer = Poffer;

		prodctDatabase = ProductsFileRead.productReadFromFile(prodctDatabase);
	}

	public Product() throws Exception {
		prodctDatabase = ProductsFileRead.productReadFromFile(prodctDatabase);
	}


	public void addproductinfo(String pname, String pcategory, String pprice, String poffer) throws IOException {
		for (int i = 0; i < prodctDatabase.size(); ++i) {
			if (prodctDatabase.get(i).getName().equals(pname)) {
				System.out.print("this product is found \n");
				return;
			}

		}

		FileWrite.usingBufferedWritter(pname + "|" + pcategory + "|" + pprice + "|" + poffer, "Products.txt");
		System.out.println("Product is added to system");
	}
}

