
public class Control_Adding_ProductsOfStoreOwner {
	boolean FoundProductSystem;
	boolean FoundBrandSystem;
	boolean FoundStoreSystem;

	public boolean check_product_in_system(String pname, String pcategory, String pprice) throws Exception {
		FoundProductSystem = false;
		for (int i = 0; i < new product().prodctDatabase.size(); ++i) {
			if ((pname.equals(new product().prodctDatabase.get(i).getName()))
					&& (pcategory.equals(new product().prodctDatabase.get(i).getCategory()))
					&& (pprice.equals(new product().prodctDatabase.get(i).getPrice()))) {
				FoundProductSystem = true;

			}
		}
		return FoundProductSystem;
	}

	public boolean check_brand_in_system(String bname, String bcategory) throws Exception {
		FoundBrandSystem = false;
		for (int j = 0; j < new Brand().BrandDatabase.size(); j++) {
			if ((bname.equals(new Brand().BrandDatabase.get(j).getBrandName()))
					&& (bcategory.equals(new Brand().BrandDatabase.get(j).getBrandCategory()))) {
				FoundBrandSystem = true;

			}
		}
		return FoundBrandSystem;
	}

	public boolean check_store(String storeOwnerName, String storename) throws Exception {
		FoundStoreSystem = false;
		for (int j = 0; j < new Store().StoreDatabase.size(); j++) {
			if ((storeOwnerName.equals(new Store().StoreDatabase.get(j).getAccountname()))
					&& (storename.equals(new Store().StoreDatabase.get(j).getname()))) {
				FoundStoreSystem = true;

			}
		}
		return FoundStoreSystem;
	}
}
