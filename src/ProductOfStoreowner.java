import java.util.ArrayList;

import FileUsage.ProductOfStoreownerEntity;
import FileUsage.FileWrite;
import FileUsage.ProductsOfStoreOwnerFileRead;
@SuppressWarnings("unused")
public class ProductOfStoreowner {

	private String storeOwnerName;
	private String storename;
	private String name;
	private String category;
	private String price;
	private String productquantity;
	private String brandname;
	private String brandcategory;

	ArrayList<ProductOfStoreownerEntity> ProductOfStoreownerDatabase = new ArrayList<ProductOfStoreownerEntity>();

	public ProductOfStoreowner(String storeOwnerName, String storename, String Pname, String Pcategory, String Pprice,
			String bname, String bcategory, String productquantity) throws Exception {

		this.storeOwnerName = storeOwnerName;
		this.storename = storename;
		this.name = Pname;
		this.category = Pcategory;
		this.price = Pprice;
		this.productquantity = productquantity;
		this.brandname = bname;
		this.brandcategory = bcategory;

		ProductOfStoreownerDatabase = ProductsOfStoreOwnerFileRead.product_sOwnerReadFromFile(ProductOfStoreownerDatabase,
				"ProductsOfStoreOwner.txt");

	}

	public ProductOfStoreowner() throws Exception {

		ProductOfStoreownerDatabase = ProductsOfStoreOwnerFileRead.product_sOwnerReadFromFile(ProductOfStoreownerDatabase,
				"ProductsOfStoreOwner.txt");

	}

	public void addstoreproductinfo(String storeOwnerName, String storename, String pname, String pcategory,
			String pprice, String bname, String bcategory, String pproductquantity) throws Exception {

		boolean FoundProduct = false;
		boolean FoundBrand = false;
		boolean FoundStore = false;
		FoundProduct = new ControlAddingProductsOfStoreOwner().check_product_in_system(pname, pcategory, pprice);
		FoundBrand = new ControlAddingProductsOfStoreOwner().check_brand_in_system(bname, bcategory);
		FoundStore = new ControlAddingProductsOfStoreOwner().check_store(storeOwnerName, storename);
		if (FoundProduct == false || FoundBrand == false) {
			System.out.println("The Product or Brand is not found in system");
			return;
		}
		if (FoundStore == false) {
			System.out.println("This store is not found! You have entered something wrong.");
			return;
		}
		if (FoundBrand == true & FoundProduct == true & FoundStore == true) {
			for (int i = 0; i < ProductOfStoreownerDatabase.size(); ++i) {
				if (ProductOfStoreownerDatabase.get(i).getName().equals(pname)
						&& ProductOfStoreownerDatabase.get(i).getStoreName().equals(storename)
						&& ProductOfStoreownerDatabase.get(i).getStoreOwnerName().equals(storeOwnerName)
						&& ProductOfStoreownerDatabase.get(i).getBrandName().equals(bname) && bcategory == pcategory) {
					System.out.print("this product is already added with this brand  \n");
					return;
				}
			}
			FileWrite.usingBufferedWritter(storeOwnerName + "|" + storename + "|" + pname + "|" + pcategory + "|"
					+ pprice + "|" + bname + "|" + bcategory + "|" + pproductquantity, "ProductsOfStoreowner.txt");
			System.out.println("Product is added to store with a brand");
		}
	}
}