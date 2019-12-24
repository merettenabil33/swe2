import java.util.ArrayList;

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

	public ProductOfStoreowner(String storeOwnerName,String storename, String Pname, String Pcategory, String Pprice, String bname,
			String bcategory, String productquantity) throws Exception {

		this.storeOwnerName = storeOwnerName;
		this.storename = storename;
		this.name = Pname;
		this.category = Pcategory;
		this.price = Pprice;
		this.productquantity = productquantity;
		this.brandname = bname;
		this.brandcategory = bcategory;

		ProductOfStoreownerDatabase = FileUsage.product_sOwnerReadFromFile(ProductOfStoreownerDatabase,"ProductsOfStoreOwner.txt");
		
	}

	public ProductOfStoreowner() throws Exception {

		ProductOfStoreownerDatabase = FileUsage.product_sOwnerReadFromFile(ProductOfStoreownerDatabase,"ProductsOfStoreOwner.txt");
		
	}

	public void addstoreproductinfo(String storeOwnerName,String storename, String pname, String pcategory, String pprice, String bname,
			String bcategory, String pproductquantity) throws Exception {

		boolean FoundProduct = false;
		boolean FoundBrand = false;
		boolean FoundStore = false;
		for (int i = 0; i < new product().prodctDatabase.size(); ++i) {
			if ((pname.equals(new product().prodctDatabase.get(i).getName()))
					&& (pcategory.equals(new product().prodctDatabase.get(i).getCategory()))
					&& (pprice.equals(new product().prodctDatabase.get(i).getPrice()))) {
				FoundProduct = true;

			}
		}
		for (int j = 0; j < new Brand().BrandDatabase.size(); j++) {
			if ((bname.equals(new Brand().BrandDatabase.get(j).getBrandName()))
					&& (bcategory.equals(new Brand().BrandDatabase.get(j).getBrandCategory()))) {
				FoundBrand = true;

			}
		}
		for (int j = 0; j < new Store().StoreDatabase.size(); j++) {
			if ((storeOwnerName.equals(new Store().StoreDatabase.get(j).getAccountname()))
					&& (storename.equals(new Store().StoreDatabase.get(j).getname()))) {
				FoundStore = true;

			}
		}
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
				if (ProductOfStoreownerDatabase.get(i).getName().equals(pname) &&
						ProductOfStoreownerDatabase.get(i).getStoreName().equals(storename) &&
						ProductOfStoreownerDatabase.get(i).getStoreOwnerName().equals(storeOwnerName) &&
						ProductOfStoreownerDatabase.get(i).getBrandName().equals(bname) && bcategory == pcategory) {
					System.out.print("this product is already added with this brand  \n");
					return;
				}
			}
			FileUsage.usingBufferedWritter(storeOwnerName + "|" + storename + "|" + pname + "|" + pcategory + "|" + pprice + "|" + bname
					+ "|" + bcategory + "|" + pproductquantity, "ProductsOfStoreowner.txt");
			System.out.println("Product is added to store with a brand");
		}
	}
}