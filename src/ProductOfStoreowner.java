import java.util.ArrayList;

@SuppressWarnings("unused")
public class ProductOfStoreowner {

	private String storeOwnerName;
	private String name;
	private String category;
	private String price;
	private String productquantity;
	private String brandname;
	private String brandcategory;

	ArrayList<ProductOfStoreownerEntity> ProductOfStoreownerDatabase = new ArrayList<ProductOfStoreownerEntity>();

	public ProductOfStoreowner(String storeOwnerName, String Pname, String Pcategory, String Pprice, String bname,
			String bcategory, String productquantity) throws Exception {

		this.storeOwnerName = storeOwnerName;
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

	public void addstoreproductinfo(String storeOwnerName, String pname, String pcategory, String pprice, String bname,
			String bcategory, String pproductquantity) throws Exception {

		boolean FoundinSystem1 = false;
		boolean FoundinSystem2 = false;
		for (int i = 0; i < new product().prodctDatabase.size(); ++i) {
			if ((pname.equals(new product().prodctDatabase.get(i).getName()))
					&& (pcategory.equals(new product().prodctDatabase.get(i).getCategory()))
					&& (pprice.equals(new product().prodctDatabase.get(i).getPrice()))) {
				FoundinSystem1 = true;

			}
		}
		for (int j = 0; j < new Brand().BrandDatabase.size(); j++) {
			if ((bname.equals(new Brand().BrandDatabase.get(j).getBrandName()))
					&& (bcategory.equals(new Brand().BrandDatabase.get(j).getBrandCategory()))) {
				FoundinSystem2 = true;

			}
		}
		if (FoundinSystem1 == false || FoundinSystem2 == false) {
			System.out.println("The Product or Brand is not found in system");
			return;
		}
		if (FoundinSystem1 == true & FoundinSystem2 == true) {
			for (int i = 0; i < ProductOfStoreownerDatabase.size(); ++i) {
				if (ProductOfStoreownerDatabase.get(i).getName().equals(pname)
						& ProductOfStoreownerDatabase.get(i).getBrandName().equals(bname) & bcategory == pcategory) {
					System.out.print("this product is already added with this brand  \n");
					return;
				}
			}
			FileUsage.usingBufferedWritter(storeOwnerName + "|" + pname + "|" + pcategory + "|" + pprice + "|" + bname
					+ "|" + bcategory + "|" + pproductquantity, "ProductsOfStoreowner.txt");
			System.out.println("Product is added to store with a brand");
		}
	}
}